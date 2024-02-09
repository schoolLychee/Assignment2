public class ComputerPlayer extends Player {
    private DifficultyLevel difficultyLevel; // 记录计算机玩家的难度级别，比如 "Easy", "Medium", "Hard"

    // 构造方法
    public ComputerPlayer(int playerId, String playerName, int points, DifficultyLevel difficultyLevel) {
        super(playerId, playerName, PlayerType.COMPUTER, points); // 调用父类构造方法
        this.difficultyLevel = difficultyLevel;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}

