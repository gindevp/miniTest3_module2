package controller;

import model.Material;
import java.util.List;

public class discount {
    public static void Discount(List<Material> listMaterial) {
        System.out.println("\nSố tiền chiết khấu của tất cả vật liệu :"+(sum.sumAmout(listMaterial)-sum.sumRealMoney(listMaterial))+"\n");
    }
}
