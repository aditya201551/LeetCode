class Solution {
    public List<Integer> spiralOrder(int[][] mat) {

        List<Integer> res = new ArrayList<>();

        if (mat.length == 0)
            return res;

        int rb = 0, re = mat.length - 1;
        int cb = 0, ce = mat[0].length - 1;

        while (rb <= re && cb <= ce) {

            // left -> right
            for (int i = cb; i <= ce; i++) {
                res.add(mat[rb][i]);
            }
            rb++;

            // top -> bottom
            for (int i = rb; i <= re; i++) {
                res.add(mat[i][ce]);
            }
            ce--;

            // right -> left
            if (rb <= re) {
                for (int i = ce; i >= cb; i--) {
                    res.add(mat[re][i]);
                }
            }
            re--;

            // bottom -> top
            if (cb <= ce) {
                for (int i = re; i >= rb; i--) {
                    res.add(mat[i][cb]);
                }
            }

            cb++;
        }

        return res;

    }
}