package org.example.LinkedList;

/* https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=study-plan-v2&envId=top-interview-150 */

public class MergeTwoSortedLists {
    public static ListNode mergeTwoListsPractice(ListNode list1, ListNode list2) {
        return new ListNode(0);










    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.println("Połączona lista: " + mergedList.val + " -> " + mergedList.next.val + " -> " + mergedList.next.next.val + " -> " + mergedList.next.next.next.val + " -> " + mergedList.next.next.next.next.val + " -> " + mergedList.next.next.next.next.next.val);

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode start = new ListNode(0);
        ListNode current = start;



        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                current.next = list2;
                list2 = list2.next;
                System.out.println(current.val);
            } else {
                current.next = list1;
                list1 = list1.next;
                System.out.println(current.val);
            }
            current = current.next;
        }
        if (list1 == null) current.next = list2;
        if (list2 == null) current.next = list1;
        return start.next;
    }
}
