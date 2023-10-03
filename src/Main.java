public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double weight = 98; // Вес в килограммах
        double height = 1.87; // Рост в метрах

        int bmiIndex = bmiService.calculate(weight, height);
        System.out.println("BMI-индекс: " + bmiIndex);
    }

}
