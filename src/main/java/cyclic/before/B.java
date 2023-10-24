package cyclic.before;

public class B
{
    public A a;

    public B()
    {
        a= new A();
        System.out.println("Creating B");
    }
}