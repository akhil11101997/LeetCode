/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> res;
        stack<TreeNode*> s;
        TreeNode* curr=root;
        while(curr || !s.empty()){
            if(curr){
                s.push(curr);
                curr=curr->left;
            }
            else{
                if(s.empty())
                    break;
                TreeNode* node=s.top()->right;
                if(node){
                    curr=node;
                }
                else{
                    node=s.top();
                    s.pop();
                    res.push_back(node->val);
                    while(!s.empty() && node ==s.top()->right){
                        node=s.top();
                        s.pop();
                        res.push_back(node->val);
                    }
                }
            }
        }
        return res;
    }
};
