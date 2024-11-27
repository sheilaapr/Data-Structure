package Array;

public class OrderedArrayBin {

    public int find(int[] arr, int searchKey) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchKey) {
                return mid;
            } else if (arr[mid] < searchKey) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
