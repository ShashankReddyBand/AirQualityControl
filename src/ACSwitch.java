public class ACSwitch extends Switch {

    public void switchOn(int round) {
        System.out.println("AC: ON");
        Readings readings = new Readings();
        readings.updateReadings(round, 2, -5.0);
    }
    
    public void switchOff() {
        System.out.println("AC: OFF");
    }
}
