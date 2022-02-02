package org.academiadecodigo.bootcamp;

public class Genie {

    String TypeG;
    private int numberWishes;

    public Genie(String typeG, int numberWishes){

        this.TypeG = typeG;
        this.numberWishes = numberWishes;


        }



 public void Teste(){

     System.out.println("Im on Genie class");

 }

    public void sortGenie(){

        if(this.TypeG == "FRIENDLY") {

            FriendlyGenie THATGenie = new FriendlyGenie(this.TypeG, this.numberWishes);
            THATGenie.getWish(this.numberWishes);

        }
        else if(this.TypeG == "GRUMPY") {

            GrumpyGenie THATGenie = new GrumpyGenie(this.TypeG, this.numberWishes);
            THATGenie.getWish();

        }
        else if(this.TypeG == "DEMON") {

            RDemon THATGenie = new RDemon(this.TypeG, this.numberWishes);
            THATGenie.getWish();

        }


    }


 public int getnumberWishes(){

        return this.numberWishes;

 }

 public void setnumberWishes(){

        this.numberWishes--;

    }

}
