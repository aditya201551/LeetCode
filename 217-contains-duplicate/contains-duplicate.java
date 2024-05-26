class Solution {
    public boolean containsDuplicate(int arr[]) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }
        System.out.println(arr.length + " " + set.size());
        return set.size() != arr.length;
    }
}