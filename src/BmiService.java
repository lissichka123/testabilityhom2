public class BmiService {
    public BmiService() {
    }

    public int calculate(double heightMeters, double weightKilo) {
        int index = (int)(weightKilo / (heightMeters * heightMeters));
        return index;
    }
}
