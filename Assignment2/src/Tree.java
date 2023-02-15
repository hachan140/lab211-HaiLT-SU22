/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Tree {
    public static void main(String[] args) {
        MyTree BST = new MyTree();
        BST.insert("A6", "Mama mia", 4.0);
        BST.insert("A5", "Tomorrow we fight", 4.5);
        BST.insert("A4", "Hello", 3.9);
        BST.insert("A3", "Colors of the wind", 4.0);
        BST.insert("B8", "Summer in Paris", 5.0);
        BST.insert("A7", "In a Persian Market", 4.5);
        BST.insert("A9", "Sang pour sang", 4.8);
        
        BST.traverse();

        BST.delete();
        BST.rotateRight();
        
    }
}
