import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hãy nhập a: ");
        int a = input.nextInt();
        System.out.print("Hãy nhập b: ");
        int b = input.nextInt();
        System.out.print("Hãy nhập c: ");
        int c = input.nextInt();
        TriangleException triangleException = new TriangleException();
        triangleException.triangle(a, b, c);
    }

    public static void triangle(int a, int b, int c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
                throw new Exception("Ba cạnh này không thể tạo thành một tam giác ");
            }
            System.out.println("Đây là 3 cạnh của một tam giác  ");
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}