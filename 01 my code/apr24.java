public class apr24 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(isSort(arr, 0));
        System.out.println(find(arr, 4, 0));
        System.out.println(findint(arr, 3, 0));
        System.out.println(findintlast(arr, 3, 0));
    }

    static boolean isSort(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return (arr[index] < arr[index + 1]) && isSort(arr, index + 1);
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return (arr[index] < arr[index + 1]) || find(arr, target, index + 1);
    }

    static int findint(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findint(arr, target, index + 1);
    }

    static int findintlast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findint(arr, target, index - 1);
    }
}
