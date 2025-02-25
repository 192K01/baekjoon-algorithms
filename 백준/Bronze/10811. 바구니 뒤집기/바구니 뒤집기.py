n, m = map(int, input().split())
n_list = [i for i in range(1,n+1)]

for _ in range(m):
    i, j = map(int, input().split())
    i -= 1
    j -= 1
    # 순서 역순 알고리즘
    while i < j:
        temp = n_list[i]
        n_list[i] = n_list[j]
        n_list[j] = temp
        i += 1
        j -= 1
        
for i in range(len(n_list)):
    print(n_list[i], end=" ")