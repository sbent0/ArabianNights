package org.academiadecodigo.bootcamp;

public class GameStage {

    public static void main(String[] args) {
        Magiclamp magiclamp1 = new Magiclamp(6);
        Magiclamp magiclamp2 = new Magiclamp(10);

        for(int i=0; i<=10;i++){

            magiclamp1.Rlamp();

        }

        magiclamp1.UsecheatDemon();
        magiclamp1.Rlamp();
        magiclamp1.Rlamp();

       // for(int i=0; i<=8;i++){ magiclamp2.Rlamp(); }

        magiclamp2.Rlamp();
        magiclamp2.Rlamp();

        magiclamp1.Rlamp();
        System.out.println("LAMP1 | CAPACITY: " + magiclamp1.getCapacity() + "  GENIES AVAILABLE: " + magiclamp1.getGeniesavailable() + " TIMES RECHARGED:  " + magiclamp1.getNumberRechar());
        System.out.println("LAMP2 | CAPACITY: " + magiclamp2.getCapacity() + "  GENIES AVAILABLE: " + magiclamp2.getGeniesavailable() + " TIMES RECHARGED:  " + magiclamp2.getNumberRechar());






    }
}
