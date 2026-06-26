class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int maxDiagonal = 0;
        int totalElements = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int diagonal = i + j;

                if (!map.containsKey(diagonal)) {
                    map.put(diagonal, new ArrayList<>());
                }

                map.get(diagonal).add(nums.get(i).get(j));

                maxDiagonal = Math.max(maxDiagonal, diagonal);
                totalElements++;
            }
        }

        int ans[] = new int[totalElements];
        int index = 0;

        for (int i = 0; i <= maxDiagonal; i++) {
            if (!map.containsKey(i)) {
                continue;
            }

            ArrayList<Integer> list = map.get(i);

            for (int j = list.size() - 1; j >= 0; j--) {
                ans[index++] = list.get(j);
            }
        }
        return ans;
    }
}