package vitals;

public class Main {
    public static void main(String[] args) {
        assert(BatteryValidator.batteryIsOk(25, 70, 0.7f) == true);
        assert(BatteryValidator.batteryIsOk(50, 85, 0.0f) == false);
        assert(BatteryValidator.batteryIsOk(-5, 30, 0.5f) == false);
        assert(BatteryValidator.batteryIsOk(30, 10, 0.5f) == false);
        assert(BatteryValidator.batteryIsOk(25, 30, 0.9f) == false);
    }
}
