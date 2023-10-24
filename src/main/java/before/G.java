package before;

public class G extends E
{
	private void h() {
		System.out.println("some logic of h");
	}

	public void start() {
		h();
		System.out.println("some logic of G.start");
		fn1();
	}
}
