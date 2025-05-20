public class Tree<T extends Comparable<T>> {
    protected Treenode<T> root;

    public Tree() {
        root = null;
    }

    public void add(T newValue) {
        Treenode<T> newTreeNode = new Treenode<>(newValue);

        if (root == null) {
            root = newTreeNode;
            return;
        }

        Treenode<T> tmp = root;
        while (true) {
            if (newValue.compareTo(tmp.getValue()) >= 0) {
                if (tmp.getRight() == null) {
                    tmp.setRight(newTreeNode);
                    break;
                } else {
                    tmp = tmp.getRight();
                }
            } else {
                if (tmp.getLeft() == null) {
                    tmp.setLeft(newTreeNode);
                    break;
                } else {
                    tmp = tmp.getLeft();
                }
            }
        }
    }

    public void StampaOP(Treenode<T> node, int level) {
        if (node == null)
            return;

        StampaOP(node.getRight(), level + 1);

        for (int i = 0; i < level; i++)
            System.out.print("\t");
        System.out.println(node.getValue());

        StampaOP(node.getLeft(), level + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StampaOP(root, 0);
        return sb.toString();
    }

}
