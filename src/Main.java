public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 186;
        double weight = 86.8;
        double bmi = service.calculate(height, weight);
        System.out.println("Ваш ИМТ: " + bmi + ". \nСпасибо за внимание. Всего доброго.");
    }
}