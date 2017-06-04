package orgmoduleapplicatifabstrait.services.domaine.os01;

import java.util.ArrayList;
import java.util.List;

import org.moduleapplicatifabstrait.domaine.ErreurFonctionnelle;
import org.moduleapplicatifabstrait.domaine.MAS_DomaineServiceLancement;


public class MAS_DomaineServiceLancementOS01 extends MAS_DomaineServiceLancement<RequeteOS01, ReponseOS01, MAS_DomaineServiceLancementOS01> {

	
	@Override
	public  List<ReponseOS01> lancement(RequeteOS01 requete)
	{
	        return new MAS_DomaineServiceValidationOS01(requete, new ArrayList<ReponseOS01>(), new ArrayList<ErreurFonctionnelle>()) {
	
			private static final long serialVersionUID = -5169013687870641970L;

			@Override
			protected List<ReponseOS01> traiteService(RequeteOS01 requete) {
				System.out.println("traiteService OS01");
				
				return listSorties;
			}
		}.executeService(requete);
	}

}
