import { api } from './api';
import type { DashboardResponse, Environment } from '../types/dashboard.types';

export const dashboardApi = {
    fetchDashboardData: async (env: Environment): Promise<DashboardResponse> => {
        const env1 = "0f9eef88-c2b4-4bc3-8204-8e7b44925d9e"
        //console.log(env);
        const response = await api.get(`/Root/${env1}`);
        return response as DashboardResponse;
    },
};
