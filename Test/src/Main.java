//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.TreeSet;

class Pair implements Comparable<Pair> {
    int key;
    int idx;

    public Pair(int key, int idx) {
        this.key = key;
        this.idx = idx;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.key, other.key);
    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        // Manually add the edges to the list
        edges.add(new ArrayList<Integer>() {{ add(7); add(0); }});
        edges.add(new ArrayList<Integer>() {{ add(0); add(4); }});
        edges.add(new ArrayList<Integer>() {{ add(4); add(5); }});
        edges.add(new ArrayList<Integer>() {{ add(5); add(6); }});
        edges.add(new ArrayList<Integer>() {{ add(6); add(8); }});
        edges.add(new ArrayList<Integer>() {{ add(8); add(9); }});
        edges.add(new ArrayList<Integer>() {{ add(9); add(3); }});
        edges.add(new ArrayList<Integer>() {{ add(3); add(2); }});
        edges.add(new ArrayList<Integer>() {{ add(2); add(1); }});
        edges.add(new ArrayList<Integer>() {{ add(1); add(10); }});
        edges.add(new ArrayList<Integer>() {{ add(4); add(6); }});

         System.out.println(isCyclic(11, edges));
    }

    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        for(int i=0;i<V;i++){
            edges.add(new ArrayList<Integer>());
        }

        for(int i=0;i<adj.size();i++){
            int startVertex = adj.get(i).get(0);
            int endVertex = adj.get(i).get(1);
            edges.get(startVertex).add(endVertex);
        }

        for(int i =0;i <V; i++){
            boolean[] visited = new boolean[V];
            boolean isCyclePresent = checkCycle(i, visited, edges);
            if(isCyclePresent)return true;
        }
        return false;
    }


    public static boolean checkCycle(int src, boolean[] visited, ArrayList<ArrayList<Integer>> edges){
        if(visited[src]){
            return true;
        }

        visited[src] = true;
        for(int j=0;j<edges.get(src).size(); j++){
            boolean isCyclePresent = checkCycle(edges.get(src).get(j), visited, edges);
            if(isCyclePresent)return true;
        }
        return false;
    }

}