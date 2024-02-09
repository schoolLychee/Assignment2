import java.util.ArrayList;
import java.util.List;

public class Player {
    private int playerId;
    private String playerName;
    private PlayerType playerType;
    private List<Game> games;
    private List<Torpedo> torpedoes;
    private List<Ship> ships;
    private int points;

    public Player(int playerId, String playerName, PlayerType playerType, int points) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerType = playerType;
        this.torpedoes = new ArrayList<>();
        this.ships = new ArrayList<>();
        this.points = points;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public List<Torpedo> getTorpedoes() {
        return torpedoes;
    }

    public void setTorpedoes(List<Torpedo> torpedoes) {
        this.torpedoes = torpedoes;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void throwTorpedo() {
        // Logic to throw a torpedo
    }

    public void positionShips() {
        // Logic to position ships
    }

    public void loseShip(Ship ship) {
        // Logic when a ship is lost
    }

    public void addTorpedo(Torpedo torpedo) {
        if (torpedoes.size() < 45) {
            torpedoes.add(torpedo);
        } else {
            System.out.println("Cannot add more torpedoes. Maximum limit reached.");
        }
    }

    public void removeTorpedo(Torpedo torpedo) {
        torpedoes.remove(torpedo);
    }

    public List<Torpedo> listTorpedoes() {
        return torpedoes;
    }

    public void addShip(Ship ship) {
        if (ships.size() < 6) {
            ships.add(ship);
        } else {
            System.out.println("Cannot add more ships. Maximum limit reached.");
        }
    }

    public void removeShip(Ship ship) {
        ships.remove(ship);
    }

    public List<Ship> listShips() {
        return ships;
    }
}
