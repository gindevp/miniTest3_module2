package controller;

import model.Material;
import storage.MaterialFile;

import java.util.List;

public class add {
    public static void addMaterial(List<Material> listMaterial, Material material){
        listMaterial.add(material);
        MaterialFile.writeFile(listMaterial);
    }
}
