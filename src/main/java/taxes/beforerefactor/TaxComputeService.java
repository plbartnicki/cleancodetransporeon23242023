package taxes.beforerefactor;

public class TaxComputeService
{

	public double computeTax(TaxType taxType, double value) throws IncorrectArgumentException {
		if (taxType == TaxType.PL) {
			//a lot of lines of code, for example for getting actual tax rate from external service
			double taxtRate = 0.25;
			return taxtRate * value;
		} else if(taxType == TaxType.EN) {
			//a lot of lines of code, for example for getting actual tax rate from external service
			double taxtRate = 0.3;
			return taxtRate * value;
		}

		throw new IncorrectArgumentException( "wrong tax type" );
	}
}
