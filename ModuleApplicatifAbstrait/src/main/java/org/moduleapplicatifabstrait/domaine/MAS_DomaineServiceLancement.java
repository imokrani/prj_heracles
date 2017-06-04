package org.moduleapplicatifabstrait.domaine;

import java.util.List;


public abstract class MAS_DomaineServiceLancement<E,S, L> {

	protected   L instance; 
	public abstract List<S> lancement(E entree);
	
//	public  L getInstance(Class<L> clazz) 
//	{
//		if(instance == null)
//		{
//			try {
//				instance = clazz.newInstance();
//			} catch (InstantiationException | IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Probleme d'instanciation de la classe "+clazz.getName());
//				e.printStackTrace();
//			} 
//		}
//		return instance; 
//	}
}
