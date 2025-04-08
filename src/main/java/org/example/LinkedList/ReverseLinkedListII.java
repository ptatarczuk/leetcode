package org.example.LinkedList;

import org.example.LinkedList.ListNode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        int left = 2;
        int right = 4;

        System.out.println(reverseBetween(list, left, right));
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || right==left) return head;
        boolean check = false;
        ListNode Pleft = null;
        ListNode Pright = null;
        ListNode Tleft = null;
        ListNode Tright = null;
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            if(count==left-1)   Pleft = curr;
            if(count==right+1)  Pright = curr;
            if(count==left)     Tleft = curr;
            if(count==right)    Tright = curr;
            curr = curr.next;
        }
        if(Tleft==head)  check = true;
        if(Pleft!=null && Pleft.next!=null)  Pleft.next = null;
        if(Tright.next!=null) Tright.next = null;
        curr = Tleft;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(Pleft!=null )  Pleft.next = Tright;
        Tleft.next = Pright;
        if(head.next==null || check)  return Tright;
        return head;
    }
}
