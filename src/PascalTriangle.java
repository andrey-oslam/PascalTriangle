public class PascalTriangle {
    public static void main(String[] args) {
        System.out.format("    %d%n", 1);
        System.out.format("   %d-%d%n", 1, 1);
        System.out.format("  %d-%d-%d%n", 1, 2, 1);
        System.out.format(" %d-%d-%d-%d%n", 1, 3, 3, 1);
        System.out.format("%d-%d-%d-%d-%d%n", 1, 4, 6, 4, 1);
    }
}
