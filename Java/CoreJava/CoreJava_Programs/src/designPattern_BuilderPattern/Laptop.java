package designPattern_BuilderPattern;
public class Laptop {
    private String procesor;
    private int ram;
    private String memory;
    private int screeSize;

    public Laptop(String procesor, int ram, String memory, int screeSize) {
        this.procesor = procesor;
        this.ram = ram;
        this.memory = memory;
        this.screeSize = screeSize;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "procesor='" + procesor + '\'' +
                ", ram=" + ram +
                ", memory='" + memory + '\'' +
                ", screeSize=" + screeSize +
                '}';
    }
}
