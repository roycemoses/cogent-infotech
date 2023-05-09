#include <iostream>
#include <vector>

using namespace std;

int main()
{
    // input
    vector<int> A = {3, 0, 5};
    
    // convert to double
    vector<double> arr;
    double sum = 0;
    for (int i = 0; i < A.size(); i++)
    {
        int temp = static_cast<double>(A[i]);
        arr.push_back(temp);
        sum += temp;
    }
    double initialSum = sum;
    int numFilters = 0;

    while (sum > initialSum / 2)
    {
        int maxIndex = 0;
        double max = arr[0];
        for (int i = 1; i < arr.size(); i++)
        {
            if (arr[i] > max)
            {
                // cout << arr[i] << ' ';
                max = arr[i];
                maxIndex = i;
            }
        }
        sum -= max / 2;
        arr[maxIndex] = max / 2;
        // cout << sum << endl;
        numFilters++;
    }

    cout << "Number of filters: " << numFilters;
}