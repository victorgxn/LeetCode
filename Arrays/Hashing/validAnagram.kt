class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        
        val sSorted = s.toCharArray().apply { sort() }
        val tSorted = t.toCharArray().apply { sort() }
        
        return sSorted.contentEquals(tSorted)
    }
}
