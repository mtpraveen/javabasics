public class NodeCreation{
	int data;
	NodeCreation next;
	//Assigning the data value
	public void setData(int value){
		data = value;
	}
	//getting data value
	public int getData(){
		return data;
	}
	//Assigning next node
	public void setNext(NodeCreation node){
		next = node;
	}
	//getting next node
	public NodeCreation getNext(){
		return next;
	}

	
}
