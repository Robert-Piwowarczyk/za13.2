import java.util.Comparator;

public class Computer implements Comparable<Computer> {
    String name;
    int cpu;
    int ram;

    public Computer(String name, int cpu, int ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int  compareTo(Computer c) {
        int nameCompare = name.compareTo(c.name);
        if (nameCompare != 0)
            return nameCompare;
        return name.compareTo(c.name);
    }
}
