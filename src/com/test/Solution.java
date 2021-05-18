package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	static Map<Integer, Tree> tree = new HashMap<>();
	public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,Object[]> nodeAtt = new HashMap<Integer,Object[]>();
		for(int i=0;i<n;i++) {
			nodeAtt.put(i+1,new Object[] {sc.nextInt(),null});
		}
		for(int i=0;i<n;i++) {
			nodeAtt.get(i+1)[1] = sc.nextInt()==0?Color.RED:Color.GREEN;
		}
		Map<Integer, ArrayList<Integer>> edges = new HashMap<Integer, ArrayList<Integer>>();

        for (int i = 1; i <= n; i++)
            edges.put(i, new ArrayList<Integer>());

        for (int i = 1; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            edges.get(u).add(v);
            edges.get(v).add(u);
        }
        Tree root = new TreeNode((Integer) nodeAtt.get(1)[0], (Color) nodeAtt.get(1)[1], 0);
        tree.put(1, root);

        DFS(n, edges, nodeAtt);
        return tree.get(1);
    }
	 private static void DFS(int n, Map<Integer, ArrayList<Integer>> edges, Map<Integer, Object[]> nodeAtts) {
	        boolean[] visited = new boolean[n + 1];
	        TreeNode parent = (TreeNode) tree.get(1);
	        DFSUtil(parent, 1, visited, edges, nodeAtts);

	    }

	    private static void DFSUtil(TreeNode parent, int v, boolean[] visited, Map<Integer, ArrayList<Integer>> edges, Map<Integer, Object[]> nodeAtts) {
	        visited[v] = true;
	        if (edges.get(v).size() == 1 && v != 1) {
	            TreeLeaf treeLeaf = new TreeLeaf((Integer) nodeAtts.get(v)[0], (Color) nodeAtts.get(v)[1], parent.getDepth() + 1);
	            parent.addChild(treeLeaf);
	            tree.put(v, treeLeaf);
	            return;
	        }
	        TreeNode treeNode;
	        if (v != 1) {
	            treeNode = new TreeNode((Integer) nodeAtts.get(v)[0], (Color) nodeAtts.get(v)[1], parent.getDepth() + 1);
	            parent.addChild(treeNode);
	            tree.put(v, treeNode);

	        } else
	            treeNode = (TreeNode) tree.get(1);

	        Iterator<Integer> iterator = edges.get(v).iterator();
	        while (iterator.hasNext()) {
	            int n = iterator.next();
	            if (!visited[n]) {
	                DFSUtil(treeNode, n, visited, edges, nodeAtts);
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Tree root = solve();
	    SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
	        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
	        FancyVisitor vis3 = new FancyVisitor();

	        root.accept(vis1);
	        root.accept(vis2);
	        root.accept(vis3);

	        int res1 = vis1.getResult();
	        int res2 = vis2.getResult();
	        int res3 = vis3.getResult();

	        System.out.println(res1);
	      System.out.println(res2);
	      System.out.println(res3);
	  }
	    
}
