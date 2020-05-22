import java.util.Comparator;

public class MemoryComparator implements Comparable<Computer> {

    @Override
    public int compareTo(Computer c) {
        int ramCompare = ram.compareTo(c.ram);
        if (ram > c.ram)
            return ramCompare;
        else if (ram < c.ram)
            return ram.compareTo(c.ram);
        return ramCompare;
    }

}