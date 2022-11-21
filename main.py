s=1
arr1=list()
arr=list(map(int, input("Enter Values: ").split()))
for i in range(len(arr)):
    for j in range(len(arr)):
        if arr[j]!=arr[i]:
            s=s*arr[j]
    arr1.append(s)
    s=1
print("Input : ",arr,"==>","Output : ",arr1)
