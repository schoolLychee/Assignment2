public class HumanPlayer extends Player {
    private int age; // 记录玩家的性别
    private String nationality; // 记录玩家的国籍

    // 构造方法
    public HumanPlayer(int playerId, String playerName, int points, int age, String nationality) {
        super(playerId, playerName, PlayerType.HUMAN, points); // 调用父类构造方法
        this.age = age;
        this.nationality = nationality;
    }

    public int getGender() {
        return age;
    }

    public void setGender(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}