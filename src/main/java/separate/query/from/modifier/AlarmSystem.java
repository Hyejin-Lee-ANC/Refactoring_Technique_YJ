package separate.query.from.modifier;

import java.util.List;

public class AlarmSystem {
    private final PassengerScanner scanner;

    public AlarmSystem(PassengerScanner scanner) {
        this.scanner = scanner;
    }

    public void patrol() {
        List<String> passengers = getPassengers();
        String miscreant = alertForMiscreant(passengers);
        notify(miscreant);
    }

    void notify(String miscreant) {
        System.out.println("Alarm!! " + miscreant + " found.");
    }

    private List<String> getPassengers() {
        return scanner.getPassengers();
    }

    String alertForMiscreant(List<String> people) {
        for (String p : people) {
            if ("Don".equals(p)) {
                setOffAlarms();
                return "Don";
            }
            if ("John".equals(p)) {
                setOffAlarms();
                return "John";
            }
        }
        return "";
    }

    void setOffAlarms() {
        System.out.println("set off alarms");
    }
}
