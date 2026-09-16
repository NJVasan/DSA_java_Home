import java.util.*;

public class exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] num = new int[n];
        int first = -1;
        int last = -1;
        int l=n-1;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++, l--) {
            if (num[i] == x && first == -1) {
                first = i;
            }
            if (num[l] == x && last == -1) {
                last = l;
            }
        }
        System.out.println(first + " " + last);
    
}
}