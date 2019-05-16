import java.util.ArrayList;
import java.util.List;

public class Memory {


    private int[] cards = {1, 1, 2,
            2, 3, 3,
            4, 4, 0};

    private int sumOpenCard = 0;
    private List<Integer> openedNumbers = new ArrayList<>();

    private int[] pair = new int[2];

    private boolean isSecond = false;

    public int openCard(int index) {
        pair[isSecond ? 1 : 0] = cards[index];
        isSecond = !isSecond;
        if(isPair()) {
            sumOpenCard += cards[index] * 2;
            openedNumbers.add(cards[index]);
        }
        System.out.println(toString());
        return cards[index];
    }

    public boolean isSecondCard() {
        return isSecond;
    }

    public boolean isPair() {
        return pair[0] == pair[1];

        /*boolean b = pair[0] == pair[1];
        if (b) {
            sumOpenCard += cards[index] * 2;
            return true;
        } else {
            return false;
        }*/

    }

    public boolean gameWon() {
        int sum=0;
        for (int i : cards) {
            sum+=i;
        }
        return sum == sumOpenCard;
    }

    public String toString() {
        return "<tr>\n" +
                "                    <td onclick=\"openUp(0)\">it works</td>\n" +
                "                    <td onclick=\"openUp(1)\"></td>\n" +
                "                    <td onclick=\"openUp(2)\"></td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td onclick=\"openUp(3)\"></td>\n" +
                "                    <td onclick=\"openUp(4)\"></td>\n" +
                "                    <td onclick=\"openUp(5)\"></td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td onclick=\"openUp(6)\"></td>\n" +
                "                    <td onclick=\"openUp(7)\"></td>\n" +
                "                    <td onclick=\"openUp(8)\"></td>\n" +
                "                </tr>";




        /*String str = "\n";
        for(int i = 0; i < cards.length; i++) {
            if(openedNumbers.contains(cards[i]))
                str += " - " + cards[i];
            else
                str += " - " + "X";
            if((i + 1) % 3 == 0)
                str += "\n";
        }
        return str;*/
    }
}
