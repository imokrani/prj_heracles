package org.rloc.services.domaine.os02;

import java.util.List;

import org.rloc.services.domaine.ErreurFonctionnelle;
import org.rloc.services.domaine.RlocServicesGeneric;

public abstract class RlocDomaineServiceValidationOS02 extends RlocServicesGeneric<RequeteOS02, ReponseOS02, ErreurFonctionnelle> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -524983392652672365L;

	public RlocDomaineServiceValidationOS02(RequeteOS02 entree, List<ReponseOS02> listSorties,
			List<ErreurFonctionnelle> listFails) {
		super(entree, listSorties, listFails);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void controleParametresObligatoires(RequeteOS02 entree) {
        System.out.println("controleParametresObligatoires OS02");
    	System.out.println(entree.getCdDept() + " " + entree.getCdCommune() + " "+entree.getCdVoie());
        listFails.add(new ErreurFonctionnelle("OBLIGATOIRE", "cd Departement  obligatoire")); 
	}
	
	@Override
	protected List<ReponseOS02> genererFails(List<ErreurFonctionnelle> listFails) {
		System.out.println("genererFails OS02");
		listSorties.add(new ReponseOS02(null, listFails)); 
		return listSorties; 
	}
	
	@Override
	protected void controleRG(RequeteOS02 entree) {
		System.out.println("controleRG OS02");
		   listFails.add(new ErreurFonctionnelle("RG ", "code departement non respectée  !!!!")); 
	}
	
	@Override
	protected void controleFormatParametres(RequeteOS02 entree) {
		System.out.println("controleFormatParametres OS02");
	     listFails.add(new ErreurFonctionnelle("FORMAT ", "cdDept cdCommune  caractere !!!!")); 
	}

}
