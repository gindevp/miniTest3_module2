package model;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

//    public LocalDate ExpirationDate(){
//        return LocalDate.EPOCH.plusYears(1);
//    }

    @Override
    public double getAmount() {
        return getCost() * quantity;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate localDate = LocalDate.now();
        int dayLocal = localDate.getMonthValue();
        int dayDiscount;
        double realMoney = 0;
        int dayExpiry = getExpiryDate().getMonthValue();
        if (localDate.getYear() == getManufacturingDate().getYear()) {
            dayDiscount = dayLocal - dayExpiry;
            if (dayDiscount > 10) {
                realMoney = (1 - getAmount() * 40 / 100) * getAmount();
            } else if (dayDiscount > 8) {
                realMoney = (1 - getAmount() * 20 / 100) * getAmount();
            } else {
                realMoney = (1 - getAmount() * 5 / 100) * getAmount();
            }
        }
        if (localDate.getYear() == getManufacturingDate().getYear() + 1) {
            dayDiscount = 12 + dayLocal - dayExpiry;
            if (dayDiscount > 10) {
                realMoney = (1 - getAmount() * 40 / 100) * getAmount();
            } else if (dayDiscount > 8) {
                realMoney = (1 - getAmount() * 20 / 100) * getAmount();
            } else {
                realMoney = (1 - getAmount() * 5 / 100) * getAmount();
            }
        }
        return realMoney;
    }
    @Override
    public String toString() {
        return "CrispyFlour{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", manufacturingDate=" + getManufacturingDate() +
                ", cost=" + getCost() + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
