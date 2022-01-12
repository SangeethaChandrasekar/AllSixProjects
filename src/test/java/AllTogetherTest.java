import junit.framework.TestCase;
import org.junit.Test;
import java.time.*;
import static java.time.LocalTime.now;
import static org.junit.Assert.*;
public class AllTogetherTest {
        BodyMassIndex BMI = new BodyMassIndex();
    @Test
        public void bodyMassIndexTest1 () {
        TestCase.assertEquals(18.52, BMI.bodyMassIndex());
    }
        @Test
        public void bodyMassIndexTest2 () {
        assertNotNull(BMI.bodyMassIndex());
    }
        @Test
        public void bodyMassIndexTest3 () {
        assertNotSame("Not same", "ABC", BMI.bodyMassIndex());
    }
        BiggestNumber number = new BiggestNumber();
        @Test
        public void biggestNumberTest1 () {
        assertEquals(11, number.biggestNumber());
    }
        @Test
        public void biggestNumberTest2 () {
        assertTrue(number.biggestNumber() != 10);
    }
    ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    @Test
    public void armstrongNumberTest() {
        TestCase.assertEquals(1634, armstrongNumber.armstrongNumber());
    }

    @Test
    public void armstrongNumberTest1() {
        TestCase.assertNotSame(568, armstrongNumber.armstrongNumber());
    }
    UTC uTC=new UTC();
    @Test
    public void uTCTest() {
        try {
            assertEquals(uTC.uTC(),
                    now().atDate(LocalDate.now(ZoneId.from(LocalDateTime.now().minusSeconds(19800)))));
        }
            catch (DateTimeException ex) {
            ex.printStackTrace();
        }
    }
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