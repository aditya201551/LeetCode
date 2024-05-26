class Solution {
    public boolean containsDuplicate(int arr[]) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if(set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}