package taxes.afterrefactor;

public class TaxPL implements ITax
{
	public double count(double value) {
		return 0.25*value;
	}
}
