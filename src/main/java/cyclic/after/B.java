package cyclic.after;

public class B
{
    private final A a;

    public B(final A a)
    {
        this.a = a;
        System.out.println("Creating B");
    }

}