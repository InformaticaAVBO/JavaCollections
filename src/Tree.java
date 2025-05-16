public class Tree<T extends Comparable<T>> {
    protected Treenode<T> root;

    public Tree() {
        root = null;
    }

    public void add(T newvalue) {

        Treenode<T> newTreeNode = new Treenode<>(newvalue);

        Treenode<T> tmp = root;
        while (true) {
            try{
                if (tmp.getValue() == null){ root.setValue(newvalue); break; }
                if (tmp.getValue().compareTo(newTreeNode.getValue()) >= 0) tmp = tmp.getRight();
                if (tmp.getValue().compareTo(newTreeNode.getValue()) < 0) tmp = tmp.getLeft();
            }catch(NullPointerException e ){
                System.out.println("a");
            }
        }

    }

    public void StampaOP(Treenode<T> node, int level) {
    if (node == null) return;

    StampaOP(node.getRight(), level + 1);

    for (int i = 0; i < level; i++) System.out.print("\t");
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
