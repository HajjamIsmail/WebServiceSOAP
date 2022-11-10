package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
//POJO = plain old java object => simple class java
//indequer que c'est un web service
//chaque methode d'un webservice doit etre indiquer => "WebMethode"
//chaque parametre d'une fonction d'un web service doit etre indiquer => "WebParam"
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10.54;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*9888, new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, Math.random()*9888, new Date()),
                new Compte(2, Math.random()*9888, new Date()),
                new Compte(3, Math.random()*9888, new Date())
        );
    }
}
