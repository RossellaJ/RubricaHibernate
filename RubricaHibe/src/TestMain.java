import model.Rubrica;

import dao.RubricaDao;

//import servizio.ServizioRubrica;





public class TestMain {



	public static void main(String[] args) {

		


//
//		ServizioRubrica sRub= new ServizioRubrica();
//
//		
//
//	System.out.println("la rubrica è stata creata ? "+sRub.registraRubrica("Rossella"));
//
//	

	
     RubricaDao rDao=new RubricaDao();



     Rubrica r=rDao.leggiRubricaConId(2);

   
     System.out.println(r.getNome()+" "+r.getId_Rubrica());

     

//		

//		sRub.aggiungiVoce(r, nome, cognome, tel)

	}



}