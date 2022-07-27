class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<int> temp={1};
        vector<vector<int>> res;
        res.push_back(temp);
        while(numRows>1)
        {
            vector<int> curr;
            curr.push_back(1);
            for(int i=0;i<temp.size()-1;i++){
                curr.push_back(temp[i]+temp[i+1]);
            }
            curr.push_back(1);
            res.push_back(curr);
            temp=curr;
            numRows--;
        }
        return res;
    }
};
