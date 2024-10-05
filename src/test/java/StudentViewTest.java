import org.junit.Test;
import view.StudentView;

import java.text.ParseException;

import static org.junit.Assert.*;

public class StudentViewTest {

    StudentView student = new StudentView();

    @Test
    public void test() throws ParseException {

        assertEquals("Dushime", student.getLastName("Lewis"));
    }
}