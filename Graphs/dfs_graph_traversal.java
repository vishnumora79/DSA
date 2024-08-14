package Graphs;
import java.util.*;
public class dfs_graph_traversal {
    public static void dfs(int node,boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list) {
        visited[node] = true;
        list.add(node);

        for(Integer it: adj.get(node)) {
            if(!visited[it]) {
                dfs(it,visited,adj,list);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V+1];
        visited[0] = true;
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0,visited,adj,list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 5;
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        ArrayList<Integer> ans = dfsOfGraph(V,adj);
        int n = ans.size();
        for(int i=0;i<n;i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
