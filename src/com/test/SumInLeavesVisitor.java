package com.test;

public class SumInLeavesVisitor extends TreeVis{
	int sumOfLeaves=0;
	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		
		return sumOfLeaves;
	
	}

	@Override
	public void visitNode(TreeNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// TODO Auto-generated method stub
		sumOfLeaves+=leaf.getValue();
	}

}
