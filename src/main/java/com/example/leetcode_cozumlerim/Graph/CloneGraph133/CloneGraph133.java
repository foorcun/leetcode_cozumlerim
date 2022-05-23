package com.example.leetcode_cozumlerim.Graph.CloneGraph133;/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CloneGraph133 {
    public Node cloneGraph(Node node) {
        
        
        Map<Node,Node> oldToNew = new HashMap<>();
        
           
        
        return dfs(node, oldToNew) ;
        
    }
    
    private Node dfs(Node node, Map<Node,Node>  oldToNew){ // dfs adı yerıne clone adı da kullanılabılırdı
        if(node == null ) return null;
        
         if (oldToNew.containsKey(node)){
                return oldToNew.get(node);
            }
           Node copy =new Node(node.val);
            oldToNew.put(node,copy);
            for (Node nei : node.neighbors){
                copy.neighbors.add(dfs(nei,   oldToNew)); // dfs func, eger clone yapılmıssa Table den getır yoksa clonela actıon u yapıyor.
                }
            return copy;
        
        //return null;
    }
}


class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}