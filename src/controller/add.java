package controller;

import model.Material;

import java.util.List;

public class add {
    public static List<Material> addMaterial(List<Material> listMaterial, Material material){
        listMaterial.add(material);
        return listMaterial;
    }
}
