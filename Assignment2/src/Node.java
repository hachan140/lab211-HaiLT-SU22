/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Node {
    Song info;
    Node left, right;
    Node(Song p){
        info = p;
        left = right = null;
    }

    Node(String id, String name, double rating) {
        Song x = new Song(id, name, rating);
        info = x;
        left = right = null;
    }
    
}
