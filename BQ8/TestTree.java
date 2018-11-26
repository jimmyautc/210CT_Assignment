class TestTree{
	public static void main(String []args){
		BinarySearchTree tree = new BinarySearchTree(); 
		int [] num={2,7,9,4,1,5,3,6,0,8}; 
		for(int i=0;i<num.length;i++){
		tree.insert(i);
		}
		tree.inorder();
	}
}