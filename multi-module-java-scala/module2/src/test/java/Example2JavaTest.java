import org.junit.Test;

/**
 * @author carlspring
 */
public class Example2JavaTest
{

    @Test
    public void testWithCoverage()
    {
        Example2Java example2Java = new Example2Java();
        example2Java.setAge(5);
        example2Java.fancyLogicWithCoverage();
    }

    @Test
    public void testWithoutCoverage()
    {
        Example2Java example2Java = new Example2Java();
        example2Java.fancyLogicWithoutCoverage();
    }

}
