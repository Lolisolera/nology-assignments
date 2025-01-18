import { defineConfig } from 'vite';

export default defineConfig({
    css: {
        preprocessorOptions: {
            scss: {
                // This ensures `styles.scss` is globally available
                additionalData: `@use "./styles/styles.scss" as *;`,
            },
        },
    },
});
