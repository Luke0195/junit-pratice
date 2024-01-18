package br.com.application;

import br.com.application.entities.Financing;

public class Main {
    public static void main(String[] args) {
        try{
            Financing financing = new Financing(100000.00, 2000.00, 80);
            System.out.println("Entrada do financiamento: "+ financing.entry());
            System.out.println("Prestação do financiamento: "+ financing.quota());

        }catch (RuntimeException e ){
            e.printStackTrace();
        }

        try{
            Financing financing1 = new Financing(100000.00, 2000.00, 80);
            System.out.println("Entrada do financiamento: "+ financing1.entry());
            System.out.println("Prestação do financiamento: "+ financing1.quota());

        }catch (RuntimeException e ){
            e.printStackTrace();
        }
    }
}