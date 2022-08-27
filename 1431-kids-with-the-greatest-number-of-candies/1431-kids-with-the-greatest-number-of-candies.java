class Solution{
public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	List<Boolean> h = new ArrayList<>();
	int max = 0;
    int n=candies.length;
	for (int j =0;j<n;j++){
		if (candies[j] > max){
			max = candies[j];
		}
	}
	for (int i = 0; i < candies.length; i++) {
		if (candies[i] + extraCandies >= max) h.add(true);
		else h.add(false);
	}
	return h;
}
}