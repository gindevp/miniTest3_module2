package views;

import controller.EditMaterial;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ChoiceEdit {
    static Scanner scanner= new Scanner(System.in);
    static Scanner scanner1= new Scanner(System.in);

     static void choiceEdit(List<Material> listMaterial) {
        System.out.println("Mời nhập index vật liệu cần sửa: ");
        int indexEdit = scanner.nextInt();
        System.out.println("Phần tử muốn edit:"+ listMaterial.get(indexEdit));
        boolean type= listMaterial.get(indexEdit) instanceof Meat;
        System.out.println("Mời nhập id:");
        String id = scanner1.nextLine();
        System.out.println("Mời nhập name:");
        String name = scanner1.nextLine();
        System.out.println("Mời nhập day:");
        int day = scanner.nextInt();
        System.out.println("Mời nhập tháng:");
        int month = scanner.nextInt();
        System.out.println("Mời nhập năm:");
        int year = scanner.nextInt();
        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println("Mời nhập giá:");
        int cost = scanner.nextInt();
        if(!type){
            System.out.println("Mời nhập số lượng:");
            double quantity = scanner.nextDouble();
            CrispyFlour cf = new CrispyFlour(id, name, localDate, cost, quantity);
            EditMaterial.editMaterial(listMaterial, indexEdit, cf);
            DetailChoice.detailChoice();
        }else {
            System.out.println("Mời nhập cân nặng:");
            double weight= scanner.nextDouble();
            Meat m = new Meat(id, name, localDate, cost, weight);
            EditMaterial.editMaterial(listMaterial, indexEdit, m);
            DetailChoice.detailChoice();
        }
    }
}
