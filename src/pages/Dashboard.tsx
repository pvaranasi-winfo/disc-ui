import { useState, useEffect } from 'react';
import { DashboardHeader } from '../components/DashboardHeader';
import { SummaryCards } from '../components/SummaryCards';
import { ComponentCard } from '../components/ComponentCard';
import { JiraTickets } from '../components/JiraTickets';
import { GithubIssues } from '../components/GithubIssues';
import { DocumentationLinks } from '../components/DocumentationLinks';
// import { dashboardApi } from '../services/dashboardApi';
import type { DashboardResponse, Environment } from '../types/dashboard.types';

// Dummy data matching the new API response structure
const getDummyData = (env: Environment): DashboardResponse => ({
    id: `unique-guid-${env.toLowerCase()}-${Date.now()}`,
    environment: env === 'DEV' ? 'Dev' : env === 'UAT' ? 'UAT' : 'Prod',
    scanTimestamp: new Date().toISOString(),
    runId: `agent-run-${env.toLowerCase()}-123`,
    summaryMetrics: {
        healthScore: 94,
        criticalCount: 0,
        upgradeCount: 1
    },
    components: [
        {
            name: "Oracle Database",
            type: "Database",
            currentVersion: "19.21.0.0.0",
            status: "Active",
            subComponents: [
                {
                    name: "Oracle APEX",
                    version: "23.2.0"
                }
            ]
        },
        {
            name: "WinfoTest Application",
            type: "Application",
            currentVersion: "2.4.5",
            status: "Upgrade Available"
        }
    ],
    insights: {
        jiraTickets: [
            {
                id: "WINFO-442",
                title: "Upgrade DB",
                priority: "High",
                description: "The current Tokyo region does not support OCI Gen-AI. We need to configure the Autonomous Database to call the London (LHR) endpoint for NL2SQL services."
            }
        ],
        github: [
            {
                id: "10455",
                summary: "Configure Cross-Region Gen-AI Bridge (Tokyo to London)",
                description: "The current Tokyo region does not support OCI Gen-AI. We need to configure the Autonomous Database to call the London endpoint.",
                tag: "infra"
            }
        ],
        docs: [
            {
                title: "Upgrade Guide",
                url: "https://docs.company.com/upgrade-guide",
                description: "Upgrading document",
                folderName: "Upgrade"
            }
        ]
    }
});

export function Dashboard() {
    const [environment, setEnvironment] = useState<Environment>('DEV');
    const [dashboardData, setDashboardData] = useState<DashboardResponse | null>(null);
    const [loading, setLoading] = useState(true);
    // const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        fetchDashboardData();
    }, [environment]);

    const fetchDashboardData = async () => {
        setLoading(true);
        setTimeout(() => {
            const data = getDummyData(environment);
            setDashboardData(data);
            setLoading(false);
        }, 500);
    };

    const handleEnvironmentChange = (env: Environment) => {
        setEnvironment(env);
    };

    if (loading) {
        return (
            <div className="dashboard-container min-h-screen flex items-center justify-center">
                <div className="text-center">
                    <i className="pi pi-spin pi-spinner text-4xl text-cyan-400 mb-4"></i>
                    <p className="text-slate-400">Loading dashboard data...</p>
                </div>
            </div>
        );
    }

    // if (error) {
    //     return (
    //         <div className="dashboard-container min-h-screen flex items-center justify-center">
    //             <div className="text-center">
    //                 <i className="pi pi-exclamation-circle text-4xl text-red-500 mb-4"></i>
    //                 <p className="text-white text-lg mb-2">Error loading dashboard</p>
    //                 <p className="text-slate-400 mb-4">{error}</p>
    //                 <button
    //                     onClick={fetchDashboardData}
    //                     className="env-button active"
    //                 >
    //                     <i className="pi pi-refresh mr-2"></i>
    //                     Retry
    //                 </button>
    //             </div>
    //         </div>
    //     );
    // }

    if (!dashboardData) {
        return null;
    }

    return (
        <div className="dashboard-container min-h-screen p-8">
            <div className="max-w-7xl mx-auto">
                <DashboardHeader
                    environment={environment}
                    onEnvironmentChange={handleEnvironmentChange}
                    onRefresh={fetchDashboardData}
                    lastScan={dashboardData.scanTimestamp}
                    runId={dashboardData.runId}
                />

                <SummaryCards
                    summary={dashboardData.summaryMetrics}
                    componentCount={dashboardData.components.length}
                />

                <div className="grid grid-cols-1 lg:grid-cols-3 gap-6">
                    <div className="lg:col-span-2">
                        <h2 className="text-lg font-semibold text-white mb-4">Detected Components</h2>
                        {dashboardData.components.map((component, index) => (
                            <ComponentCard key={index} component={component} />
                        ))}
                    </div>

                    <div>
                        <JiraTickets tickets={dashboardData.insights.jiraTickets} />
                        <GithubIssues issues={dashboardData.insights.github} />
                        <DocumentationLinks documentation={dashboardData.insights.docs} />
                    </div>
                </div>
            </div>
        </div>
    );
}
