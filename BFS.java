package TH1;

import java.util.LinkedList;
import java.util.Queue;


public class BFS {

	public void bfsUsingQueue(Node initial, int goal) {
		Node n = initial;
		if (n.state == goal) {
			System.out.println(n);
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(n);

		while (!queue.isEmpty()) {
			Node v = queue.poll();
			if (v.state == goal) {
				String s = "";
				while (v != initial) {
					s = v.state + " " + s;
					v = v.parent;
				}
				System.out.println(initial.state + " " + s);
				return;
			}
			v.visited = true;
			
			for(Node q : v.getNeighbours()) {
				if(q.visited == false) {
					queue.add(q);
					q.visited = true;
					q.parent = v;
				}
			}
		}
	}

}
