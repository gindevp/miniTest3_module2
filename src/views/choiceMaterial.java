package views;

import controller.*;
import model.*;
import java.time.LocalDate;
import java.util.*;
public class choiceMaterial {
    //hằng
    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICEDETAIL = 4;
    static final int CHOICEDISCOUNT = 5;
    static final int CHOICEEXIT = 6;

    //data
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scanner1 = new Scanner(System.in);
    static void detailChoiceMaterial(List<Material> listMaterial) {
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    choiceAdd.choiceMaterialAdd(listMaterial);
                    break;
                case CHOICEEDIT:
                    System.out.println("Mời nhập index vật liệu cần sửa: ");
                    int indexEdit = scanner.nextInt();
                    System.out.println("Phần tử muốn edit:"+listMaterial.get(indexEdit));
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
                            edit.editMaterial(listMaterial, indexEdit, cf);
                            detailChoice.detailChoice();
                        }else {
                            System.out.println("Mời nhập cân nặng:");
                            double weight= scanner.nextDouble();
                            Meat m = new Meat(id, name, localDate, cost, weight);
                            edit.editMaterial(listMaterial, indexEdit, m);
                            detailChoice.detailChoice();
                        }
                    //edit
                    break;
                case CHOICEREMOVE:
                    //remove
                    System.out.println("Mời nhập index vật liệu cần xóa: ");
                    int indexRemote = scanner.nextInt();
                    remove.removeMaterial(listMaterial, indexRemote);
                    detailChoice.detailChoice();
                    break;
                case CHOICEEXIT:
                    //exit
                    System.exit(0);
                    break;
                case CHOICEDETAIL:
                    //detail list
                    display.displayList(listMaterial);
                    detailChoice.detailChoice();
                    break;
                case CHOICEDISCOUNT:
                    //tinh discount
                    discount.Discount(listMaterial);
                    System.out.println("Mời nhập lựa chọn:");
                    break;
                default:
                    System.out.println("mời bạn nhập lại:");
                    break;
            }
        }
    }

}
