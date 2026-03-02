class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] num = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(num,(a,b)->{
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);
            if(bitsA!=bitsB) return bitsA-bitsB;
            return a-b;
        });
        return Arrays.stream(num).mapToInt(Integer::intValue).toArray();
    }
}