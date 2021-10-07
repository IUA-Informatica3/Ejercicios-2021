package infoIII.Estructuras;

public class BinarySearchTree<AnyType extends Comparable<AnyType>> {
    private TreeNode<AnyType> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(AnyType el) throws Exception {
        root = insert(el, root);
    }

    private TreeNode<AnyType> insert(AnyType el, TreeNode<AnyType> n) throws Exception {
        if (n == null)
            return new TreeNode<>(el);

        if (el.compareTo(n.element) > 0) {
            n.right = insert(el, n.right);
        } else if (el.compareTo(n.element) < 0) {
            n.left = insert(el, n.left);
        } else {
            throw new Exception("Element already in the tree");
        }
        return n;
    }

    public AnyType find(AnyType el) throws Exception {
        return find(el, root);
    }

    private AnyType find(AnyType el, TreeNode<AnyType> n) throws Exception {
        if (n == null)
            throw new Exception("Value not found");

        if (el.compareTo(n.element) == 0) {
            return n.element;
        } else if (el.compareTo(n.element) > 0) {
            return find(el, n.right);
        } else {
            return find(el, n.left);
        }
    }

    public void delete(AnyType el) throws Exception {
        root = delete(el, root);
    }

    private TreeNode<AnyType> delete(AnyType el, TreeNode<AnyType> n) throws Exception {
        if (n == null)
            throw new Exception("Element not found");

        if (el.compareTo(n.element) > 0) {
            n.right = delete(el, n.right);
        } else if (el.compareTo(n.element) < 0) {
            n.left = delete(el, n.left);
        } else {
            if (n.left == null) {
                return n.right;
            } else if (n.right == null) {
                return n.left;
            } else {
                n.element = findMax(n.left).element;
                n.left = delete(n.element, n.left);
            }
        }
        return n;
    }

    private TreeNode<AnyType> findMax(TreeNode<AnyType> n) {
        while (n.right != null) {
            n = n.right;
        }
        return n;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void print() {
        print(false, "", root);
    }

    private void print(boolean esDerecho, String identacion, TreeNode<AnyType> r) {
        if (r.right != null) {
            print(true, identacion + (esDerecho ? "     " : "|    "), r.right);
        }
        System.out.print(identacion);
        if (esDerecho) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.print("-- ");
        System.out.println(r.element);
        if (r.left != null) {
            print(false, identacion + (esDerecho ? "|    " : "     "), r.left);
        }
    }

    @Override
    public String toString() {
        return "To implement";
    }

    public void preOrder() {
    }

    public void inOrder() {
    }

    public void postOrder() {
    }

    public int depth() {
        return depth(root);
    }

    private int depth(TreeNode<AnyType> n) {
        return -1;
    }

    public int contarPorNivel(int nivel) {
        return contarPorNivel(nivel, root);
    }

    private int contarPorNivel(int nivel, TreeNode<AnyType> n) {
        return -1;
    }


    public int contarNodos() {
        return contarNodos(root);
    }

    private int contarNodos(TreeNode<AnyType> n) {
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> arbol = new BinarySearchTree<>();
        AvlTree<Integer> avl = new AvlTree<>();

        try {
            for (int i = 0; i < 10; i++) {
                avl.insert(i);
                //arbol.insert(i);
            }
            avl.print();

            //  arbol.print();


            arbol.insert(5);
            arbol.insert(3);
            arbol.insert(7);
            arbol.insert(1);
            arbol.insert(4);
            arbol.insert(6);
            arbol.insert(10);
            arbol.delete(5);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println(arbol.find(6));
            System.out.println(arbol.find(5));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        // arbol.print();

        BinarySearchTree<Car> autos = new BinarySearchTree<>();

        try {
            autos.insert(new Car("asdf", "fiat", "Chronos", 5000));
            autos.insert(new Car("fdas", "ford", "Fiesta", 50500));
            autos.insert(new Car("qwer", "fiat", "Chronos", 55000));
            autos.insert(new Car("zxcv", "ford", "Focus", 100));
            autos.insert(new Car("tyui", "fiat", "Chronos", 5000));

            System.out.println(autos.find(new Car("qwer", "", "", 0)));

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
