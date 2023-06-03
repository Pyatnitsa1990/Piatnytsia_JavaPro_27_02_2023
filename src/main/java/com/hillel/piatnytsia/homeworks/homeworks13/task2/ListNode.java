package com.hillel.piatnytsia.homeworks.homeworks13.task2;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return  val +
                "=" + next
                ;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(4, first);
        ListNode third = new ListNode(3, second);
        ListNode forth = new ListNode(2, third);
        ListNode finish = new ListNode(1, forth);
        System.out.println(finish);
        System.out.println(reverseList(finish));
    }

    public static ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextElement = current.next;
            current.next = previous;
            previous = current;
            current = nextElement;
        }
        return previous;
    }

}





