package views;

import model.Material;

import java.util.List;

public class display {
    public static void displayList(List<Material> listMaterial) {
        System.out.println("List vật liệu:\n");
        int count = 0;
        for (Material x : listMaterial
        ) {
            System.out.println("index: " + count + ": " + x);
            System.out.println("          " + "Ngay het han : " + x.getExpiryDate());
            count++;
        }
    }
}
