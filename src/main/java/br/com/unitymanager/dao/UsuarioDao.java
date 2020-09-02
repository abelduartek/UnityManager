package br.com.unitymanager.dao;

import br.com.unitymanager.model.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import br.com.unitymanager.model.Usuario;
import java.util.ArrayList;



public class UsuarioDao {
	
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");
    EntityManager em = emf.createEntityManager();
    
    List<Usuario> listLogin;
   
    
    public boolean login(String usuario, String senha){
		
    	try {
    		
    		em.getTransaction().begin();
    		
    		Query query = em.createQuery("from Usuario where login=:lg and senha=:pw");
    		query.setParameter("lg", usuario);
    		query.setParameter("pw", senha);
    		query.setMaxResults(1);
    		
		listLogin = query.getResultList();
             
    		if(listLogin.size() == 1 ){
                    return true;
              
                        
    		}else {
    			return false;
    		}
                
			
		} catch (Exception e) {
			System.out.println(e);		
		}
    	
        
    	return false;
    	
    }

    public String usuarioLogado(){
        String usuarioLogado;
        return usuarioLogado = listLogin.get(0).getNome();
    }
    
    public void adicionarUsuario(Usuario usuario){
        
         try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         } 
       
         
        
    
    }
   
    public List<Usuario> listarUsuario(){
        em.getTransaction().begin();
        List<Usuario> list = new ArrayList<>();
        Query resultado = em.createQuery("from Usuario");
        list = resultado.getResultList();
        em.getTransaction().commit();
        emf.close();
        return list;
    }

}