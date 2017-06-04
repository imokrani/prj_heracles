package orgmoduleapplicatifabstrait.services.domaine.os01;

import java.util.List;

import org.moduleapplicatifabstrait.domaine.ErreurFonctionnelle;
import org.moduleapplicatifabstrait.domaine.MAS_ServicesGeneric;


public abstract class MAS_DomaineServiceValidationOS01 extends MAS_ServicesGeneric<RequeteOS01, ReponseOS01, ErreurFonctionnelle> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1359996431589398665L;

	public MAS_DomaineServiceValidationOS01(RequeteOS01 entree, List<ReponseOS01> listSorties,
			List<ErreurFonctionnelle> listFails) {
		super(entree, listSorties, listFails);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void controleParametresObligatoires(RequeteOS01 entree) {
		System.out.println("controleParametresObligatoires OS01");
    	System.out.println(entree.getIdLocal() + " " + entree.getTypeLocal());
        listFails.add(new ErreurFonctionnelle("OBLIGATOIRE", "IdLocal obligatoire")); 
	}
	
	@Override
	protected void controleFormatParametres(RequeteOS01 entree) {
		 System.out.println("controleFormatParametres OS01");
	     listFails.add(new ErreurFonctionnelle("FORMAT ", "IdLocal format 32 caractere !!!!")); 
	}

	@Override
	protected void controleRG(RequeteOS01 entree) {
		System.out.println("controleRG");
		   listFails.add(new ErreurFonctionnelle("RG ", "IdLocal non respectée  !!!!")); 
	}

	@Override
	protected List<ReponseOS01> genererFails(List<ErreurFonctionnelle> listFails) {
		System.out.println("genererFails OS01");
		listSorties.add(new ReponseOS01(null, null, listFails)); 
		return listSorties; 
	}


}
