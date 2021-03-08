package vitals;

public class BatteryValidator {
	static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
		return isTemperatureOk(temperature) && isSOCOk(soc) && isChargeRateOk(chargeRate);
	}

	public static boolean isTemperatureOk(float temperature) {
		if (isLower(temperature, BatteryConstants.LOWER_TEMPERATURE)
				|| isHigher(temperature, BatteryConstants.HIGHER_TEMPERATURE)) {
			printErrorMessage(BatteryConstants.TEMPERATURE);
			return false;
		}
		return true;
	}

	public static boolean isSOCOk(float soc) {
		if (isLower(soc, BatteryConstants.LOWER_SOC) || isHigher(soc, BatteryConstants.HIGHER_SOC)) {
			printErrorMessage(BatteryConstants.STATE_OF_CHARGE);
			return false;
		}
		return true;

	}

	public static boolean isLower(float actualValue, float standardValue) {
		return actualValue < standardValue;
	}

	public static boolean isHigher(float actualValue, float standardValue) {
		return actualValue > standardValue;
	}

	public static boolean isChargeRateOk(float chargeRate) {
		if (isHigher(chargeRate, BatteryConstants.HIGHER_CHARGERATE)) {
			printErrorMessage(BatteryConstants.CHARGE_RATE);
			return false;
		}
		return true;

	}

	public static void printErrorMessage(String parameter) {
		System.out.print(parameter);
		System.out.println(" is out of range!");
	}
}
