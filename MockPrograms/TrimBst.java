package MockPrograms;

import java.util.ArrayList;

public class TrimBst {

    class Node{
        int data;
        Node left,right;
    }
    Node createNode(int key){
        Node newNode = new Node();
        newNode.data = key;
        newNode.left = null;
        newNode.right=null;
        return newNode;
    }
    Node deleteNode(Node root,int key){
        if(root==null)
            return root;
        if(key< root.data){
            root.left = deleteNode(root.left,key);
        }
        else if(key> root.data){
            root.right = deleteNode(root.right,key);
        }
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else{
                root.data = successor(root.right).data;
                root.right = deleteNode(root.right, root.data);
            }
        }
        return root;
    }
    public Node successor(Node root) {
        Node val = root;
        while(root.left!=null){
            val = root.left;
            root = root.left;
        }
        return val;
    }
ArrayList<Integer> list = new ArrayList();
    ArrayList<Integer> inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            list.add(root.data);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        return list;
    }
    Node insert(Node root,int data){
        if(root==null)
            return createNode(data);
        if(data< root.data){
            root.left = insert(root.left,data);
        }
        else if(data> root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    public static void main(String[] args) {
        int array[] = {9,-2,3,5,6,8,1,10};
        int low=-2;
        int high = 5;
        Node root = null;
        TrimBst obj = new TrimBst();
        root = obj.insert(root,array[0]);
        for(int i=1;i< array.length;i++){
            obj.insert(root,array[i]);
        }
        obj.inOrder(root);
        System.out.println("dhatchu");
        System.out.println(obj.list);
        for(int i=0;i<obj.list.size();i++){
            int val = obj.list.get(i);
            if((val<low||val>high)){
                root = obj.deleteNode(root,val);
            }
        }
        obj.inOrder(root);
    }
}
