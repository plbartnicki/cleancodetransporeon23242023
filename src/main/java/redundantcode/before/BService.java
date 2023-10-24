package redundantcode.before;

public class BService
{

	public double f(double a, double b, double T[]) {
		double sum = 0;
		for(double x : T) {
			if(x >= a && x <= b) {
				sum += x;
			}
		}

		return sum;
	}

	public double g(double a, double b, double T[]) {
		double sum = 0;
		for(double x : T) {
			if(x >= a && x <= b) {
				sum += x;
			}
		}

		return sum;
	}

	public void start(double a, double b, double T[]) {
		double res = f(a, b, T);
		System.out.println(String.format("some logic from BService with %f", res));
	}
}
