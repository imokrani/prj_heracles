package orgmoduleapplicatifabstrait.services.domaine.os01;

import java.util.List;

import org.moduleapplicatifabstrait.domaine.ErreurFonctionnelle;


public class ReponseOS01 {

	public ReponseOS01(String idLocal, String typeLocal, List<ErreurFonctionnelle> listFails) {
		super();
		this.idLocal = idLocal;
		this.typeLocal = typeLocal;
		this.listFails = listFails;
	}
	private String idLocal; 
	private String typeLocal;
	private List<ErreurFonctionnelle> listFails; 
	
	
	public String getIdLocal() {
		return idLocal;
	}
	public List<ErreurFonctionnelle> getListFails() {
		return listFails;
	}
	public void setListFails(List<ErreurFonctionnelle> listFails) {
		this.listFails = listFails;
	}
	public void setIdLocal(String idLocal) {
		this.idLocal = idLocal;
	}
	public String getTypeLocal() {
		return typeLocal;
	}
	public void setTypeLocal(String typeLocal) {
		this.typeLocal = typeLocal;
	} 
}
