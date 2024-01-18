package factories;

import br.com.application.entities.Financing;

public final class FinancingFactory {
    private FinancingFactory(){}
    public static Financing makeFinancing(){
        return  new Financing(100000.00, 2000.00, 80);
    }
    public static Financing makeFinancingWithParams(double totalAmmount , double income, int months){
        return new Financing(totalAmmount, income, months);
    }
}
