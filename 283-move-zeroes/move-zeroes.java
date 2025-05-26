class Solution {
    public void moveZeroes(int[] arr) {
        int write = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[write++] = arr[i];
            }
        }

        while (write < arr.length) {
            arr[write++] = 0;
        }

    }
}