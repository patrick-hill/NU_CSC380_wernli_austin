//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.26 at 09:50:52 PM MDT 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Restaurants_QNAME = new QName("", "restaurants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Restaurants }
     */
    public Restaurants createRestaurants() {
        return new Restaurants();
    }

    /**
     * Create an instance of {@link MenuItem }
     */
    public MenuItem createMenuItem() {
        return new MenuItem();
    }

    /**
     * Create an instance of {@link Restaurant }
     */
    public Restaurant createRestaurant() {
        return new Restaurant();
    }

    /**
     * Create an instance of {@link MenuItems }
     */
    public MenuItems createMenuItems() {
        return new MenuItems();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restaurants }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "restaurants")
    public JAXBElement<Restaurants> createRestaurants(Restaurants value) {
        return new JAXBElement<Restaurants>(_Restaurants_QNAME, Restaurants.class, null, value);
    }

}