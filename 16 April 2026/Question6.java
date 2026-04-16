public class Question6 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;
        int n = arr.length;
        int result[] = new int[n];
        for (int i = 0; i < n - k; i++) {
            result[i] = arr[i + k];
        }
        for (int i = 0; i < k; i++) {
            result[n - k + i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}