import java.util.*;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> res = new ArrayList<>();
        for (int g : grades) {
            if (g < 38) res.add(g);
            else {
                int next = ((g + 4) / 5) * 5;
                if (next - g < 3) res.add(next);
                else res.add(g);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < n; i++) grades.add(sc.nextInt());
        for (int g : gradingStudents(grades)) System.out.println(g);
        sc.close();
    }
}
