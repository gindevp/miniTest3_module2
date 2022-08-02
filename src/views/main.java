package views;

import model.*;
import storage.MaterialFile;

import java.util.*;

public class Main {
    private static List<Material> listMaterial = MaterialFile.readFile("Material.dat");
//data
//    static {
//
//        listMaterial.add(new CrispyFlour("1", "Bột ngô", LocalDate.of(2022, 7, 2), 9, 2));
//        listMaterial.add(new CrispyFlour("2", "Bột nếp", LocalDate.of(2022, 7, 15), 9, 2));
//        listMaterial.add(new CrispyFlour("3", "Bột gạo", LocalDate.of(2022, 7, 10), 9, 2));
//        listMaterial.add(new CrispyFlour("4", "Bột sắn", LocalDate.of(2022, 7, 10), 9, 2));
//        listMaterial.add(new CrispyFlour("5", "Bột khoai", LocalDate.of(2022, 1, 10), 9, 2));
//
//        listMaterial.add(new Meat("6", "Thịt lợn", LocalDate.of(2022, 7, 16), 9, 9));
//        listMaterial.add(new Meat("7", "Thịt gà", LocalDate.of(2022, 7, 10), 9, 9));
//        listMaterial.add(new Meat("8", "Thịt chó", LocalDate.of(2022, 7, 4), 9, 9));
//        listMaterial.add(new Meat("9", "Thịt chim", LocalDate.of(2022, 7, 15), 9, 9));
//        listMaterial.add(new Meat("10", "Thịt chuột", LocalDate.of(2022, 7, 14), 9, 9));
//    }

//thưc thi
    public static void main(String[] args) {
        Discount.discount(listMaterial);
        Display.displayList(listMaterial);
        DetailChoice.detailChoice();
        ChoiceMaterial.detailChoiceMaterial(listMaterial);
    }
}
