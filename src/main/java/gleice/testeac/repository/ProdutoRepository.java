/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gleice.testeac.repository;

import gleice.testeac.modelos.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gleiceellen
 */

public class ProdutoRepository {

    @PersistenceContext
    private EntityManager manager;

    public Product findOne(Integer id) {
        return manager.find(Product.class, id);
    }

    public void save(Product produto) {
        manager.persist(produto);
    }

    public List<Product> findAll() {
        return manager.createQuery("select p from Produto p", Product.class).getResultList();
    }

    public void delete(Integer id) {
        manager.remove(findOne(id));
    }
}

