package com.test;

public class ProductOfRedNodesVisitor extends TreeVis{
	long productOfRedNodes = 1L;
	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return (int)productOfRedNodes;
	}
	
	void multiply(Tree tree) {
		if(tree.getColor()==Color.RED) {
			productOfRedNodes=(long) ((productOfRedNodes*tree.getValue())%(Math.pow(10,9)+7));
			
		}
	}

	@Override
	public void visitNode(TreeNode node) {
		// TODO Auto-generated method stub
		multiply(node);
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// TODO Auto-generated method stub
		multiply(leaf);
	}

}
