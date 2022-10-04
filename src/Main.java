import java.util.Scanner;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;


public class Main {
	
	
	public static void main(String[] args) {
		int i=1;
//	    int j=0;
	    Scanner myObj = new Scanner(System.in);
	    Map<String, Salarie> hmap = new HashMap<String,Salarie>(); 
	//    ArrayList<HashMap> listhmap = new ArrayList<HashMap>();
	    
	    while (i!=0) {
		// TODO Auto-generated method stub
		System.out.println("1- Ajouter un concepteur");
		System.out.println("2- Supprimer un concepteur");
		System.out.println("3- Lister les concepteurs existants");
		System.out.println("4- Ajouter un analyste ");
		System.out.println("5- Supprimer un analyste");
		System.out.println("6- Lister les salariés existants en mettant en évidence la fonction (Concepteur ou Analyste) ");
		System.out.println("Entrez le numéro pour l'action que vous souhaitez effectuer");
	    i = myObj.nextInt();
	    System.out.println(i); 
	    	    
		    if (i==1) {
		    	System.out.println("Code employé");
		    	String code = myObj.next();
		    	if (hmap.containsKey(code) == true) {
		    		System.out.println("CODE DEJA UTILISE");
		    	}
		    	
		    	System.out.println("Nom concepteur");
		    	String nom = myObj.next();
		    	System.out.println("Prenom concepteur");
		    	String prenom = myObj.next();
		    	Date d = new Date();
		    	System.out.println("NbAnnee developpement");
		    	Integer nbAnnee = myObj.nextInt();
		    	if (hmap.containsKey(code) == false) {
		    	Concepteur addcon= new Concepteur(code,nom,prenom,d,nbAnnee);
		    	hmap.put(code,addcon);
		    	System.out.println(hmap.toString());
		    	}else {
		    		System.out.println("CODE DEJA PRESENT");
		    	}
		    	}
		    	
		    
		    if (i==2) {
		    	System.out.println("Code du concepteur à supprimer");
		    	String code = myObj.next();
		    	if (hmap.containsKey(code) == true) {
		    	if (hmap.get(code) instanceof Concepteur) {
		    		hmap.remove(code);
		    		}
		    	System.out.println(hmap);
		    }else {
		    	System.out.println("VALEUR NON EXISTANTE DANS HMAP");
		    }
		    }
		    
		    if (i==3) {
		    	
		    	for (Map.Entry<String,Salarie> mapentry : hmap.entrySet()) {
                    if (mapentry.getValue() instanceof Concepteur) {
                        System.out.println("Clé : "+mapentry.getKey()
                                        +" | Valeur : "+mapentry.getValue().toString());
                    }
                }
		    	}
		    
		    if (i==4) {
		    	System.out.println("Code employé");
		    	String code = myObj.next();
		    	System.out.println("Nom analyste");
		    	String nom = myObj.next();
		    	System.out.println("Prenom analyste");
		    	String prenom = myObj.next();
		    	Date d = new Date();
		    	System.out.println("Déplacement client effectué");
		    	Integer depclient = myObj.nextInt();
		    	
		    	Analyste addcon= new Analyste(code,nom,prenom,d,depclient);
		    	hmap.put(code,addcon);
		    	System.out.println(hmap);
		    	}
		    if (i==5) {
		    	System.out.println("Code de l'Analyste à supprimer");
		    	String code = myObj.next();
		    	if (hmap.containsKey(code) == true) {
		    	if (hmap.get(code) instanceof Concepteur) {
		    		hmap.remove(code);
		    		}
		    	System.out.println(hmap);
		    }else {
		    	System.out.println("VALEUR NON EXISTANTE DANS HMAP");
		    }
		    }
		    
		    if (i==6) {
		    	for (Map.Entry<String,Salarie> mapentry : hmap.entrySet()) {
		    		
                        System.out.println("Clé : "+mapentry.getKey()
                                        +" | Valeur : "+mapentry.getValue().toString());
                    
                }
		    }
		    }
	    }
	}


