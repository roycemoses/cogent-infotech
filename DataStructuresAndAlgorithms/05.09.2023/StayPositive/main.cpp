#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> arr = {3, -6, 5, -2, 1};
    int min = arr[0];
    int minIndex = 0;
    // my idea: right before the minimum value, the running sum must be 1 greater than the absolute value of the minimum value

    // find min
    for (int i = 1; i < arr.size(); i++)
    {
        if (arr[i] < min)
        {
            min = arr[i];
            minIndex = i;
        }
    }

    if (min < 0) // if min is negative:
    {
        int runningSum = 0;
        for (int i = 0; i < minIndex; i++)
        {
            runningSum += arr[i];
        }

        cout << (abs(min) - runningSum) + 1;
    }
    else
        cout << '1';
}