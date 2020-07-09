#include <iostream>
using namespace std;
int findIndex(int arr[], int num, int low, int high){
	int result = 2;
	while (low <= high){
		int mid = (low + high)/2;
		if(num == arr[mid]){
			result = mid;
			low = mid + 1;
		}
		else if(num < arr[mid])
		high = mid -1;
		else
		low = mid + 1;
	}
	return result;
}
int main() {
	int arr[10], num, i;
	for(i = 0; i < 10; i++){
		cin >> arr[i];
	}
	cout << "Find element: ";
	cin >> num;
	int index = findIndex (arr, num, 0, 9);
	if(index != 2)
	printf("First occurrence is found at index %d", num, index);
	else
	printf("not found");
}
