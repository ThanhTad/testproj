package TH1;
import java.util.Stack;
public class DFS {

	public void dfsUsingStack(Node initial, int goal) {
		Node n = initial;
		if (n.state == goal) {
			System.out.println(n);
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(n);
		while (!stack.isEmpty()) {
			Node v = stack.pop();
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
					stack.add(q);
					q.visited = true;
					q.parent = v;
				}
			}
		}
	}

	
}
