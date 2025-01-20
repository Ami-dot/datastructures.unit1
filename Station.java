public class Station {
    private String stationName;
    private int zone;

    public Station() {

    }

    public Station(String nameOfStation, int currentZone) {
        this.stationName = nameOfStation;
        this.zone = currentZone;
    }

    public String getName() {
        return stationName;
    }

    public int getZone() {
        return zone;
    }

    public String toString() {
        return "<" + stationName + ">, zone <" + zone + ">";
    }
}
