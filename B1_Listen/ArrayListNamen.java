package B1_Listen;

import java.util.ArrayList;

public class ArrayListNamen {
    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>(); 
        namen.add("Ines");
        namen.add("Vitus");
        namen.add("Louisa");


        System.out.println(namen);

        for (String na : namen){
            System.out.println("Namen:"+na);


        }

        //Zugriff über den Index
        String s1 = namen.get(0);
        System.out.println(s1);

        namen.remove(String.valueOf("Ines"));

        System.out.println(namen);

        if(namen.contains("Louisa") & namen.contains("Vitus")){
            System.out.println("Luisa ist in der Liste und extrem heiß");
            System.out.println("Ich Liebe Louisa und nicht mehr Ines");

        }
        
        
    }
}
