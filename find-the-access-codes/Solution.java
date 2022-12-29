
public class Solution {
    public static int solution(int[] l) {
        int counter = 0;
        heapSort(l);
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[j] % l[i] != 0)
                    continue;

                for (int k = j + 1; k < l.length; k++) {
                    if (l[k] % l[j] == 0)
                        counter++;
                }
            }
        }
        return counter;
    }

    public static void heapSort(int[] arr) {
        for (int i = arr.length - 1; i > -1; i--) {
            heapify(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int start, int size) {
        int left = left(start), right = right(start), max;
        while (left < size) {
            max = start;
            if (arr[max] < arr[left])
                max = left;
            if (right < size && arr[max] < arr[right])
                max = right;

            if (max == start)
                break;
            swap(arr, start, max);
            start = max;
            left = left(start);
            right = right(start);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    private static int left(int i) {
        return 2 * i + 1;
    }

    private static int right(int i) {
        return 2 * i + 2;
    }

    /*
     * public static void main(String[] args) {
     * 
     * Random rnd = new Random();
     * int len = rnd.nextInt(50) + 2;
     * int[] arr = new int[len];
     * for (int i = 0; i < arr.length; i++) {
     * arr[i] = rnd.nextInt(200) + 1;
     * }
     * 
     * System.out.println(Arrays.toString(arr));
     * System.out.println(solution(arr));
     * System.out.println(Arrays.toString(arr));
     * }
     */
}