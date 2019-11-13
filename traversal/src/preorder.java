import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class preorder {
}

class TreeNode {
    String data;
    Collection<TreeNode> children;
}


class TreePreorderIterator implements Iterator {

    private final List<TreeNode> toVisit;

    TreePreorderIterator(TreeNode root) {
        toVisit = new LinkedList<>();
        toVisit.push(root);
    }

    boolean hasNext() {
        return toVisit.size() > 0;
    }

    TreeNode next() {
        TreeNode node = toVisit.pop();
        for (child:
             node.children) {
            toVisit.push(child);
        }
        return node;
    }

    //oder

    public void PreOrder(Binearbaum b) {
  System.out.println(b.getRootItem().toString());

  if (b.getLeftTree() != null) {
    PreOrder(b.getLeftTree());
  }

  if (b.getRightTree() != null) {
    PreOrder(b.getRightTree());
  }
    }
}