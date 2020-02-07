public class Line {
    public static String Tickets(int[] peopleInLine) {
        int count25 = 0;
        int count50 = 0;
        int count100 = 0;

        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                count25++;
            }
            if (peopleInLine[i] == 50) {
                count50++;
            }
            if (peopleInLine[i] == 100) {
                count100++;
            }
        }
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 100) {
                if (count50 >= 1 && count25 >= 1) {
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    count25 -= 3;
                } else {
                    return "NO";
                }
            }
            if (peopleInLine[i] == 50) {
                if (count25 >= 1) {
                    count25--;
                } else {
                    return "NO";
                }
            }

        }
        return "YES";
    }
}
