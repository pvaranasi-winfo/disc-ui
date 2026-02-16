import { api } from './api';
import type { DashboardResponse, Environment } from '../types/dashboard.types';

export const dashboardApi = {
    fetchDashboardData: async (env: Environment): Promise<DashboardResponse> => {
        const response = await api.get(`/dashboard/discovery?env=${env}`);
        return response as DashboardResponse;
    },
};
