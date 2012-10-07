
package wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsclient package. 
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

    private final static QName _ImageTransResponse_QNAME = new QName("http://kou.computer/", "ImageTransResponse");
    private final static QName _ImageTrans_QNAME = new QName("http://kou.computer/", "ImageTrans");
    private final static QName _FileNotFoundException_QNAME = new QName("http://kou.computer/", "FileNotFoundException");
    private final static QName _ImageTransArg0_QNAME = new QName("", "arg0");
    private final static QName _ImageTransResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImageTrans }
     * 
     */
    public ImageTrans createImageTrans() {
        return new ImageTrans();
    }

    /**
     * Create an instance of {@link ImageTransResponse }
     * 
     */
    public ImageTransResponse createImageTransResponse() {
        return new ImageTransResponse();
    }

    /**
     * Create an instance of {@link FileNotFoundException }
     * 
     */
    public FileNotFoundException createFileNotFoundException() {
        return new FileNotFoundException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageTransResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kou.computer/", name = "ImageTransResponse")
    public JAXBElement<ImageTransResponse> createImageTransResponse(ImageTransResponse value) {
        return new JAXBElement<ImageTransResponse>(_ImageTransResponse_QNAME, ImageTransResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kou.computer/", name = "ImageTrans")
    public JAXBElement<ImageTrans> createImageTrans(ImageTrans value) {
        return new JAXBElement<ImageTrans>(_ImageTrans_QNAME, ImageTrans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://kou.computer/", name = "FileNotFoundException")
    public JAXBElement<FileNotFoundException> createFileNotFoundException(FileNotFoundException value) {
        return new JAXBElement<FileNotFoundException>(_FileNotFoundException_QNAME, FileNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg0", scope = ImageTrans.class)
    public JAXBElement<byte[]> createImageTransArg0(byte[] value) {
        return new JAXBElement<byte[]>(_ImageTransArg0_QNAME, byte[].class, ImageTrans.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ImageTransResponse.class)
    public JAXBElement<byte[]> createImageTransResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_ImageTransResponseReturn_QNAME, byte[].class, ImageTransResponse.class, ((byte[]) value));
    }

}
