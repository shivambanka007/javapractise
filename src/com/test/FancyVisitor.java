package com.test;

public class FancyVisitor extends TreeVis{
	int sumOfValuesNonLeafEvenDepth = 0;
    int sumOfValuesGreenLeaf = 0;
	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return Math.abs(sumOfValuesGreenLeaf-sumOfValuesNonLeafEvenDepth);
	}

	@Override
	public void visitNode(TreeNode node) {
		// TODO Auto-generated method stub
		if (node.getDepth() % 2 != 0) return;
        sumOfValuesNonLeafEvenDepth += node.getValue();
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// TODO Auto-generated method stub
		if(leaf.getColor()!=Color.GREEN)return;
		sumOfValuesGreenLeaf +=leaf.getValue();
	}

}
