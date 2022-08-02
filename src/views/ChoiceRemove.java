package views;

import controller.RemoveMaterial;
import model.Material;

import java.util.List;
import java.util.Scanner;

public class ChoiceRemove {
    static Scanner scanner= new Scanner(System.in);
     static void choiceRemove(List<Material> listMaterial) {
        System.out.println("Mời nhập index vật liệu cần xóa: ");
        int indexRemote = scanner.nextInt();
        RemoveMaterial.removeMaterial(listMaterial, indexRemote);
        DetailChoice.detailChoice();
    }
}
