package controller;

import model.Material;

import java.util.List;

public class remove {
    public static List<Material> remoteMaterial(List<Material> materialList, int index){
        materialList.remove(index);
        return materialList;
    }

}
