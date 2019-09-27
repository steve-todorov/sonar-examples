/**
 * @author carlspring
 */
public class Example1Java
{

    private long age = 0;

    private String name;


    public Example1Java()
    {
    }

    public void fancyLogicWithCoverage()
    {
        if (age >= 5)
        {
            System.out.println("We have coverage");
        }
    }

    public void fancyLogicWithoutCoverage()
    {
        if (age >= 5)
        {
            System.out.println("We have no coverage");
        }
    }

    public long getAge()
    {
        return age;
    }

    public void setAge(long age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
