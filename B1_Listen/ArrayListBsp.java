package B1_Listen;

import java.util.ArrayList;

public class ArrayListBsp {
    public static void main(String[] args) {
        ArrayList<Integer> messwerte = new ArrayList<>(); //immer Integer schreiben bei ArrayList
        messwerte.add(3);
        messwerte.add(7);
        messwerte.add(33);
        messwerte.add(-1);

        System.out.println(messwerte);

        for (Integer mw : messwerte){
            System.out.println("Messwete:"+mw);


        }

        //Zugriff über den Index
        Integer i1 = messwerte.get(0);
        System.out.println(i1);

        messwerte.remove(Integer.valueOf(33));

        System.out.println(messwerte);

        if(messwerte.contains(-1)){
            System.out.println("-1 ist in der Liste");

        }

        
    }
}
