package designPattern_BuilderPattern;

public class Builder {
    private String procesor;
    private int ram;
    private String memory;
    private int screeSize;

    public Builder setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    public Builder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Builder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public Builder setScreeSize(int screeSize) {
        this.screeSize = screeSize;
        return this;
    }
    public Laptop getLaptop(){
        return new Laptop(procesor,ram,memory,screeSize);
    }
}
