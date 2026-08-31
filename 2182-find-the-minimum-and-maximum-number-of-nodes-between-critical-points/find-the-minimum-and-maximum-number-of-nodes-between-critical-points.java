/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = {-1,-1};
        if(head.next.next == null){
            return new int[]{-1,-1};
        }
        int min = Integer.MAX_VALUE;
        ListNode prev = head;
        ListNode cur = head.next;
        int ci = 1;
        int fc = 0;
        int prc  = 0;
        while(cur.next != null ){
            if((prev.val < cur.val && cur.val > cur.next.val)||(prev.val > cur.val && cur.val < cur.next.val) ){
                if(prc == 0){
                     prc = ci;
                    fc = ci;
                   
                }else{
                     min = Math.min(min,ci - prc);
                     prc = ci;

                }
                
                
                

            }
            ci++;
            prev = cur;
            cur = cur.next;

        }
        if(min != Integer.MAX_VALUE){
            int max = prc - fc;
            res = new int[]{min,max};
        }
        return res;

        
    }
}