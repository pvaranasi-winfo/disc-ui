import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import path from 'path'
import { viteStaticCopy } from 'vite-plugin-static-copy'

// https://vite.dev/config/
export default defineConfig({
  envDir: 'environments',
  plugins: [
    react(),
    viteStaticCopy({
      targets: [
        {
          src: 'node_modules/primeicons/fonts/*',
          dest: 'assets/fonts'
        }
      ]
    })
  ],
  base: '/',
  resolve: {
    alias: {
      '@': path.resolve(__dirname, './src'),
      '@assets': path.resolve(__dirname, './src/assets'),
      '@fonts': path.resolve(__dirname, './src/assets/fonts'),
      '@styles': path.resolve(__dirname, './src/assets/styles'),
    },
  },
  assetsInclude: ['**/*.woff', '**/*.woff2', '**/*.ttf', '**/*.eot'],
})
