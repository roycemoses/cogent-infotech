#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

int main()
{
    int n = 4;
    int q = 2;
    vector<string> words = {"duel", "speed", "dule", "cars"};
    vector<string> queries = {"spede", "deul"};
    vector<vector<string>> ret = {};
    // return [["speed"], ["duel", "dule"]]

    vector<unordered_map<char, int>> wordsMap;
    vector<unordered_map<char, int>> queriesMap;
    unordered_map<char, int> temp;

    for (int i = 0; i < words.size(); i++)
    {
        // cout << words[i] << endl;
        for (int j = 0; j < words[i].size(); j++)
        {
            temp[words[i][j]]++;
        }
        // for (auto x: temp)
        // {
        //     cout << x.first << " " << x.second << endl;
        // }
        // cout << endl;
        wordsMap.push_back(temp);
        temp.clear();
    }

    for (int i = 0; i < queries.size(); i++)
    {
        // cout << words[i] << endl;
        for (int j = 0; j < queries[i].size(); j++)
        {
            temp[queries[i][j]]++;
        }
        vector<string> autoCorrect = {};
        for (int j = 0; j < wordsMap.size(); j++)
        {
            if (temp == wordsMap[j])
            {
                // cout << "temp is holding: " << queries[i] << endl;
                // cout << "words is holding: " << words[j] << endl;
                autoCorrect.push_back(words[j]);
            }
        }
        if (!autoCorrect.empty())
            ret.push_back(autoCorrect);
        autoCorrect.clear();
        temp.clear();
    }


    // return
    for (int i = 0; i < ret.size(); i++)
    {
        for (int j = 0; j < ret[i].size(); j++)
        {
            cout << ret[i][j] << ' ';
        }
        cout << endl;
    }


    return 0;
}