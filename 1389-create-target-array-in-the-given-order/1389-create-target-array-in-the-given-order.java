class Solution{
public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<index.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
    return array;
    }
}