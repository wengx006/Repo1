Python 3.7.0a3 (v3.7.0a3:90a6785f63, Dec  5 2017, 01:28:51) 
[GCC 4.2.1 (Apple Inc. build 5666) (dot 3)] on darwin
Type "copyright", "credits" or "license()" for more information.
>>> WARNING: The version of Tcl/Tk (8.5.9) in use may be unstable.
Visit http://www.python.org/download/mac/tcltk/ for current information.

>>> def swingSequence_DP(nums):
	n = len(nums)
	if n<2:
		return n
	increase, decrease = [1] * n, [1] * n
	for i in range(1, n):
		if nums[i] > nums[i-1]:
			increase[i] = max(increase[i], decrease[i-1] + 1)
			decrease[i] = decrease[i-1]
		elif nums[i] < nums[i-1]:
			decrease[i] = max(decrease[i], increase[i-1] + 1)
			increase[i] = increase[i-1]
		else:
			decrease[i] = decrease[i-1]
			increase[i] = increase[i-1]
	return max(increase[n-1], decrease[n-1])

>>> def swingSequence_Greedy(nums):
	n = len(nums)
	if n<2:
		return n
	current = nums[1] - nums[0]
	count = 2 if current != 0 else 1
	for i in range(2, n):
		diff = nums[i] - nums[i-1]
		if (diff > 0 and current <= 0) or (diff < 0 and current >= 0):
			count += 1
			current = diff
	return count

>>> nums = [1,17,5,10,13,15,10,5,16,8]
>>> nums1 = [1,2,3,4,5,6,7]
>>> a = swingSequence_Greedy(nums)
>>> print(a)
7
>>> b= swingSequence_Greedy(nums1)
>>> print(b)
2
>>> c = swingSequence_DP(nums)
>>> print(c)
7
>>> d = swingSequence_DP(nums1)
>>> print(b)
2
>>> 
