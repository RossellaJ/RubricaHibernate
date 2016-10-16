package servizio;

import java.util.List;

import dao.RubricaDao;
import dao.VoceDao;
import model.Rubrica;
import model.Voce;

public class ServizioRubrica {

	private VoceDao vDao = new VoceDao();

	private RubricaDao rDao = new RubricaDao();
	
	//1

	public boolean registraRubrica(String nome) {

		boolean res = false;

		Rubrica r = new Rubrica(nome);

		res = rDao.creaRubrica(r);

		return res;

	}

	
//2
	public boolean aggiungiVoce(Rubrica r, String nome, String cognome,
			String tel) {

		boolean res = false;

		Voce v = new Voce(nome, cognome, tel);
		
		v.setRubrica(r);
		vDao.creaVoce(v);

		rDao.aggiornaRubrica(r);

		return res;

	}
//3
	public Voce getVoce(Rubrica r, long idVoce){
		Voce voce=null;
		
		 vDao.leggiVoceConId(idVoce);		 
	
		return voce;
		
	}
	
//4
	
	public List<Voce> getTutteVoci (long idRubrica){

		List<Voce> lista = null;
		
		lista = vDao.getTutteleVoci(idRubrica);
	
		return lista;
		
	}
//5
	public  boolean modificaVoce(Voce v){
		boolean res = false;
		
		res= vDao.aggiornaVoce(v);
		
		
		return res;
	
	}
	
// 6
	public  boolean eliminaVoce(Voce v){
		boolean res = false;
		
		res= vDao.eliminaVoce(v);
		
		
		return res;
	}	
	
}