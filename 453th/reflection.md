Traditional Solution, find the max's idex and add n-1 elements. check whether the array elements are equal. However, this idea is correct but low efficency.
The better way is that:(in chinese, reference:http://www.cnblogs.com/grandyang/p/6053827.html)
正确的解法相当的巧妙，需要换一个角度来看问题，其实给n-1个数字加1，效果等同于给那个未被选中的数字减1，比如数组[1，2，3], 给除去最大值的其他数字加1，变为[2，3，3]，我们全体减1，并不影响数字间相对差异，变为[1，2，2]，这个结果其实就是原始数组的最大值3自减1，那么问题也可能转化为，将所有数字都减小到最小值，这样难度就大大降低了，我们只要先找到最小值，然后累加每个数跟最小值之间的差值即可
