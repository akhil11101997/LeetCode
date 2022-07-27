/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        ListNode* beforeNode=new ListNode(0);
        ListNode* afterNode=new ListNode(0);
        ListNode* before=beforeNode;
        ListNode* after=afterNode;
        while(head!=NULL){
            if(head->val>=x){
                after->next=head;
                after=after->next;
            }
            else{
                before->next=head;
                before=before->next;
            }
            head=head->next;
        }
        before->next=afterNode->next;
        after->next=NULL;
        return beforeNode->next;
        
    }
};
