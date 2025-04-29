package lab15.sict.must.edu.mn;

public class Division {

    /**
     * Divide two double numbers.
     *
     * @param a хуваагдагч
     * @param b хуваагч
     * @return үр дүн
     * @throws IllegalArgumentException тэгээр хуваах үед
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}
