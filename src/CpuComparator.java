import java.util.Comparator;

public class Cpu implements Comparable<Computer> {

    @Override
    public int compareTo(Computer c) {
        int cpuCompare = cpu.compareTo(c.cpu);
        if (cpu > c.cpu)
            return cpuCompare;
        else if (cpu < c.cpu)
            return cpu.compareTo(c.cpu);
        return cpuCompare;
    }
}