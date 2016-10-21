package com.bridgelabz.programs;
import java.io.File;
import java.demo.UnOrderNodeCreation;
class UnOrderedNode<T>{
	UnOrderedNodeCreation mHead,mTail,mNode,mTemp,mTemp2;
	Utility u = new Utility();
	File file = new File("UnOrderedStrings.txt");	
	public void addNode(T value){
		mNode = new UnOrderNodeCreation();
		mNode.setData(value);
		if(mHead == null){
			mHead = mNode;
			mTail = mNode;
		}
		else{
			mTail.setNext(mNode);
			mTail = mNode;
		}	
	}//end of add method

	public void fileUpdate(){
		mTemp = mHead;
		BufferedWriter wr = new BufferedWriter(new FileWriter(f));
		wr.write(" ");
		wr.close();
		int total = 0;
		if(mTemp == null)
			System.out.println("List is Empty");
		else{
			while(mTemp != null){
				total++;
				String str = (String)mTemp.getData();
				try{
			String str = this.readFile(file);
			str = str.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(str+data+" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
				mTemp = mTemp.getNext();
			}
		}
	}//end of fileUpdate

	public void search(T value){
		int count = 0;
		mTemp = mHead;
		while(mTemp != null){
			if(value.equals(mTemp.getData())){
				count++;
				System.out.println("Search found, Element is removed");
				this.remove(value);
				System.out.print("New list is: ");
				this.fileUpdate();
				System.out.println(u.readFile(file));
				System.out.println();
			}
			else
				mTemp = mTemp.getNext();
		}
		if(count == 0){
			System.out.println("Search not found, Element is added");
			this.addNode(value);
			System.out.print("New list is: ");
			this.fileUpdate();
			System.out.println(u.readFile(file));
			System.out.println();
		}
	}//end of search

	//removing the element from list
	public void remove(T value){
		mTemp = mHead;
		mTemp2 = mTemp.getNext();
		mNode = new UnOrderNodeCreation();
		mNode.setData(value);
		if(value.equals(mHead.getData()))
			mHead = mHead.getNext();
		else{
			while(mTemp2 != null){
				if(value.equals(mTemp2.getData())){
					mTemp.setNext(mTemp2.getNext());
					break;			
				}
				else{
					mTemp = mTemp2;
					mTemp2 = mTemp2.getNext();
				}
			}
		}
	}//end of remove method
}
