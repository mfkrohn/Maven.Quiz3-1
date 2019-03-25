package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("PAPER"),PAPER("SCISSOR"),SCISSOR("ROCK");

    String winner;

    RockPaperScissorHandSign(String winner) {
        this.winner = winner;
    }

    public RockPaperScissorHandSign getWinner() {
        return RockPaperScissorHandSign.valueOf(winner);
    }

    public RockPaperScissorHandSign getLoser() {
        return RockPaperScissorHandSign.valueOf(getWinner().winner);
    }
}
