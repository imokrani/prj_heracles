package org.moduleapplicatifabstrait.domaine;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

/**
 * Toutes les propriètés communes des OS de RLOC
 * @author MOKRANI
 *
 */
public class MAS_ServicesProperties <E, S, F> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 419690542015084534L;
	
	protected E entrees;
	protected List<S> listSorties;
	protected List<F> listFails; 
	
	protected static final Logger LOGGER = Logger.getLogger(MAS_ServicesProperties.class.getName() );
	
	public MAS_ServicesProperties(E entrees, List<S> listSorties, List<F> listFails) {
		super();
		this.entrees = entrees;
		this.listFails = listFails;
		this.listSorties = listSorties;
	}

	public E getEntrees() {
		return entrees;
	}

	public void setEntrees(E entrees) {
		this.entrees = entrees;
	}



	public List<F> getListFails() {
		return listFails;
	}

	public void setListFails(List<F> listFails) {
		this.listFails = listFails;
	}

	public List<S> getListSorties() {
		return listSorties;
	}

	public void setListSorties(List<S> listSorties) {
		this.listSorties = listSorties;
	}
}
