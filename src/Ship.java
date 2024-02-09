import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int shipId;
    private int size;
    private int value;
    private List<Coordinate> coordinates;

    public Ship(int shipId, int size, int value) {
        this.shipId = shipId;
        this.size = size;
        this.value = value;
        this.coordinates = new ArrayList<>();
    }

    public List<Coordinate> getCoordinates() {
        return new ArrayList<>(coordinates);
    }

    public void addCoordinate(Coordinate coordinate) {
        coordinates.add(coordinate);
    }

    public void removeCoordinate(Coordinate coordinate) {
        coordinates.remove(coordinate);
    }

    public void clearCoordinates() {
        coordinates.clear();
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void hit() {
        // Logic when the ship is hit
    }
}