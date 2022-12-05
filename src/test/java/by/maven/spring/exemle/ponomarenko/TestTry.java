package by.maven.spring.exemle.ponomarenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestTry extends BaseTest {

    @Test
    public void verifyUrl() {
        String url = System.getProperty("user-password");
        Assertions.assertEquals("password", url);
    }

}
