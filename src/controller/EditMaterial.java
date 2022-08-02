package controller;

import model.Material;
import storage.MaterialFile;

import java.util.List;

public class EditMaterial {
    public static void editMaterial(List<Material> materialList, int index, Material material){
        materialList.set(index,material);
        MaterialFile.writeFile(materialList,"Material.dat");
    }
}
