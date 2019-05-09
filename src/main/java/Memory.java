public class Memory {

    private int[] cards = {1, 1, 2,
                            2, 3, 3,
                            4, 4, 0};
    private int[] openedCards = new int[9];
    private int[] pair = new int[2];
    private boolean isSecond = false;

    public Memory() {

    }

    public int openCard(int index) {
        pair[isSecond? 1: 0] = cards[index];
        isSecond = !isSecond;
        return cards[index];
    }

    public boolean isSecondCard() {
        return isSecond;
    }

    public boolean isPair() {
        return pair[0] == pair[1];
    }

    public boolean gameWon() {
        return false;
    }
}
