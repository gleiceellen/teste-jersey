package gleice.testeac;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gleiceellen
 */
public class TestaJPA {
    public static void main(String[] args) {
//        Conta conta = new Conta();
//        conta.setTitular("Leonardo");
//        conta.setBanco("Caixa Economica");
//        conta.setAgencia("123");
//        conta.setNumero("456");
        
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("gleice_testeAC");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();
//        em.persist(conta);
//        em.getTransaction().commit();

        em.close();
        emf.close();
    }
    
}
