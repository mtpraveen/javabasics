/*
file name:UnOrderNodeCreation.java
CreatedBy:Praveen T
CreatedDate:21/10/16
Purpose:Creating Nodes
*/
public class UnOrderNodeCreation<T>{
	T data;
	UnOrderedNodeCreation next;
	//Assigning the data value
	public void setData(T value){
		data = value;
	}
	//getting data value
	public T getData(){
		return data;
	}
	//Assigning next node
	public void setNext(UnOrderedNodeCreation node){
		next = node;
	}
	//getting next node
	public UnOrderedNodeCreation getNext(){
		return next;
	}
}
