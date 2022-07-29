package controller;

import model.Material;
import storage.MaterialFile;

import java.util.List;

public class remove {
    public static void removeMaterial(List<Material> materialList, int index){
        materialList.remove(index);
        MaterialFile.writeFile(materialList);
    }

}
