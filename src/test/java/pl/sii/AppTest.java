package pl.sii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void shouldSayHello() {
        App app = new App();
        assertEquals("Hello, SII!", app.sayHello());
    }
}
