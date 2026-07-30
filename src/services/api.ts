// API service using environment variables
const API_BASE_URL = import.meta.env.VITE_BACKEND_API_URL || 'http://localhost:3000/api';

const TIMEOUT_DURATION = 10000; // 10 seconds

export const api = {
  get: async (endpoint: string) => {
    const controller = new AbortController();
    const id = setTimeout(() => controller.abort(), TIMEOUT_DURATION);
    const response = await fetch(`${API_BASE_URL}${endpoint}`, { signal: controller.signal });
    clearTimeout(id);
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    return response.json();
  },

  post: async (endpoint: string, data: any) => {
    const controller = new AbortController();
    const id = setTimeout(() => controller.abort(), TIMEOUT_DURATION);
    const response = await fetch(`${API_BASE_URL}${endpoint}`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(data),
      signal: controller.signal,
    });
    clearTimeout(id);
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    return response.json();
  },

  put: async (endpoint: string, data: any) => {
    const controller = new AbortController();
    const id = setTimeout(() => controller.abort(), TIMEOUT_DURATION);
    const response = await fetch(`${API_BASE_URL}${endpoint}`, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(data),
      signal: controller.signal,
    });
    clearTimeout(id);
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    return response.json();
  },

  delete: async (endpoint: string) => {
    const controller = new AbortController();
    const id = setTimeout(() => controller.abort(), TIMEOUT_DURATION);
    const response = await fetch(`${API_BASE_URL}${endpoint}`, {
      method: 'DELETE',
      signal: controller.signal,
    });
    clearTimeout(id);
    if (!response.ok) {
      throw new Error(`HTTP error! status: ${response.status}`);
    }
    return response.json();
  },
};