
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _AddGame_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "addGame");
    private static final QName _AddGameResponse_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "addGameResponse");
    private static final QName _DeleteGameById_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "deleteGameById");
    private static final QName _DeleteGameByIdResponse_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "deleteGameByIdResponse");
    private static final QName _Game_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "game");
    private static final QName _GetAllGames_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "getAllGames");
    private static final QName _GetAllGamesResponse_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "getAllGamesResponse");
    private static final QName _GetGameById_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "getGameById");
    private static final QName _GetGameByIdResponse_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "getGameByIdResponse");
    private static final QName _UpdateGame_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "updateGame");
    private static final QName _UpdateGameResponse_QNAME = new QName("http://webServices.SoapHomeWork.example.com/", "updateGameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddGame }
     * 
     * @return
     *     the new instance of {@link AddGame }
     */
    public AddGame createAddGame() {
        return new AddGame();
    }

    /**
     * Create an instance of {@link AddGameResponse }
     * 
     * @return
     *     the new instance of {@link AddGameResponse }
     */
    public AddGameResponse createAddGameResponse() {
        return new AddGameResponse();
    }

    /**
     * Create an instance of {@link DeleteGameById }
     * 
     * @return
     *     the new instance of {@link DeleteGameById }
     */
    public DeleteGameById createDeleteGameById() {
        return new DeleteGameById();
    }

    /**
     * Create an instance of {@link DeleteGameByIdResponse }
     * 
     * @return
     *     the new instance of {@link DeleteGameByIdResponse }
     */
    public DeleteGameByIdResponse createDeleteGameByIdResponse() {
        return new DeleteGameByIdResponse();
    }

    /**
     * Create an instance of {@link Game }
     * 
     * @return
     *     the new instance of {@link Game }
     */
    public Game createGame() {
        return new Game();
    }

    /**
     * Create an instance of {@link GetAllGames }
     * 
     * @return
     *     the new instance of {@link GetAllGames }
     */
    public GetAllGames createGetAllGames() {
        return new GetAllGames();
    }

    /**
     * Create an instance of {@link GetAllGamesResponse }
     * 
     * @return
     *     the new instance of {@link GetAllGamesResponse }
     */
    public GetAllGamesResponse createGetAllGamesResponse() {
        return new GetAllGamesResponse();
    }

    /**
     * Create an instance of {@link GetGameById }
     * 
     * @return
     *     the new instance of {@link GetGameById }
     */
    public GetGameById createGetGameById() {
        return new GetGameById();
    }

    /**
     * Create an instance of {@link GetGameByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetGameByIdResponse }
     */
    public GetGameByIdResponse createGetGameByIdResponse() {
        return new GetGameByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateGame }
     * 
     * @return
     *     the new instance of {@link UpdateGame }
     */
    public UpdateGame createUpdateGame() {
        return new UpdateGame();
    }

    /**
     * Create an instance of {@link UpdateGameResponse }
     * 
     * @return
     *     the new instance of {@link UpdateGameResponse }
     */
    public UpdateGameResponse createUpdateGameResponse() {
        return new UpdateGameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGame }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddGame }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "addGame")
    public JAXBElement<AddGame> createAddGame(AddGame value) {
        return new JAXBElement<>(_AddGame_QNAME, AddGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddGameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "addGameResponse")
    public JAXBElement<AddGameResponse> createAddGameResponse(AddGameResponse value) {
        return new JAXBElement<>(_AddGameResponse_QNAME, AddGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGameById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteGameById }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "deleteGameById")
    public JAXBElement<DeleteGameById> createDeleteGameById(DeleteGameById value) {
        return new JAXBElement<>(_DeleteGameById_QNAME, DeleteGameById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGameByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteGameByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "deleteGameByIdResponse")
    public JAXBElement<DeleteGameByIdResponse> createDeleteGameByIdResponse(DeleteGameByIdResponse value) {
        return new JAXBElement<>(_DeleteGameByIdResponse_QNAME, DeleteGameByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Game }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Game }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "game")
    public JAXBElement<Game> createGame(Game value) {
        return new JAXBElement<>(_Game_QNAME, Game.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGames }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllGames }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "getAllGames")
    public JAXBElement<GetAllGames> createGetAllGames(GetAllGames value) {
        return new JAXBElement<>(_GetAllGames_QNAME, GetAllGames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGamesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllGamesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "getAllGamesResponse")
    public JAXBElement<GetAllGamesResponse> createGetAllGamesResponse(GetAllGamesResponse value) {
        return new JAXBElement<>(_GetAllGamesResponse_QNAME, GetAllGamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGameById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGameById }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "getGameById")
    public JAXBElement<GetGameById> createGetGameById(GetGameById value) {
        return new JAXBElement<>(_GetGameById_QNAME, GetGameById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGameByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGameByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "getGameByIdResponse")
    public JAXBElement<GetGameByIdResponse> createGetGameByIdResponse(GetGameByIdResponse value) {
        return new JAXBElement<>(_GetGameByIdResponse_QNAME, GetGameByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGame }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateGame }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "updateGame")
    public JAXBElement<UpdateGame> createUpdateGame(UpdateGame value) {
        return new JAXBElement<>(_UpdateGame_QNAME, UpdateGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateGameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webServices.SoapHomeWork.example.com/", name = "updateGameResponse")
    public JAXBElement<UpdateGameResponse> createUpdateGameResponse(UpdateGameResponse value) {
        return new JAXBElement<>(_UpdateGameResponse_QNAME, UpdateGameResponse.class, null, value);
    }

}
