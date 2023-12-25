package org.example;

import proxy.BAnqueWS;
import proxy.BanqueService;
import proxy.Compte;

import java.util.List;


public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy=new BAnqueWS().getBanqueServicePort();
        System.out.println(proxy.conversationEuroToDH(11));
        Compte cp=proxy.getCompte(5);
        System.out.println("Code ="+cp.getCode());
        System.out.println("Sole ="+cp.getSolde());
        System.out.println("Date de création :"+cp.getDateCreation());
        List<Compte> compteList=proxy.listComptes();
        for (Compte c:compteList){
            System.out.println("--------------------");
            System.out.println("Code ="+c.getCode());
            System.out.println("Sole ="+cp.getSolde());
            System.out.println("Date de création :"+cp.getDateCreation());

        }
    }
}
