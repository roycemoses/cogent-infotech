#include <iostream>
#include <vector>
#include <utility>

using namespace std;

int main()
{
    vector<vector<int>> matrix = 
    {{2, 2},
     {1, 2},
     {3, 4}};
    
    pair<int,int> validCoordinates;
    vector<pair<int,int>> allValidCoordinates;

    // for each row, find max...
    // then, check its column to see if there are any larger numbers... (if none, print)

    for (int i = 0; i < matrix.size(); i++)
    {
        int rowMax = matrix[i][0];
        for (int j = 1; j < matrix[i].size(); j++)
            if (matrix[i][j] > rowMax)
                rowMax = matrix[i][j];
        
        for (int j = 0; j < matrix[i].size(); j++) 
        {
            if (matrix[i][j] == rowMax) // check its columns...
            {
                bool valid = true;
                for (int k = 0; k < matrix.size(); k++)
                {
                    if (matrix[k][j] < rowMax)
                    {
                        valid = false;
                        break;
                    }
                }
                if (valid)
                {
                    validCoordinates.first = i;
                    validCoordinates.second = j;
                    allValidCoordinates.push_back(validCoordinates);
                }
            }
        }
    }

    for (int i = 0; i < allValidCoordinates.size(); i++)
    {
        cout << "__ VALID COORDINATE #" << (i + 1) << " __\n";
        cout << "(" << allValidCoordinates[i].first << ", " << allValidCoordinates[i].second << ")\n";
        cout << "Return value: " << matrix[allValidCoordinates[i].first][allValidCoordinates[i].second] << endl << endl;
    }

}