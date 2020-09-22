public class PC {

    private Dimensions dimensions;
    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;


    public PC(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;

    }


    private void drawLogo(){
        this.monitor.drawPixelAt(3,22,"Red");


    }

    public void drawPixel(){



    }



    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today " + "\n");
        System.out.println(pcCase.toString());
        System.out.println(monitor.toString());
        System.out.println(motherboard.toString());

    }

    public void powerUp(){
        this.pcCase.pressPowerButton();
        drawLogo();
        this.motherboard.loadProgram("First Program");


    }

    @Override
    public String toString() {
        return "PC{" +
                ", pcCase=" + pcCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }


}
