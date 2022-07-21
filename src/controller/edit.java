package controller;

import model.Material;

import java.util.List;

public class edit {
    public static List<Material> editMaterial(List<Material> materialList, int index, Material material){
        System.out.println("Phần tử muốn edit:"+materialList.get(index));
        materialList.set(index,material);
        return materialList;
    }
}
