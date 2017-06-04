package org.rloc.services.domaine;

import java.util.List;

/**
 * Definit la structure de tous les OS de RLOC dans la couche domaine
 * E : Entree 
 * S : Sortie
 * F : Echec
 * @author MOKRANI
 *
 */
public abstract class RlocServicesGeneric<E, S, F> extends RlocServicesProperties<E, S, F> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5200640206933087976L;

	public RlocServicesGeneric(E entree, List<S> listSorties, List<F> listFails) {
		super(entree, listSorties, listFails);
		// TODO Auto-generated constructor stub
	}

	//Point entree du service 
	public  List<S> executeService(E entree) {
		// 1
		controleParametresObligatoires(entree); 
		//2
		controleFormatParametres(entree);
		//3
		controleRG(entree);
		//4
		if(lancerTraitement(listFails))
		{
			return traiteService(entree);
		}
		return genererFails(listFails); 
	}
	
	//Verificaion des paramètres obligatoire 
	protected abstract void controleParametresObligatoires(E entree); 
	
	//Verification des formats
	protected abstract void controleFormatParametres(E entree);
	
	//Verification des regles de gestion 
	protected abstract void controleRG(E entree);
	
	//Controle des erreurs
	private boolean lancerTraitement(List<F> listF) {
		if(listF != null && listF.size() > 0)
		{
			return false; 
		}
		return true; 
	}
	
	//Generer reponse à partir d'une liste erreur 
	protected abstract List<S> genererFails(List<F> listFails);
	
	//traitement 
	protected abstract List<S> traiteService(E entree);
	
}
