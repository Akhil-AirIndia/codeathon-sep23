import heapq

# O(N*LogN) Time, O(Distinct(N)) Space
def frequencySort(s):
	mpp = {}
	min_heap = []

	for ch in s:
		if ch in mpp:
			mpp[ch] += 1
		else:
			mpp[ch] = 1

	for m in mpp:
		heapq.heappush(min_heap, (mpp[m], m)) # as freq is 1st , char is 2nd

	ans = ""
	#Now we have in the TOP - Less Freq chars
	while min_heap:
		freq, ch = heapq.heappop(min_heap)
		ans += ch * freq # append as many times of freq
	return ans

# Driver code
if __name__ == '__main__':
	str = "geeksforgeeks"
	print(frequencySort(str))

# This code is contributed by Prince Kumar
