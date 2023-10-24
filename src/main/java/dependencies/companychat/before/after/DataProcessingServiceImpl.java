package dependencies.companychat.before.after;

/* W oryginalnym wzorcu dependency injection, istnieje specjalny serwis do wstrzykiwania zaleznosci */
public class DataProcessingServiceImpl implements DataProcessingService
{
	private final DataStoringService dataService;
	private SecurityService securityService;

	/*construktor injection - obiekt zaleznosci nie jest instancjonowany tej klasie, tylko na zewnatrz,
	zo mniejsza stopien zaleznosci. Zaleta tego rozwiazania jest to, że pole (dataService) może być final (wiec nie mozna zrobic przez setter)
	Uzywamy do obowiazkowych zaleznosci (w najnowszej wersji springa nie trzeba dodawac adnotacji)
	W ten sposob powstanie obiekt dopiero wtedy gdy wsszystkie zaleznosci beda gotowe
	*/
	public DataProcessingServiceImpl( final DataStoringServiceImpl dataService) {
		this.dataService = dataService;
	}

	/* Setter injection - uzywamy do opcjonalnych zaleznosci, (ktore nie sa final)
	 Nie mamy gwarancji ze wszystkie zaleznosci zostana wstrzykniete - moze wiec powstac obiekt w ktorym niektore pola sa null
	 */
	public void setSecurityService( SecurityService securityService )
	{
		this.securityService = securityService;
	}

	public void processData(String data) {
		System.out.println("Processing data");
		dataService.storeData( data );
	}
}
