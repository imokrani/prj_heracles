package orgmoduleapplicatifabstrait.services.domaine.os02;

public class RequeteOS02 {

	
	private String cdDept; 
	private String cdCommune; 
	private String cdVoie;
	
	
	
	public RequeteOS02(String cdDept, String cdCommune, String cdVoie) {
		super();
		this.cdDept = cdDept;
		this.cdCommune = cdCommune;
		this.cdVoie = cdVoie;
	}
	public String getCdDept() {
		return cdDept;
	}
	public void setCdDept(String cdDept) {
		this.cdDept = cdDept;
	}
	public String getCdCommune() {
		return cdCommune;
	}
	public void setCdCommune(String cdCommune) {
		this.cdCommune = cdCommune;
	}
	public String getCdVoie() {
		return cdVoie;
	}
	public void setCdVoie(String cdVoie) {
		this.cdVoie = cdVoie;
	} 
	
	
}
