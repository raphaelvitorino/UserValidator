
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraservice;

import javax.xml.ws.Endpoint;

/**
 *
 * @author raphael.silva
 */
public class CalculadoraPublisher {
        public static void main(String[] args) {
            final String url = "http://0.0.0.0:8888/cs";
            System.out.println("Publicando CalculadoraService no endpoint " + url);
            Endpoint.publish(url, new CalculadoraService());
    }
}
