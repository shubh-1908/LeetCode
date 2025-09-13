import java.util.*;

class Solution {
    public int calPoints(String[] ops) {
        List<Integer> scores = new ArrayList<>();

        for (String op : ops) {
            int n = scores.size();

            if (op.equals("+")) {
                int newScore = scores.get(n - 1) + scores.get(n - 2);
                scores.add(newScore);
            } 
            else if (op.equals("D")) {
                scores.add(scores.get(n - 1) * 2);
            } 
            else if (op.equals("C")) {
                scores.remove(n - 1);
            } 
            else {
                scores.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }
}
