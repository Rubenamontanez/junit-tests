
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student newGuy;

    @Before
    public void setUp(){
        newGuy = new Student("Bob", 1234567);
    }

    @Test
    public void testIfNewStudentWorks(){
        assertNotNull(newGuy);
        assertTrue(newGuy.grades.isEmpty());
    }


    @Test
    public void testIfGetIdWorks(){
        assertEquals(1234567, newGuy.getId());
    }

    @Test
    public void testIfGetNameWorks(){
        assertEquals("Bob", newGuy.getName());
    }

    @Test
    public void testIfAddGradeWorks(){
        assertTrue(newGuy.grades.isEmpty());
        newGuy.addGrade(90);
        assertFalse(newGuy.grades.isEmpty());
        assertEquals(1, newGuy.grades.size());
        assertEquals(90, newGuy.grades.get(0), 0);
        newGuy.addGrade(95);
        assertEquals(2, newGuy.grades.size());
        assertEquals(95, newGuy.grades.get(1), 0);
    }

    @Test
    public void testIfGetAverageWorks(){
        newGuy.addGrade(90);
        newGuy.addGrade(95);
        newGuy.addGrade(100);
        assertEquals(95.0, newGuy.getGradeAverage(), 0);
    }


}
