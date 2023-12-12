public class BmiService {
    public BmiService() {
    }

    public int calculate(double heightMeters, double weightKilo) {
        return (int) (weightKilo / (heightMeters * heightMeters));
    }
}
