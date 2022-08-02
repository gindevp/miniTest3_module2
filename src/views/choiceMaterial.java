package views;

import controller.*;
import model.*;
import java.util.*;
public class ChoiceMaterial {
    //hằng
    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICEDETAIL = 4;
    static final int CHOICEDISCOUNT = 5;
    static final int CHOICEEXIT = 6;
    static final void exit() {
        System.exit(0);
    }

    //data
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scanner1 = new Scanner(System.in);
    static void detailChoiceMaterial(List<Material> listMaterial) {
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    ChoiceAdd.choiceMaterialAdd(listMaterial);
                    break;
                case CHOICEEDIT:
                    ChoiceEdit.choiceEdit(listMaterial);
                    //edit
                    break;
                case CHOICEREMOVE:
                    //remove
                    ChoiceRemove.choiceRemove(listMaterial);
                    break;
                case CHOICEEXIT:
                    //exit
                    exit();
                    break;
                case CHOICEDETAIL:
                    //detail list
                    Display.displayList(listMaterial);
                    DetailChoice.detailChoice();
                    break;
                case CHOICEDISCOUNT:
                    //tinh discount
                    Discount.discount(listMaterial);
                    System.out.println("Mời nhập lựa chọn:");
                    break;
                default:
                    System.out.println("mời bạn nhập lại:");
                    break;
            }
        }
    }




}
