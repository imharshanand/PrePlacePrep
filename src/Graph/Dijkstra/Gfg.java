package Graph.Dijkstra;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Gfg
{
    static void printSolution(int dist[], int n)
    {
        for(int i = 0; i < n; i++)
            System.out.print(dist[i] + " ");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());

        while(t > 0)
        {
            int V = Integer.parseInt(sc.next());;
            ArrayList<ArrayList<Integer>> list = new ArrayList<>(V);
            for(int i = 0;i < V; i++)
            {
                ArrayList<Integer> temp = new ArrayList<>(V);
                list.add(i, temp);
            }

            for(int i = 0; i < V; i++)
            {
                ArrayList<Integer> temp = list.get(i);
                for(int j = 0; j < V; j++)
                {
                    temp.add(Integer.parseInt(sc.next()));
                }
                list.add(temp);
            }
            int s = Integer.parseInt(sc.next());;
            Solution T = new Solution();
            int[] res = T.dijkstra(list, s, V);
            printSolution (res, V);
            System.out.println();
            t--;
        }
    }
}
/*
 *   g: vector of vectors which represents the graph
 *   src: source vertex to start traversing graph with
 *   V: number of vertices
 */
class Pair
{
    int vertex,dist;
    Pair(int v,int d)
    {
        vertex=v;
        dist=d;
    }
}

class Solution
{
    static int[] dijkstra(ArrayList<ArrayList<Integer>> list, int src, int n)
    {

        PriorityQueue<Pair>pq=new PriorityQueue<Pair>(new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2)
            {
                return p1.dist-p2.dist;
            }
        });
        pq.add(new Pair(src,0));
        boolean vis[]=new boolean[n];
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        while(!pq.isEmpty())
        {
            Pair curr=pq.poll();
            int u=curr.vertex;
            vis[u]=true;
            for(int v=0;v<n;v++)
            {
                int w=list.get(u).get(v);
                if(!vis[v]&&w!=0&&dist[v]>dist[u]+w)
                {
                    dist[v]=dist[u]+list.get(u).get(v);
                    pq.add(new Pair(v,dist[v]));
                }
            }
        }
        return dist;
    }
}
/*
Input:
2
2
0 25 25 0
0
3
0 1 43 1 0 6 43 6 0
2

Output:
0 25
7 6 0

Explanation: Shortest distance of source node 0 to 1 is 25, and shortest distance of source to source is 0.
 */

/*
Input:
    The first line of input contains an integer T denoting the number of test cases.
    Then T test cases follow. The first line of each test case contains an integer V
    denoting the size of the adjacency matrix and in the next line are V*V space-separated values,
    which denote the weight of an edge of the matrix (gr[i][j] represents the weight of an edge
    from ith node to jth node). The third line of each test case contains an integer denoting the source vertex s.

Output:
    For each test, case output will be V space-separated integers where the ith integer denotes
    the shortest distance of the ith vertex from source vertex.

Your Task:
    You don't need to read input or print anything.
    Your task is to complete the function dijkstra() which takes the adjacency matrix of the Graph g,
     the source vertex src and the number of vertices V as inputs and
    returns a list containing the minimum distance of all the vertices from the source vertex.
 */