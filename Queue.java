/*
@file name: BankingFunction.java
@Created By: Praveen T
@Date: 18-10-2016
@purpose: Program for performing Banking operations and checking Queue.
*/

public class Queue{
	int mData;
	Queue mLink;

	public Queue(int mData, Queue node){
		this.mData = mData;
		mLink = node;
	}
	public void setData(int mData){
		this.mData = mData;
	}
	public int getData(){
		return mData;
	}

	public void setNode(Queue node){
		mLink = node;
	}
	public Queue getNode(){
		return mLink;
	}
}
