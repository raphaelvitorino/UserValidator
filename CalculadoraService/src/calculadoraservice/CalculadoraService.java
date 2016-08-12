/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraservice;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author raphael.silva
 */
@WebService
@HandlerChain(file="handler-chain.xml")
public class CalculadoraService {

    @WebMethod
    public int soma(int a, int b) {
	return a + b;
    }
    
    @WebMethod
    public int subtracao(int a, int b) {
        return a - b;
    }
    
}
