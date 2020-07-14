import java.util.Arrays;

class ResistorColorDuo {
    int value(String[] colors) {
        int res;
        String temp = "";
        for (int i = 0; i < 2; i++) {
            temp += Arrays.asList(COLORS).indexOf(colors[i]);
            System.out.println(temp);
        }
        res = Integer.parseInt(temp);
        return res;
    }

    String[] COLORS = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
}
