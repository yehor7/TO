package Observer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestObserver {
    @Test
    public void TestObserver() {
       University university = new University();
        Director director = new Director();
        university.addStudent("Artem");
        assertEquals(true, university.isAddedStudent);
        university.addObserver(director);
        assertEquals(true, university.isAddedObserver);
        university.addStudent("Anna");
        assertEquals(true, university.isAddedStudent);
        university.removeStudent("Artem"); 
        assertEquals(true, university.isRemovedStudent);
    }
}
