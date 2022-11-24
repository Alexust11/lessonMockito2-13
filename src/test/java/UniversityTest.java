import org.example.Student;
import org.example.StudentValueGenerator;
import org.example.University;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UniversityTest {
    private final Student student = new Student("Евгений", true);
    University university;
    @Mock
    private StudentValueGenerator studentValueGenerator;
    @BeforeEach
    public void setUp() {
        university = new University(studentValueGenerator);
    }
@Test
public void getAllStudent() {
    Assertions.assertNotNull(studentValueGenerator);
    Mockito.when(studentValueGenerator.generateAge()).thenReturn(50);
    university.addStudent(student);
    List<Student> expected=university.getAllStudent();
    Assertions.assertEquals(expected.get(0),50);
}

}
