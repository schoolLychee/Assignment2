public class Round {
    private int roundNumber;
    private Torpedo player1Move;
    private Torpedo player2Move;

    public Round(int roundNumber, Torpedo player1Move, Torpedo player2Move) {
        this.roundNumber = roundNumber;
        this.player1Move = player1Move;
        this.player2Move = player2Move;
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

    public Torpedo getPlayer1Move() {
        return player1Move;
    }

    public void setPlayer1Move(Torpedo player1Move) {
        this.player1Move = player1Move;
    }

    public Torpedo getPlayer2Move() {
        return player2Move;
    }

    public void setPlayer2Move(Torpedo player2Move) {
        this.player2Move = player2Move;
    }
}