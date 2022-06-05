class Solution {
   public boolean isPossibleDivide(int[] nums, int k) {

	int N = nums.length;
	if (N % k != 0) {
		return false;
	}

	TreeMap<Integer, Integer> mp = new TreeMap<>();

	for (int num : nums) {
		mp.put(num, mp.getOrDefault(num, 0) + 1);
	}

	for (int key : mp.keySet()) {
		int value = mp.get(key);

		if (value > 0) {
			for (int i=0; i<k; i++) {
				if (mp.getOrDefault(key+i, 0) < value) {
					return false;
				}
				mp.put(key+i, mp.get(key+i)-value);
			}
		}
	}

	return true;
}
}