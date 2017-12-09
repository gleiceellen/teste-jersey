/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gleice.testeac.entitymanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gleiceellen
 */
public class JpaEntityManager {
    
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("gleice_testeAC"); 
    private EntityManager em = factory.createEntityManager();
    
    public EntityManager getEntityManager(){
        return em;
    }
}
