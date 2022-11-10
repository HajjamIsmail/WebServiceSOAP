using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClientWS_CSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            ServiceReference1.BanqueServiceClient stub = new ServiceReference1.BanqueServiceClient();
            Console.WriteLine("--------------------Conversion--------------------");
            Console.WriteLine(stub.Convert(34));
            Console.WriteLine("--------------------Consulter un compte--------------------");
            ServiceReference1.compte cp = stub.getCompte(2);
            Console.WriteLine("Solde = " + cp.solde);
            Console.WriteLine("--------------------Liste des compte--------------------");
            ServiceReference1.compte[] listcpt = stub.listComptes();
            for(int i = 0; i < listcpt.Length; i++)
            {
                Console.WriteLine(listcpt[i].code + "  " + listcpt[i].solde);
            }
            Console.ReadLine();
        }
    }
}
