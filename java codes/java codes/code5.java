public class code5 {
    public static void main(String[] args) {
        int x = 58, y = 18, z = 8, i;

        // Fixing the expression with proper spacing
        i = --x + y++ - z-- - --z + ++y - --x +y-- - --x;

        System.out.println("z = " + z + ", x = " + x + ", y = " + y + ", i = " + i);
    }
}
