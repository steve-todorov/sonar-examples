import org.junit.Test;

/**
 * @author carlspring
 */
public class Example1JavaTest
{

    @Test
    public void testWithCoverage()
    {
        Example1Java example1Java = new Example1Java();
        example1Java.setAge(5);
        example1Java.setName("John Doe");
        example1Java.fancyLogicWithCoverage();
    }

    @Test
    public void testWithoutCoverage()
    {
        Example1Java example1Java = new Example1Java();
        example1Java.fancyLogicWithoutCoverage();
    }

}
