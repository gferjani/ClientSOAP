package requeteSOAPTP;

public class Principale
{

	/**
	 * @param args
	 */
	// TODO Auto-generated method stub
	// On déclare l'environnement d'accès au web service
	private static String operation = "getListePays";
	private static String operation2 = "donneInfoPays";
	private static String destenvoi = "http://localhost:8081/TPSOAPServer/services/WebServicePays";
	private static String destination = "http://Webservice";
	private static String nomPays = "ALBANIE";
	private static EnvoiMessage unAppel = new EnvoiMessage();

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			unAppel.connexion();
			unAppel.creationMessage(operation, destination);
			unAppel.EmmissionReception(destenvoi);
			unAppel.connexion();
			unAppel.creationMessage(operation2, destination);
			unAppel.creationParametreMessage(nomPays);
			unAppel.EmmissionReception(destenvoi);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}