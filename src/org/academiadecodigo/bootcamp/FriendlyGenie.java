package org.academiadecodigo.bootcamp;

public class FriendlyGenie extends Genie {

    //int numberWishesavailable

    public FriendlyGenie(String typeG, int numberWishes){

        super(typeG, numberWishes );
    }

    public void getWish(int numberWishes){

        //this.numberWishesavailable = numberWishes
        for(int i=1;i<=numberWishes+1;i++){

            System.out.println("Wish number: " + i);
        }
    }
}
