package org.rloc.services.domaine.services;

import java.util.Arrays;
import java.util.List;

import org.rloc.services.domaine.ErreurFonctionnelle;
import org.rloc.services.domaine.os01.RlocDomaineServiceLancementOS01;
import org.rloc.services.domaine.os01.ReponseOS01;
import org.rloc.services.domaine.os01.RequeteOS01;
import org.rloc.services.domaine.os02.RlocDomaineServiceLancementOS02;
import org.rloc.services.domaine.os02.ReponseOS02;
import org.rloc.services.domaine.os02.RequeteOS02;

public class PointEntreeService {

	public static void main(String[] args) {
		
		   System.out.println("*****  Lancement de l'execution du service OS01 *****  ");	
		   
		    List<RequeteOS01> listReq = Arrays.asList(new RequeteOS01("kdhfhf5kdjfhhf", "FONCIER"),
					   								  new RequeteOS01("ddsfdefdfefegg", "PAUVRE"),
			   								  		  new RequeteOS01("erefkkfkkkrere", "PROVISOIRE")); 
		    
		    for(RequeteOS01 req: listReq)
		    {
		    	  List<ReponseOS01> listRep = new RlocDomaineServiceLancementOS01().lancement(req); 
				    
				    for(ReponseOS01 rep :listRep)
				    {
				    	for(ErreurFonctionnelle err :rep.getListFails())
				    	{
				    		System.out.println("--> "+err.getCode() + " " + err.getLibelle());
				    	}
				    }
		    }
	       System.out.println("*****  Fin de l'execution du service OS01 *****  ");
	       System.out.println("****************************************************************************");
	       
	       System.out.println("*****  Lancement de l'execution du service OS02 *****  ");	
		   
		    List<RequeteOS02> listReqOS02 = Arrays.asList(new RequeteOS02("094", "123", "1234"),
					   								  new RequeteOS02("095", "125", "1235"),
			   								  		  new RequeteOS02("093", "123", "1233")); 
		    for(RequeteOS02 req: listReqOS02)
		    {
		    	 List<ReponseOS02> listRepOS02 = new RlocDomaineServiceLancementOS02().lancement(req); 
				    
				    for(ReponseOS02 rep :listRepOS02)
				    {
				    	for(ErreurFonctionnelle err :rep.getListFails())
				    	{
				    		System.out.println("--> "+err.getCode() + " " + err.getLibelle());
				    	}
				    }
		    }
	       System.out.println("*****  Fin de l'execution du service OS02 *****  ");
	}

}
