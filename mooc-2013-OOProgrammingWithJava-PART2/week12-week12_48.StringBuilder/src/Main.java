
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4}; //, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (int i = 0; i < t.length; i++) {
            if (i % 4 == 0) sb.append(" ");
            sb.append(t[i]);
            if (i+1 != t.length) {
                sb.append(", ");
            }
            if ((i+1) % 4 == 0 && i+1 != t.length) sb.append("\n");
        }
        sb.append("\n}");
        return sb.toString();
    }
}
