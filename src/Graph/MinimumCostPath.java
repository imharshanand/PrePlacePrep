package Graph;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumCostPath
{
    static class cell
    {
        int x,y,dist;
        cell(int x,int y,int dist)
        {
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[][]=new int[n][n];
            int dist[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                    dist[i][j]=Integer.MAX_VALUE;
                }
            }
            System.out.println(dijkstra(arr,dist,n));
        }
    }
    static int dijkstra(int arr[][],int dist[][],int n)
    {
        PriorityQueue<cell> pq=new PriorityQueue<cell>(new Comparator<cell>()
        {
            public int compare(cell a,cell b)
            {
                return a.dist-b.dist;
            }
        });
        boolean visited[][]=new boolean[n][n];
        int row[]={-1,0,0,1};
        int col[]={0,-1,1,0};
        dist[0][0]=arr[0][0];
        pq.add(new cell(0,0,dist[0][0]));
        visited[0][0]=true;
        while(!pq.isEmpty())
        {
            cell temp=pq.poll();
            if(temp.x==n-1&&temp.y==n-1)
                return dist[temp.x][temp.y];
            visited[temp.x][temp.y]=true;
            for(int i=0;i<4;i++){
                int r=temp.x+row[i],c=temp.y+col[i];
                if(Valid(r,c,n)&&!visited[r][c]){
                    if(dist[r][c]>dist[temp.x][temp.y]+arr[r][c]){
                        dist[r][c]=dist[temp.x][temp.y]+arr[r][c];
                        pq.add(new cell(r,c,dist[r][c]));
                    }
                }
            }
        }
        return -1;
    }
    static boolean Valid(int r,int c,int n)
    {
        return r>=0&&r<n&&c>=0&&c<n;
    }
}
/*
Given a square grid of size N, each cell of which contains integer cost which represents
a cost to traverse through that cell, we need to find a path from top left cell to bottom
right cell by which total cost incurred is minimum. You can move in 4 directions : up, down, left an right.

Note : It is assumed that negative cost cycles do not exist in input matrix.

Input:
    The first line of input will contain number of test cases T.
    Then T test cases follow. Each test case contains 2 lines.
    The first line of each test case contains an integer N denoting the size of the grid.
    Next line of each test contains a single line containing N*N space separated integers
    depicting the cost of respective cell from (0,0) to (N,N).

Output:
    For each test case output a single integer depicting the minimum cost to reach the destination.
 */
/*
Example:
Input:
2
5
31 100 65 12 18 10 13 47 157 6 100 113 174 11 33 88 124 41 20 140 99 32 111 41 20
2
42 93 7 14

Output:
327
63

Explanation:
Test case 1:
Grid is:
31, 100, 65, 12, 18,
10, 13, 47, 157, 6,
100. 113, 174, 11, 33,
88, 124, 41, 20, 140,
99, 32, 111, 41, 20
A cost grid is given in below diagram, minimum
cost to reach bottom right from top left
is 327 (31 + 10 + 13 + 47 + 65 + 12 + 18 + 6 + 33 + 11 + 20 + 41 + 20)
 */