/*
 * @lc app=leetcode.cn id=1305 lang=kotlin
 *
 * [1305] 两棵二叉搜索树中的所有元素
 */

// @lc code=start
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution1305 {
    private val res: MutableList<Int> = mutableListOf()

    fun getAllElements(root1: TreeNodeTest1?, root2: TreeNodeTest1?): List<Int> {
        dfs(root1)
        dfs(root2)
        return res.sorted()
    }

    private fun dfs(root: TreeNodeTest1?) {
        if (root == null) return
        if (root?.left != null) dfs(root?.left);
        if (root?.right != null) dfs(root?.right);
        res.add(root!!.`val`)
    }
}
// @lc code=end

