class Solution {
public:
    bool isSubseq(string word, string str){
        int j=0;
        for(int i=0;i<str.size()&&j<word.size();i++){
            if(str[i]==word[j]){
                j++;
            }
        }
        if(j==word.size())
            return true;
        return false;
    }
    int numMatchingSubseq(string s, vector<string>& words) {
        int count=0;
        unordered_map<string,int> mp;
        for(int i=0;i<words.size();i++)
            mp[words[i]]++;
        for(auto it:mp){
            if(isSubseq(it.first,s))
                count+=it.second;
        }
        return count;
    }
};
