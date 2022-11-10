import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

//Creer un serveur !
public class ServerJWS {
    public static void main(String[] args) {
        //publish = permet de démarrer un petit serveur http qui vas utiliser un port 9191
        //0.0.0.0 = quelque soit @ip => n'importe quel reseau local
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web service déployé sur http://0.0.0.0:9191/");
    }
}
