N, M = map(int, input().split()) # 바구니 N개, 공 넣는 횟수 M번
N_list = [0] * N
for i in range(N):
    N_list[i] = i+1

for _ in range(M):
    i, j = map(int, input().split())
    temp = N_list[i-1]
    N_list[i-1] = N_list[j-1]
    N_list[j-1] = temp

for i in range(len(N_list)):
    print(N_list[i], end=" ")