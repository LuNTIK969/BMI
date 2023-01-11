public class BmiService {
    public double calculate(double height, double weight) {
        double sqHeight = height * height;
        double bmi = weight / sqHeight;
        return bmi;
    }
}
