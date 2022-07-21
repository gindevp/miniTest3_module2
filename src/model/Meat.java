package model;

import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
//    public LocalDate ExpirationDate(){
//        return LocalDate.EPOCH.plusDays(7);
//    }

    @Override
    public double getAmount() {
        return getCost() * this.weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate localDate= LocalDate.now();
        int dayLocal= localDate.getDayOfMonth();
        int dayDiscount;
        double realMoney=0;
        int dayExpiry = getExpiryDate().getDayOfMonth();
        if(localDate.getYear()==getManufacturingDate().getYear()&&localDate.getMonth()==getManufacturingDate().getMonth()){
            dayDiscount= dayLocal-dayExpiry;
            if(dayDiscount>5){
                realMoney= (1-getAmount()*30/100)*getAmount();
            }else {
                realMoney=(1-getAmount()*10/100)*getAmount();
            }
        }
        return realMoney;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", manufacturingDate=" + getManufacturingDate() +
                ", cost=" + getCost() + '\'' +
                ", weight=" + weight +
                '}';
    }
}
