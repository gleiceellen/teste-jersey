/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gleice.testeac;

import com.google.gson.Gson;
import gleice.testeac.modelos.Product;
import gleice.testeac.repository.ProdutoRepository;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author gleiceellen
 */
@Path("/produto")
public class ProdutoService {
    @GET
    @Path("/lista")
    @Produces(MediaType.APPLICATION_JSON)
    public String lista(){
        Product p = new Product();
        p.setDescricao("mouse");
        
        Gson gson = new Gson();//verificar se o Jersey possui injeção de dependências
        System.out.println(gson.toJson(p));// algo como o @Autowired
        
        return gson.toJson(p);
    }
    
    @POST
    @Path("/adiciona")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String adiciona(Product p){
        
        ProdutoRepository pr = new ProdutoRepository();
        pr.save(p);
        
        Gson gson = new Gson();
        System.out.println(gson.toJson(p));
        return gson.toJson(p);
    }
    
    
}
