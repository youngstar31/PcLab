public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(25,12,25);
        Resolution resolution = new Resolution(3840,2160);
        Case pcCase = new Case("Digital Storm","HP","Corsair RM850x",dimensions);
        Motherboard motherboard = new Motherboard("ROG Maximus XII Extreme","Asus",4,2,"Core Speed ........ 2.48GHz");
        Monitor monitor = new Monitor(resolution,"Razor","Raptor 27");


       PC pc1 = new PC(pcCase ,motherboard,monitor);
       pc1.description();
       pc1.powerUp();

    }

}
