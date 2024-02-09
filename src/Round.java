import java.util.ArrayList;
import java.util.List;

public class Round {
    private int roundNumber;
    private List<Torpedo> player1Move;
    private List<Torpedo> player2Move;

    public Round(int roundNumber, Torpedo player1Move, Torpedo player2Move) {
        this.roundNumber = roundNumber;
        this.player1Move = new ArrayList<>();;
        this.player2Move = new ArrayList<>();;
    }

    public void playRound() {
        // Logic to play a round
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public List<Torpedo> getPlayer1Move() {
        return player1Move;
    }

    public void setPlayer1Move(List<Torpedo> player1Move) {
        this.player1Move = player1Move;
    }

    public List<Torpedo> getPlayer2Move() {
        return player2Move;
    }

    public void setPlayer2Move(List<Torpedo> player2Move) {
        this.player2Move = player2Move;
    }
}