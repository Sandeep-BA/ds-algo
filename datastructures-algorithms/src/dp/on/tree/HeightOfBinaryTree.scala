package dp.on.tree

object HeightOfBinaryTree {
  def main(args: Array[String]): Unit = {
    val tree: Node = Node.Node(10)

    val ltree: Node = Node.Node(2)
    val rtree: Node = Node.Node(3)

    val lltree: Node = Node.Node(23)
    val llltree: Node = Node.Node(35)

    tree.left = ltree
    tree.right = rtree

    tree.left.left = lltree
    tree.left.left.left = llltree

    println(tree)
    println("Height of Binary Tree ==> "+ heightOfBinaryTree(tree))

  }

  class Node(var data: Int)(implicit var left: Node, implicit var right: Node) {
    override def toString: String = "Node data => " + data + " Node left link " +
      "==>" +
      " " + left + "Node right link ==> " + right
  }

  implicit val lNode: Node = null
  implicit val rNode: Node = null

  object Node {
    def Node(nodeValue: Int) = new Node(nodeValue)(lNode, rNode)
  }

  def heightOfBinaryTree(rootNode: Node): Int = {

    if(rootNode == null) return 0
    val leftSubTree = heightOfBinaryTree((rootNode.left))
    val rightSubTree = heightOfBinaryTree(rootNode.right)

    return 1 + math.max(leftSubTree,rightSubTree)
  }

}
