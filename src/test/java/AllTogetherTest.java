import junit.framework.TestCase;
import org.junit.Test;
import java.time.*;
import static java.time.LocalTime.now;
import static org.junit.Assert.*;
public class AllTogetherTest {
        BodyMassIndex BMI = new BodyMassIndex();
    @Test
        public void bodyMassIndexTest1 () {
        TestCase.assertEquals(18.52, BMI.bodyMassIndex(60.0,1.80));
    }
        @Test
        public void bodyMassIndexTest2 () {
        assertNotNull(BMI.bodyMassIndex(50,2.5));
    }
        @Test
        public void bodyMassIndexTest3 () {
        assertNotSame("Not same", "ABC", BMI.bodyMassIndex(60.0,1.80));
    }
        BiggestNumber number = new BiggestNumber();
        @Test
        public void biggestNumberTest1 () {
        assertEquals(11, number.biggestNumber(new int[]{4, 3, 9, 11, 1, 2}));
        assertNotNull(number.biggestNumber(new int[]{25, 5, 8, 85, 7}));
        assertNotEquals(4,number.biggestNumber(new int[]{4, 3, 9, 11, 1, 2}));
    }
        @Test
        public void biggestNumberTest2 () {
        assertTrue(number.biggestNumber(new int[]{4, 3, 9, 11, 1, 2}) != 10);
    }
    ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    @Test
    public void armstrongNumberTest() {
        TestCase.assertEquals(153, armstrongNumber.armstrongNumber(153));
        TestCase.assertEquals(1634,armstrongNumber.armstrongNumber(1634));
        TestCase.assertEquals(407,armstrongNumber.armstrongNumber(407));
    }

    @Test
    public void armstrongNumberTest1() {
        TestCase.assertNotSame(153, armstrongNumber.armstrongNumber(154));
    }
    /*
    UTC uTC=new UTC();

   @Test
    public void uTCTest() {
        assertNotNull(uTC.uTC());
        try {
            assertEquals(uTC.uTC(),
                    now().atDate(LocalDate.now(ZoneId.from(LocalDateTime.now().minusSeconds(19800)))));
        }
            catch (DateTimeException ex) {
            ex.printStackTrace();
        }
    }*/
    AreaOfCircle a = new AreaOfCircle();
    @Test
    public void areaOfCircleTest() {
        TestCase.assertEquals(12.56,a.area(2));
    }
    @Test
    public void areaOfTriangleTest() {
        assertNotSame(10.0, a.area(2,4));
    }
    @Test
    public void areaOfRectangleTest() {
        assertNotNull("NotNull",a.area(2.0,2));
    }

}