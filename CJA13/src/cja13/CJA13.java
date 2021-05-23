/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cja13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author reyse
 */
interface AnonClass {

    public void anonMethod();
}

public class CJA13 {
    
    public static void main(String[] args) {
        List items = new ArrayList();
        items.add("Colador");
        items.add("Batidora");
        items.add("Biberon");
        items.add("Embudo");
        items.add("Mandolina");
        items.add("Termometro");
        items.add("Cuchara");
        items.add("Soplete");
        items.add("Plato");
        items.add("Tenedor");
        
        System.out.println("Sin ordenamiento:");
        items.forEach(System.out::println);
        
        Comparator<String> stringLengthComparator = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());
        Collections.sort(items, stringLengthComparator);
        System.out.println("\nOrdenamiento por longitud:");
        items.forEach(System.out::println);
        
        Collections.sort(items, Comparator.naturalOrder());
        System.out.println("\nOrdenamiento por orden alfabetico:");
        items.forEach(System.out::println);
        
        AnonClass anon = () -> {
            System.out.println("\nDentro del metodo de la clase anonima");
            Collections.sort(items, stringLengthComparator);
            System.out.println("Ordenamiento por longitud:");
            items.forEach(System.out::println);
            
            System.out.println("\nOrdenamiento por orden alfabetico:");
            Collections.sort(items, Comparator.naturalOrder());
            items.forEach(System.out::println);
        };

        anon.anonMethod();
    }
}