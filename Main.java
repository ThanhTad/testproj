package TH1;

public class Main {

	public static void main(String[] args) {
//		Node node40 = new Node(40);
//		Node node10 = new Node(10);
//		Node node20 = new Node(20);
//		Node node30 = new Node(30);
//		Node node60 = new Node(60);
//		Node node50 = new Node(50);
//		Node node70 = new Node(70);
//
//		node40.addNeighbours(node10);
//		node40.addNeighbours(node20);
//		node10.addNeighbours(node30);
//		node20.addNeighbours(node10);
//		node20.addNeighbours(node30);
//		node20.addNeighbours(node60);
//		node20.addNeighbours(node50);
//		node30.addNeighbours(node60);
//		node60.addNeighbours(node70);
//		node50.addNeighbours(node70);
		
		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node0.addNeighbours(node1);
		node0.addNeighbours(node2);
		node0.addNeighbours(node3);
		node1.addNeighbours(node2);
		node2.addNeighbours(node4);

		BFS bfsExample = new BFS();
		DFS th = new DFS();
//		System.out.println("The BFS traversal of the graph using queue ");
//		bfsExample.bfsUsingQueue(node40, 70);
		System.out.println("The DFS traversal of the graph using queue ");
//		th.dfsUsingStack(node40, 70);
//		bfsExample.bfsUsingQueue(node0, 4);
		th.dfsUsingStack(node0, 4);
	}

}
