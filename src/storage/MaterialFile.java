package storage;

import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialFile {

    public static void writeFile(List<Material> materials){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Material.dat");
            ObjectOutputStream ost = new ObjectOutputStream(fileOutputStream);
            ost.writeObject(materials);
            ost.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Material> readFile(){
        try {
            FileInputStream fis = new FileInputStream("Material.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            List<Material> materials = (List<Material>) ob;
            ois.close();
            fis.close();
            return materials;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
//        List<Material> listMaterial = new ArrayList<>();
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
//
//        writeFile(listMaterial);
        List<Material> listMaterial = readFile();
        System.out.println(listMaterial);
    }
}
