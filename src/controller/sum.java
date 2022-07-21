package controller;

import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.util.List;

public class sum {
    public static double sumAmout(List<Material> listMaterial) {
        double sumAmount =0;
        for (Material x: listMaterial
        ) {
            sumAmount += x.getAmount();
        }
        return sumAmount;
    }
    public   static double sumRealMoney(List<Material> listMaterial){
        double sumRealMoney=0;
        for (Material x: listMaterial
        ) {
            if(x instanceof Meat){
                Meat y= (Meat) x;
                sumRealMoney+=y.getRealMoney();
            }
            if(x instanceof CrispyFlour){
                CrispyFlour y= (CrispyFlour) x;
                sumRealMoney+=y.getRealMoney();
            }
        }
        return sumRealMoney;
    }
}
