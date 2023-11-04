/*
 * @lc app=leetcode id=1 lang=kotlin
 *
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (43.27%)
 * Total Accepted:    1.7M
 * Total Submissions: 3.9M
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * 
 * 
 * 
 */
class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mm = HashMap<Int, Int>()

        val res = mutableListOf<Int>()
        
        for (i in nums.indices) {
            mm[nums[i]] = i
        }
        
        for (i in nums.indices) {
            val temp = mm.get(target - nums[i])
            if (temp != null && (temp ?: -1) > i) {
                res.add(i)
                res.add(mm.getOrElse(target-nums[i], {0}))
            }
        }

        return res.toIntArray()
    }
}

fun main(args: Array<String>) {
    val nums : IntArray = intArrayOf(2,7,11,15)
    val target = 9
    val test = Solution1()
    val result = test.twoSum(nums, target)

    for (i in 0..result.size) {
        println(result[i])
        if(i == result.size - 1) {
            break
        }
    }
}

