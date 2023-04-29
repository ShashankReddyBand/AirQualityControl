public class AirPurifierSwitch extends Switch {
    public void switchOn(int round) {
        System.out.println("AirFilter: ON");
        Readings readings = new Readings();
        readings.updateReadings(round, 1, -0.02);
    }
    
    public void switchOff() {
        System.out.println("AirFilter: OFF");
    }
}
