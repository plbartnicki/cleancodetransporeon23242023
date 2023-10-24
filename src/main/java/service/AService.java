package service;

public class AService
{
	public int f(int x) {
		if(x % 2 == 0) {
			return 777;
		}
		return x <= 0 ? 3*x : x+1;
	}

	public int h(int x) {
		return -x;
	}
}
