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
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        if(root==NULL)
            return res;
        stack<TreeNode*> q;
        while(true){
            if(root!=NULL){
                q.push(root);
                root=root->left;
            }
            else{
                if(q.empty())
                    break;
                TreeNode* temp=q.top();
                q.pop();
                res.push_back(temp->val);
                root=temp->right;
            }
        }
        return res;
    }
};
