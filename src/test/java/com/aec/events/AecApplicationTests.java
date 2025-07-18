package com.aec.events;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.aec.events.EventsServiceApplication;

// Le decimos explícitamente a Spring qué clase arrancar
@SpringBootTest(classes = EventsServiceApplication.class)
class AecApplicationTests {

    @Test
    void contextLoads() {
        // Si la aplicación arranca sin errores, este test pasa.
    }
}

