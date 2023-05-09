#include <iostream>
#include <unordered_set>
#include <vector>

using namespace std;

int main()
{
    string s = "abacdec";
    // int n = s.size();
    unordered_set<char> charSet;
    vector<string> substrings = {};
    int currentSubstringCharCount = 0;
    int currentSubstringStartingIndex = 0;
    int largestSubstringCharCount = 0;
    int largestSubstringStartingIndex = 0;
    bool completed = false;

    while (!completed)
    {
        for (int x = 0; x < s.size(); x++)
        {
            currentSubstringStartingIndex = x;
            for (int i = x; i < s.size(); i++)
            {
                if (charSet.find(s[i]) == charSet.end()) // if s[i] does not exist in charSet, place it and increment the current substring char count
                {
                    charSet.insert(s[i]);
                    currentSubstringCharCount++;
                    if (largestSubstringCharCount < currentSubstringCharCount)
                    {
                        largestSubstringCharCount = currentSubstringCharCount;
                        largestSubstringStartingIndex = currentSubstringStartingIndex;
                        if (largestSubstringCharCount == s.size())
                            completed = true;
                    }
                }
                else // if s[i] exists in charSet, reset
                {
                    if (largestSubstringCharCount < currentSubstringCharCount)
                    {
                        largestSubstringCharCount = currentSubstringCharCount;
                        largestSubstringStartingIndex = i - currentSubstringCharCount;
                    }
                    charSet.clear();
                    charSet.insert(s[i]);
                    currentSubstringCharCount = 1;
                }
            }
            charSet.clear();
            currentSubstringCharCount = 0;
        }
        substrings.push_back(s.substr(largestSubstringStartingIndex, largestSubstringCharCount));
        s.erase(largestSubstringStartingIndex, largestSubstringCharCount);
        largestSubstringCharCount = 0;
        largestSubstringStartingIndex = 0;
    }

    cout << "(";
    for (int i = 0; i < substrings.size() - 1; i++)
    {
        cout << "\'" << substrings[i] << "\', ";
    }
    cout << "\'" << substrings[substrings.size()-1] << "\')";

}