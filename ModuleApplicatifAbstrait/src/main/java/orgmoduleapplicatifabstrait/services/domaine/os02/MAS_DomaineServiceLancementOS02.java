package orgmoduleapplicatifabstrait.services.domaine.os02;

import java.util.ArrayList;
import java.util.List;

import org.moduleapplicatifabstrait.domaine.ErreurFonctionnelle;
import org.moduleapplicatifabstrait.domaine.MAS_DomaineServiceLancement;


public class MAS_DomaineServiceLancementOS02 extends MAS_DomaineServiceLancement<RequeteOS02, ReponseOS02, MAS_DomaineServiceLancementOS02> {

	
	@Override
	public List<ReponseOS02> lancement(RequeteOS02 entree)
	{
		 return new MAS_DomaineServiceValidationOS02(entree, new  ArrayList<ReponseOS02>(), new ArrayList<ErreurFonctionnelle>() ) {

			private static final long serialVersionUID = 5165809934916164227L;

			@Override
			protected List<ReponseOS02> traiteService(RequeteOS02 entree) {
				System.out.println("traiteService OS02");
				return listSorties;
			}
			
		}.executeService(entree);
	}
}
