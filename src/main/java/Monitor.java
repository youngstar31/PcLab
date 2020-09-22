public class Monitor {

    private Resolution resolution;
    private String manufacturer;
    private String model;

    public Monitor( Resolution resolution , String manufacturer, String model) {
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


     void drawPixelAt(int a, int b, String color){
        System.out.println("Drawing pixel at " + a + "," + b + " in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
