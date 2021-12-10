package correct;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import main.java.Employee;
import main.java.EmployeeManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestEmpListSize {

    EmployeeManager EM = null;


    @BeforeEach
    public void initEM() {
        EM = new EmployeeManager();
        EM.initialize();
    }


    @Test
    @DisplayName("Correct initial length of Employee List")
    public void testEmpListLength() {
        assertEquals(3, EM.getEmployeeList().size());
    }

    @Test
    @DisplayName("Incorrect initial length of Employee List")
    public void testEmpListWrongLength() {
        assertNotEquals(2, EM.getEmployeeList().size());
    }


    @Test
    @DisplayName("2 is the Correct Edited Length of Employee List")
    public void testEmpListEditedLength2() {
        EM.getEmployeeList().remove(0);
        assertEquals(2, EM.getEmployeeList().size());
    }


    @Test
    @DisplayName("4 is the Correct Edited length of Employee List")
    public void testEmpListEditedLength4() {
        EM.getEmployeeList().add(new Employee());
        assertEquals(4, EM.getEmployeeList().size());
    }


    @AfterEach
    public void clear() {
        EM = null;
    }

}