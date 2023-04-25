# take input for number of test cases
t = int(input())

# loop through the test cases
for i in range(t):
    # take input string for each test case
    s = input()
    
    # initialize even and odd strings
    even_str = ""
    odd_str = ""
    
    # loop through the characters of the string
    for j in range(len(s)):
        # if index is even, add the character to even_str
        if j % 2 == 0:
            even_str += s[j]
        # if index is odd, add the character to odd_str
        else:
            odd_str += s[j]
    
    # print the even and odd strings separated by a space
    print(even_str, odd_str)
