package com.alkomprar.models;

import com.alkomprar.utils.Excel;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Productos {
    private static ArrayList<Map<String, String>> productos= new ArrayList<>();

    public static ArrayList<Map<String, String>> data(){

        try {
            productos = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "productos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productos;
    }
}
