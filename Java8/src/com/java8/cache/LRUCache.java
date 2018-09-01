package com.java8.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	class DLinkedList {
		int key;
		int value;
		DLinkedList pre;
		DLinkedList post;
	}
	
	void addNode(DLinkedList node) {
		node.pre=head;
		node.post=head.post;
		this.head.post=node;
	}
	void removeNode(DLinkedList node) {
		DLinkedList pre=node.pre;
		DLinkedList post=node.post;
		pre.post=post;
		post.pre=pre;
	}
	void moveToFront(DLinkedList node) {
		removeNode(node);
		addNode(node);
	}
	DLinkedList poptail() {
		DLinkedList temp=tail.pre;
		removeNode(temp);
		return temp;
	}
	
	Map<Integer, DLinkedList> m=new HashMap<Integer, DLinkedList>();
	int count, capacity;
	DLinkedList head,tail;

	public LRUCache(int capacity) {
		count=0;
		this.capacity=capacity;
		head=new DLinkedList();
		head.pre=null;
		tail=new DLinkedList();
		tail.post=null;
		head.post=tail;
		tail.pre=head;	
	}
	public int get(int key) {
		DLinkedList node=m.get(key);
		if(node==null) {
			return -1;
		} else {
			moveToFront(node);
			return node.value;
		}
		
	}
	public void put(int key, int value) {
		DLinkedList node=m.get(key);
		if(node==null) {
			node=new DLinkedList();
			node.key=key;
			node.value=value;
			addNode(node);
			m.put(key, node);
			++count;
			while(count<capacity) {
				DLinkedList temp=poptail();
				--count;
				m.remove(temp.key);
			}
		}
		
		else {
			node.value=value;
			moveToFront(node);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
