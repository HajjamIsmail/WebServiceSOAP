import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

//appartir de wsdl => il va generer le code java
public class ClientWS {
    public static void main(String[] args) {
        //Creer un middleware :
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        //appel d'une methode "convert" d'un web service
        System.out.println(stub.convert(7600));
        //consulter un compte :
        Compte cp = stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
