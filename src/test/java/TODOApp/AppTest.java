/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TODOApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        TodoApp classUnderTest = new TodoApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}