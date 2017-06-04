package orgmoduleapplicatifabstrait.services.domaine.os01;

public class RequeteOS01 {

	private String idLocal; 
	private String typeLocal;
	
	
	public RequeteOS01(String idLocal, String typeLocal) {
		super();
		this.idLocal = idLocal;
		this.typeLocal = typeLocal;
	}
	
	public String getIdLocal() {
		return idLocal;
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
