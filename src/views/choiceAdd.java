package views;

import controller.AddMaterial;
import model.*;
import java.time.LocalDate;
import java.util.*;

public class ChoiceAdd {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scanner1 = new Scanner(System.in);
    public static void choiceMaterialAdd(List<Material> listMaterial) {
        System.out.println("BẠN ĐÃ CHỌN ADD:\n");
        System.out.println("1: Thêm bột\n2: Thêm thịt\n3: Nhập lại lựa chọn trước đó");
        int choice1 = scanner.nextInt();
        while (true) {
            if (choice1 == 1) {
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
                System.out.println("Mời nhập số lượng:");
                double quantity = scanner.nextDouble();
                CrispyFlour cf = new CrispyFlour(id, name, localDate, cost, quantity);
                AddMaterial.addMaterial(listMaterial, cf);
                DetailChoice.detailChoice();
                break;
            } else if (choice1 == 2) {
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
                System.out.println("Mời nhập cân nặng:");
                double weight = scanner.nextDouble();
                Meat cf = new Meat(id, name, localDate, cost, weight);
                AddMaterial.addMaterial(listMaterial, cf);
                DetailChoice.detailChoice();
                break;
            } else if (choice1 == 3) {
                DetailChoice.detailChoice();
                break;
            } else {
                System.out.println("nhập lại đi:");
                choice1 = scanner.nextInt();
            }
        }
    }
}
