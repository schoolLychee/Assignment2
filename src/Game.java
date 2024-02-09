import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Game {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private GameType gameType;
    private List<Round> rounds;
    private List<Player> players;
    private Player winner;
    private int points;

    public Game(LocalDateTime startTime, LocalDateTime endTime, GameType gameType, Player winner, int points) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.gameType = gameType;
        this.rounds = new ArrayList<>();;
        this.players = new ArrayList<>();;
        this.winner = winner;
        this.points = points;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void startGame() {
        this.startTime = LocalDateTime.now(); // Assuming DateTime is a class representing the current date and time
    }

    public void endGame() {
        this.endTime = LocalDateTime.now();
        determineWinner();
    }

    private void determineWinner() {
        // Logic to determine the winner based on game rules
        // Set the winner and update points
    }

    public void addRound(Round round) {
        if (rounds.size() < getMaxRounds()) {
            rounds.add(round);
        } else {
            System.out.println("Error: Maximum number of rounds reached.");
        }
    }

    public void removeRound(Round round) {
        rounds.remove(round);
    }

    public List<Round> listAllRounds() {
        return rounds;
    }

    public void addPlayer(Player player) {
        if (players.size() < getMaxPlayers()) {
            players.add(player);
        } else {
            System.out.println("Error: Maximum number of players reached.");
        }
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public List<Player> listAllPlayers() {
        return players;
    }

    private int getMaxRounds() {
        return 45;
    }

    private int getMaxPlayers() {
        return 2;
    }
}
