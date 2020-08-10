package br.com.unitymanager.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import br.com.unitymanager.model.Usuario;



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
                
               
                        
                //Usuario nomeUsuario = list.get(5);
                //System.out.println(nomeUsuario);
    		
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

}