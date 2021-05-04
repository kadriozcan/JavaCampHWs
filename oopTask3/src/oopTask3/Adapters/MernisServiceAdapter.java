package oopTask3.Adapters;
import java.rmi.RemoteException;

import oopTask3.Abstract.PlayerCheckService;
import oopTask3.Entitites.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean verify(Player player) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(player.getNationalityId(),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					player.getYearOfBirth());
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
