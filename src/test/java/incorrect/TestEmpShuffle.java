package incorrect;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.EmployeeManager;

class TestEmpShuffle {

    EmployeeManager EM = null;

    @BeforeEach
    void init() {
        EM = new EmployeeManager();
        EM.initialize();
    }

    @Test
    @DisplayName("Pre Shuffle: Sham is the first employee")
    void testFirstEmployee() {
        assertEquals("Sham", EM.getEmployeeList().get(0).getName());
    }

    @Test
    @DisplayName("Post Shuffle: Sham is NOT the first employee")
    void testChangedFirstEmployee() {
        EM.shuffle();
        assertEquals("Sham", EM.getEmployeeList().get(0).getName());
    }

    @Test
    @DisplayName("Post Shuffle: Sham is the last employee")
    void testChangedLastEmployee() {
        EM.shuffle();
        assertEquals("Sham", EM.getEmployeeList().get(0).getName());
    }

    @AfterEach
    void clear() {
        EM = null;
    }
}
