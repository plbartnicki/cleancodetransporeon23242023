package dependencies.companychat.before.before;

public class DataProcessingService
{
	private DataStoringService dataService;

	public DataProcessingService() {
		/*zależność dużego stopnia
			=> nie ma możliwości zmiany implementacji dataService, bez modyfikacji tej klasy
			=> utrudnione testowanie - nie ma możliwośći podmiany implementacji dataService podczas testow
		 */
		dataService = new DataStoringService();
	}

	public void processData(String data) {
		System.out.println("Processing data");
		dataService.storeData( data );
	}
}
