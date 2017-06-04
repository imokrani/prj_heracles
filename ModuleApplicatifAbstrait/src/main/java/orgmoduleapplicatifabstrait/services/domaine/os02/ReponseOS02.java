package orgmoduleapplicatifabstrait.services.domaine.os02;

import java.util.List;

import org.moduleapplicatifabstrait.domaine.ErreurFonctionnelle;



public class ReponseOS02 {

	
	private String cdIfp;
	private List<ErreurFonctionnelle> listFails; 

	public ReponseOS02(String cdIfp, List<ErreurFonctionnelle> listFails) {
		super();
		this.cdIfp = cdIfp;
		this.listFails = listFails;
	}

	public String getCdIfp() {
		return cdIfp;
	}

	public void setCdIfp(String cdIfp) {
		this.cdIfp = cdIfp;
	}

	public List<ErreurFonctionnelle> getListFails() {
		return listFails;
	}

	public void setListFails(List<ErreurFonctionnelle> listFails) {
		this.listFails = listFails;
	}
	
	
}
