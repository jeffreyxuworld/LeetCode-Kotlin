fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    val nums : IntArray = intArrayOf(2,7,11,15)
    val target = 9
    val result = twoSum(nums, target)
    for (i in 0..result.size) {
        println(result[i])
        if(i == result.size - 1) {
            break
        }
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val mm = HashMap<Int, Int>()
    val res = mutableListOf<Int>()
    for (i in nums.indices) {
        mm[nums[i]] = i
    }
    for (i in nums.indices) {
        val temp = mm[target - nums[i]]
        if (temp != null && (temp ?: -1) > i) {
            res.add(i)
            res.add(mm.getOrElse(target-nums[i], {0}))
        }
    }
    return res.toIntArray()
}