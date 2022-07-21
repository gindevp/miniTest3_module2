package views;

import controller.add;
import controller.edit;
import controller.remove;
import controller.discount;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    //Hằng số
    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICEDETAIL = 4;
    static final int CHOICEDISCOUNT = 5;
    static final int CHOICEEXIT = 6;

    //data
    private static List<Material> listMaterial = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scanner1 = new Scanner(System.in);

    static {

        listMaterial.add(new CrispyFlour("1", "Bột ngô", LocalDate.of(2022, 7, 2), 9, 2));
        listMaterial.add(new CrispyFlour("2", "Bột nếp", LocalDate.of(2022, 7, 15), 9, 2));
        listMaterial.add(new CrispyFlour("3", "Bột gạo", LocalDate.of(2022, 7, 10), 9, 2));
        listMaterial.add(new CrispyFlour("4", "Bột sắn", LocalDate.of(2022, 7, 10), 9, 2));
        listMaterial.add(new CrispyFlour("5", "Bột khoai", LocalDate.of(2022, 1, 10), 9, 2));

        listMaterial.add(new Meat("6", "Thịt lợn", LocalDate.of(2022, 7, 16), 9, 9));
        listMaterial.add(new Meat("7", "Thịt gà", LocalDate.of(2022, 7, 10), 9, 9));
        listMaterial.add(new Meat("8", "Thịt chó", LocalDate.of(2022, 7, 4), 9, 9));
        listMaterial.add(new Meat("9", "Thịt chim", LocalDate.of(2022, 7, 15), 9, 9));
        listMaterial.add(new Meat("10", "Thịt chuột", LocalDate.of(2022, 7, 14), 9, 9));
    }

    public static void detailChoice() {
        System.out.println("\nDanh sách lựa chọn:");
        System.out.println("1: Thêm vật liệu\n2: Sửa vật liệu\n3: Xóa vật liệu\n4: Show list vật liệu\n5: Tính chiết khấu ngày hôm nay của tất cả vật liệu\n6: Exit");
        System.out.println("Mời nhập lựa chọn:");
    }

    public static void main(String[] args) {
        discount.Discount(listMaterial);
        displayList();
        detailChoice();
        detailChoiceMaterial();

    }


    public static void choiceMaterialAdd() {
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
                add.addMaterial(listMaterial, cf);
                detailChoice();
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
                add.addMaterial(listMaterial, cf);
                detailChoice();
                break;
            } else if (choice1 == 3) {
                detailChoice();
                break;
            } else {
                System.out.println("nhập lại đi:");
                choice1 = scanner.nextInt();
            }
        }
    }

    public static void detailChoiceMaterial() {
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    choiceMaterialAdd();
                    break;
                case CHOICEEDIT:
                    System.out.println("Mời nhập index vật liệu cần sửa: ");
                    int indexEdit = scanner.nextInt();
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
                    edit.editMaterial(listMaterial, indexEdit, cf);
                    detailChoice();
                    //edit
                    break;
                case CHOICEREMOVE:
                    //remove
                    System.out.println("Mời nhập index vật liệu cần xóa: ");
                    int indexRemote = scanner.nextInt();
                    remove.remoteMaterial(listMaterial, indexRemote);
                    detailChoice();
                    break;
                case CHOICEEXIT:
                    //exit
                    System.exit(0);
                    break;
                case CHOICEDETAIL:
                    //detail list
                    displayList();
                    detailChoice();
                    break;
                case CHOICEDISCOUNT:
                    //tinh discount
                    discount.Discount(listMaterial);
                    break;
                default:
                    System.out.println("mời bạn nhập lại:");
                    break;
            }
        }
    }

    public static void displayList() {
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
