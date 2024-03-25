package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testStudentAverage(){
        Student student = new Student("Martha", 130);
        assertEquals(null, student.getLetterGrade());
    }

}