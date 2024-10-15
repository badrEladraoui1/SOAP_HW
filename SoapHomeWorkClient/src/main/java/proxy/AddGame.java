
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addGame complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="addGame">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="game" type="{http://webServices.SoapHomeWork.example.com/}game" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addGame", propOrder = {
    "game"
})
public class AddGame {

    protected Game game;

    /**
     * Gets the value of the game property.
     * 
     * @return
     *     possible object is
     *     {@link Game }
     *     
     */
    public Game getGame() {
        return game;
    }

    /**
     * Sets the value of the game property.
     * 
     * @param value
     *     allowed object is
     *     {@link Game }
     *     
     */
    public void setGame(Game value) {
        this.game = value;
    }

}
