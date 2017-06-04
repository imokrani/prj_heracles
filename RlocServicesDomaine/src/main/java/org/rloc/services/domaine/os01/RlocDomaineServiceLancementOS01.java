package org.rloc.services.domaine.os01;

import java.util.ArrayList;
import java.util.List;

import org.rloc.services.domaine.ErreurFonctionnelle;
import org.rloc.services.domaine.RlocDomaineServiceLancement;

public class RlocDomaineServiceLancementOS01 extends RlocDomaineServiceLancement<RequeteOS01, ReponseOS01, RlocDomaineServiceLancementOS01> {

	
	@Override
	public  List<ReponseOS01> lancement(RequeteOS01 requete)
	{
	        return new RLocDomaineServiceValidationOS01(requete, new ArrayList<ReponseOS01>(), new ArrayList<ErreurFonctionnelle>()) {
	
			private static final long serialVersionUID = -5169013687870641970L;

			@Override
			protected List<ReponseOS01> traiteService(RequeteOS01 requete) {
				System.out.println("traiteService OS01");
				
				return listSorties;
			}
		}.executeService(requete);
	}

}
