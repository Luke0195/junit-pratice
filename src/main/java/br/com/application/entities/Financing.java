package br.com.application.entities;


;

public class Financing {

    private Double totalAmount;
    private Double income;
    private Integer months;

    public Financing(){}

    public Financing(Double totalAmount, Double income, Integer months){
        validateBunisess(totalAmount, income, months);
        this.totalAmount = totalAmount;
        this.income = income;
        this.months = months;
    }


    public double entry(){
        return this.totalAmount * 0.2;
    }

    public double quota(){
        return (this.totalAmount - entry()) / months;
    }
    public Double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        validateBunisess(totalAmount, income, months);
        this.totalAmount = totalAmount;
    }

    public Double getIncome() {
        return this.income;
    }

    public void setIncome(Double income) {
        validateBunisess(totalAmount, income, months);
        this.income = income;
    }

    public Integer getMonths() {
        return this.months;
    }

    public void setMonths(Integer months) {
        validateBunisess(totalAmount, income, months);
        this.months = months;
    }

    public static  void validateBunisess(double totalAmount, double income, int months) throws IllegalArgumentException{
        double prestacaoComJuros = totalAmount * 0.2;
        double prestacao = (totalAmount - prestacaoComJuros) / months;

        if(prestacao > (income / 2)) throw new IllegalArgumentException();

    }
}
