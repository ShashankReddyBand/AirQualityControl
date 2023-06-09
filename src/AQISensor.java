public class AQISensor extends Sensor {

	public Double getAQI(Double inVolt) {
		double K = 350.0;
		Double refereceLightIntensity = 1000.0;
		Double particalSize = 10.0;
		double particalDesity = 1.0;
		return (500/150)*(K*(inVolt/refereceLightIntensity))*((particalSize*particalSize)/particalDesity);
	}

}
