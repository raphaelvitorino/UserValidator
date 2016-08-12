/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracliente;

import calculadoraservice.CalculadoraService;
import calculadoraservice.CalculadoraServiceService;
import handlerClient.handler.HeaderHandlerResolver;

/**
 *
 * @author raphael.silva
 */
public class CalculadoraCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraServiceService cs = new CalculadoraServiceService();
        HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
        cs.setHandlerResolver(handlerResolver);
        CalculadoraService service = cs.getCalculadoraServicePort();
        System.out.println(service.soma(10, 2));
        System.out.println(service.subtracao(10, 2));
    }
    
}
