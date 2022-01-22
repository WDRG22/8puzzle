import java.util.*;

public class Node{

    int[] 			state;
    int 			depth;
    int 			pathCost;
    String 			action;
    boolean 		expanded;
    Node 			parent;
    ArrayList<Node> children;

    // Constructor
    public Node(Node parent, ArrayList<Node> children, int[] state, String action, int depth, int pathCost, boolean expanded){
        this.parent 	= parent;
        this.children 	= children;
        this.state 		= state;
        this.action 	= action;
        this.depth 		= depth;
        this.pathCost 	= pathCost;
        this.expanded 	= expanded;
    }
}