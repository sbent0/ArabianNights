package org.academiadecodigo.bootcamp;

public class Magiclamp {

    private int maxnumberG;
    public int maxnumberGG;
    public Genie genie;
    public int rubbed = 0;
    public int gennieCounts;
    public int availableG = 0;
    public int maxnumberINITIAL;
    public int numberRechar =0;

    public Magiclamp(int maxnumberG){

        this.maxnumberG = maxnumberG;
        this.maxnumberINITIAL = maxnumberG;
        this.maxnumberGG = maxnumberG;
        this.availableG = maxnumberG;

    }

    public void Rlamp(){

            if(availableG > 0) {
                if (rubbed % 2 == 0) {
                    //PAR (FRIENDLY)



                        genie = new Genie("FRIENDLY", 6);
                        genie.sortGenie();



                } else {

                    genie = new Genie("GRUMPY", 6);
                    genie.sortGenie();
                    //IMPAR (GROMPY)
                }
                rubbed++;
                availableG--;
                this.maxnumberGG--;
            }
            else{
                genie = new Genie("DEMON", 6);
                genie.sortGenie();
            }
    }

    public void UsecheatDemon(){


        this.availableG = maxnumberINITIAL;
        System.out.println("Demon used! now you can use genies again more " + maxnumberINITIAL);
        this.numberRechar++;
    }

    public int getCapacity(){

        return this.maxnumberINITIAL;
    }

    public int getGeniesavailable(){
        return this.availableG;
    }

    public int getNumberRechar(){
        return this.numberRechar;
    }


}
