package Graph.TopoSort;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov + 1; i++)
                list.add(i, new ArrayList<Integer>());

            String s[] = read.readLine().trim().split("\\s+");
            int p = 0;
            for (int i = 1; i <= edg; i++)
            {
                int u = Integer.parseInt(s[p++]);
                int v = Integer.parseInt(s[p++]);
                list.get(u).add(v);
            }

            int[] res = new TopologicalSort().topoSort(list, nov);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res)
    {
        int[] map = new int[V];
        for (int i = 0; i < V; i++)
        {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++)
        {
            for (int v : list.get(i))
            {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}
/*
ArrayList<ArrayList<>Integer>adj: to represent graph containing 'N' vertices and edges between them
N: represent number of vertices
*/
class TopologicalSort {
    static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int n) {
        int ans[]=new int[n];
        Queue<Integer> q=new LinkedList<>();
        int indegree[]=new int[n];
        for(int i=0;i<n;i++)
            for(int u:adj.get(i))
                indegree[u]++;
        for(int i=0;i<n;i++)
            if(indegree[i]==0)
                q.add(i);
        int c=0;
        while(!q.isEmpty()){
            int v=q.poll();
            ans[c++]=v;
            for(int u:adj.get(v)){
                indegree[u]--;
                if(indegree[u]==0)
                    q.add(u);
            }
        }
        return ans;
    }
}
/*
Input
2
6 6
5 0 5 2 2 3 4 0 4 1 1 3
3 4
3 0 1 0 2 0

Output:
1
1
 */