package correct;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.EmployeeManager;

public class TestEmpShuffle {

    EmployeeManager EM = null;

    @BeforeEach
    public void init() {
        EM = new EmployeeManager();
        EM.initialize();
    }

    @Test
    @DisplayName("Pre Shuffle: Sham is the first employee")
    public void testFirstEmployee() {
        assertEquals("Sham", EM.getEmployeeList().get(0).getName());
    }

    @Test
    @DisplayName("Post Shuffle: Sham is NOT the first employee")
    public void testChangedFirstEmployee() {
        EM.shuffle();
        assertNotEquals("Sham", EM.getEmployeeList().get(0).getName());
    }

    @Test
    @DisplayName("Post Shuffle: Sham is the last employee")
    public void testChangedLastEmployee() {
        EM.shuffle();
        int lastIndex = EM.getEmployeeList().size()-1;
        assertEquals("Sham", EM.getEmployeeList().get(lastIndex).getName());
    }

    @AfterEach
    public void clear() {
        EM = null;
    }

}