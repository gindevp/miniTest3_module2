package controller;

import model.Material;
import storage.MaterialFile;

import java.util.List;

public class AddMaterial {
    public static void addMaterial(List<Material> listMaterial, Material material){
        listMaterial.add(material);
        MaterialFile.writeFile(listMaterial,"Material.dat");
    }
}
