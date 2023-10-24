package cyclic.before;

public class A
{
    public B b;

    public A()
    {
        b = new B();
        System.out.println("Creating A");
    }

    public static void main(String[] args)
    {
        A a = new A();
    }
}
