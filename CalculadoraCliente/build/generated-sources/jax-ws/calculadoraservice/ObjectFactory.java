
package calculadoraservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculadoraservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SomaResponse_QNAME = new QName("http://calculadoraservice/", "somaResponse");
    private final static QName _Subtracao_QNAME = new QName("http://calculadoraservice/", "subtracao");
    private final static QName _SubtracaoResponse_QNAME = new QName("http://calculadoraservice/", "subtracaoResponse");
    private final static QName _Soma_QNAME = new QName("http://calculadoraservice/", "soma");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculadoraservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Soma }
     * 
     */
    public Soma createSoma() {
        return new Soma();
    }

    /**
     * Create an instance of {@link SomaResponse }
     * 
     */
    public SomaResponse createSomaResponse() {
        return new SomaResponse();
    }

    /**
     * Create an instance of {@link SubtracaoResponse }
     * 
     */
    public SubtracaoResponse createSubtracaoResponse() {
        return new SubtracaoResponse();
    }

    /**
     * Create an instance of {@link Subtracao }
     * 
     */
    public Subtracao createSubtracao() {
        return new Subtracao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraservice/", name = "somaResponse")
    public JAXBElement<SomaResponse> createSomaResponse(SomaResponse value) {
        return new JAXBElement<SomaResponse>(_SomaResponse_QNAME, SomaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtracao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraservice/", name = "subtracao")
    public JAXBElement<Subtracao> createSubtracao(Subtracao value) {
        return new JAXBElement<Subtracao>(_Subtracao_QNAME, Subtracao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtracaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraservice/", name = "subtracaoResponse")
    public JAXBElement<SubtracaoResponse> createSubtracaoResponse(SubtracaoResponse value) {
        return new JAXBElement<SubtracaoResponse>(_SubtracaoResponse_QNAME, SubtracaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraservice/", name = "soma")
    public JAXBElement<Soma> createSoma(Soma value) {
        return new JAXBElement<Soma>(_Soma_QNAME, Soma.class, null, value);
    }

}
