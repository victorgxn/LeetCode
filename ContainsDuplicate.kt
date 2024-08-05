class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hs = HashSet<Int>()
        for (num in nums)
            if (!hs.add(num)) return true
        return false
    }
}
