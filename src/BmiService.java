public class BmiService {
    public double calculate(double m, double h) {
        double h2 = h * h;
        double result = m / h2;
        return result;
    }
}
