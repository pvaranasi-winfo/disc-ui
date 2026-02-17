import { api } from './api';
import type { DashboardResponse } from '../types/dashboard.types';

export const dashboardApi = {
    fetchDashboardData: async (env: any): Promise<DashboardResponse> => {
        
        //console.log(env);
        const response = await api.get(`/Root/${env}`);
        return response as DashboardResponse;
    },
};
