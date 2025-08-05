#include <stdio.h>
int ternarySearch(int arr[], int left, int right, int target) {
    if (left > right)
        return -1; 
    int mid1 = left + (right - left) / 3;
    int mid2 = right - (right - left) / 3;

    if (arr[mid1] == target)
        return mid1;
    if (arr[mid2] == target)
        return mid2;

    if (target < arr[mid1])
        return ternarySearch(arr, left, mid1 - 1, target);  
    else if (target > arr[mid2])
        return ternarySearch(arr, mid2 + 1, right, target); 
    else
        return ternarySearch(arr, mid1 + 1, mid2 - 1, target);
}

int main() {
    int arr[] = {1, 3, 5, 7, 9, 11, 13};
    int size = sizeof(arr) / sizeof(arr[0]);
    int target = 7;

    int result = ternarySearch(arr, 0, size - 1, target);

    if (result != -1)
        printf("Element found at index %d\n", result);
    else
        printf("Element not found\n");

    return 0;
}