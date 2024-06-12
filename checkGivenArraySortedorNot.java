public class checkGivenArraySortedorNot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 10,4, 5, 6};
        System.out.println(check(arr));
    }

    static boolean check(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
