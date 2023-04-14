"""
Sort the array in ascending order.
Calculate the mean by summing all the elements and dividing by the number of elements.
Calculate the median, which is the middle element of the sorted array. If the array has an even number of elements, then the median is the average of the two middle elements.
Calculate the mode by creating a dictionary to store the frequency of each element in the array. The mode is the element with the highest frequency.

"""
import statistics
from collections import Counter

n = int(input())
arr = list(map(int, input().split()))

# Mean
mean = sum(arr) / n
print(round(mean, 1))

# Median
sorted_arr = sorted(arr)
if n % 2 == 0:
    median = (sorted_arr[n//2-1] + sorted_arr[n//2]) / 2
else:
    median = sorted_arr[n//2]
print(round(median, 1))

# Mode
freq_dict = Counter(sorted_arr)
mode = sorted(freq_dict.items(), key=lambda x: (-x[1], x[0]))[0][0]
print(mode)


