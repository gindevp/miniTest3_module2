package views;

import controller.SumMaterial;
import model.Material;
import java.util.List;

public class Discount {
    public static void discount(List<Material> listMaterial) {
        System.out.println("\nSố tiền chiết khấu của tất cả vật liệu :"+(SumMaterial.sumAmout(listMaterial)- SumMaterial.sumRealMoney(listMaterial))+"\n");
    }
}
