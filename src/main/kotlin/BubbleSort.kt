fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    list.add(9)
    list.add(11)
    list.add(5)
    list.add(16)
    list.add(1)
    bubbleSort(list)
}


fun bubbleSort(nums: MutableList<Int>) {
    val n = nums.size
    for (i in 0 until n){
        //设置标志,若为true,则表示这一趟排序没有进行交换,也就是数组已经有序,排序已经完成。
        var flag = true
        for (j in 0 until n-i-1){
            if(nums[j]>nums[j+1]){
                nums[j] = nums[j+1].also { nums[j+1] = nums[j] }
                flag = false
            }
        }
        if (flag){
            break
        }
    }

    for (i in nums){
        println(i)
    }
}