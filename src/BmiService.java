public class BmiService {
    public double calculate(double weight, double height) {
        double h2 = height * height;
        double result = weight / h2;
        return result;
    }
}
