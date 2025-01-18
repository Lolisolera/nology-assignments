import { defineConfig } from 'vite';

export default defineConfig({
    css: {
        preprocessorOptions: {
            scss: {
                additionalData: `@use "styles/styles.scss" as *;`, // Project-relative path
            },
        },
    },
});
