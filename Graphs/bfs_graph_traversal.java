//package Graphs;
//
//import sun.awt.image.IntegerComponentRaster;
//
//import java.lang.reflect.Array;
//import java.util.*;
//public class bfs_graph_traversal {
//    public static ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj) {
//        ArrayList <Integer> bfs = new ArrayList<>();
//        boolean[] visited = new boolean[V];
//
//        Queue<Integer> q = new LinkedList<>();
//
//        q.add(0);
//        visited[0] = true;
//
//        while(!q.isEmpty()) {
//            Integer node = q.poll();
//            bfs.add(node);
//
//            for(Integer it: adj.get(node)) {
//                if(visited[it] == false) {
//                    visited[it] = true;
//                    q.add(it);
//                }
//            }
//        }
//        return bfs;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        for(int i=0;i<5;i++) {
//            adj.add(new ArrayList<>());
//        }
//            adj.get(1).add(2);
//            adj.get(2).add(1);
//            adj.get(1).add(5);
//            adj.get(5).add(1);
//            adj.get(2).add(5);
//            adj.get(5).add(2);
//            adj.get(2).add(3);
//            adj.get(3).add(2);
//            adj.get(3).add(4);
//            adj.get(4).add(3);
//            adj.get(3).add(5);
//            adj.get(5).add(3);
//            adj.get(4).add(5);
//            adj.get(5).add(4);
//
//           ArrayList <Integer> ans = bfsOfGraph(5,adj);
//           int n = ans.size();
//        System.out.println("Total number of nodes:" + n);
////        for(int i=0;i<n;i++) {
////            System.out.print(ans.get(i) + " ");
////        }
//
//        }
//    }
//


package Graphs;
import java.util.*;

public class bfs_graph_traversal {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for (Integer it : adj.get(node)) {
                if (!visited[it]) {
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        int V = 5; // Number of nodes
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(4);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(4);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(0);
        adj.get(4).add(2);
        adj.get(4).add(3);
        ArrayList<Integer> ans = bfsOfGraph(V, adj);
        int n = ans.size();
        System.out.println("Total number of nodes:" + n);
        System.out.println("BFS Traversal: " + ans);
    }
}
