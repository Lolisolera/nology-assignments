import { defineConfig } from 'vite';
import sassEmbedded from 'sass-embedded';

export default defineConfig({
    css: {
        preprocessorOptions: {
            scss: {
                // Just set sass-embedded, without the implementation and module keys
                additionalData: '@import "./styles.scss";', // Add any global imports here if needed
                // If you still want to add includePaths, you can do it here
            },
        },
    },
});


