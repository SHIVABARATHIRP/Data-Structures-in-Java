class BinarysearchTree{
    static Node root=null;
    class Node{
        int data;
        Node left,right;
        Node(int val){
            data = val;
            left=null;
            right = null;
        }
    }
      void insert(int val){
       root = insert(root,val);
      }
      Node insert(Node root , int val){
        if(root == null){
            return new Node(val);
        }
        if(val>root.data){
            root.right=insert(root.right,val);
        }
        else{
            root.left=insert(root.left,val);
        }
        return  root;
      }
      void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);

        }
      }
  Node search(Node root,int val) {

      if (root == null || root.data == val) {
          return root;
      }
      if(val>root.data){
          return search(root.right,val);
      }
      return search(root.left,val);
  }


    public static void main(String[] args) {
        BinarysearchTree BT = new BinarysearchTree();
        BT.insert(7);
        BT.insert(8);
        BT.insert(3);
        BT.insert(9);
        BT.insert(2);
        BT.inOrder(root);
        if(BT.search(BT.root,9)==null){
            System.out.println("not found");
        }else
            System.out.println("found");



    }
}