package org.rloc.services.domaine.os02;

import java.util.ArrayList;
import java.util.List;

import org.rloc.services.domaine.ErreurFonctionnelle;
import org.rloc.services.domaine.RlocDomaineServiceLancement;

public class RlocDomaineServiceLancementOS02 extends RlocDomaineServiceLancement<RequeteOS02, ReponseOS02, RlocDomaineServiceLancementOS02> {

	
	@Override
	public List<ReponseOS02> lancement(RequeteOS02 entree)
	{
		 return new RlocDomaineServiceValidationOS02(entree, new  ArrayList<ReponseOS02>(), new ArrayList<ErreurFonctionnelle>() ) {

			private static final long serialVersionUID = 5165809934916164227L;

			@Override
			protected List<ReponseOS02> traiteService(RequeteOS02 entree) {
				System.out.println("traiteService OS02");
				return listSorties;
			}
			
		}.executeService(entree);
	}
}
