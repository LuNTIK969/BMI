public class BmiService {
    public double calculate(double height, double weight) {
        double aHeight = height / 100;
        double sqHeight = aHeight * aHeight;
        return weight / sqHeight;
    }
}
