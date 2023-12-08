public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.87;
        double weightKilo = 98.0;
        int index = service.calculate(heightMeters, weightKilo);
        System.out.println(index);
    }
}