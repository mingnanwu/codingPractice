package com.company;

/**
 * Created by kevin on 9/19/2015.
 */
public class reorderList {

    public void reorderList(ListNode head) {
        // write your code here
        if(head == null || head.next == null || head.next.next == null)
        {
            return;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode mid = dummy;
        ListNode end = dummy;

        while(end!= null && end.next!=null)
        {
            mid = mid.next;
            end = end.next.next;
        }

        ListNode c = mid.next;
        ListNode n = c;
        ListNode p = new ListNode(0);
        p = null;
        mid.next = null;



        while(c != null)
        {

            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }



        ListNode firstHalf = head;
        ListNode secondHalf = p;
        ListNode firstHalfCur = firstHalf;
        ListNode secondHalfCur = secondHalf;



        while(firstHalfCur.next != null)
        {
            firstHalfCur = firstHalf.next;
            secondHalfCur = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = firstHalfCur;

            firstHalf =  firstHalfCur;
            secondHalf = secondHalfCur;

        }
        // head.next = c;
        // return;

        firstHalf.next = secondHalf;


    }

}
