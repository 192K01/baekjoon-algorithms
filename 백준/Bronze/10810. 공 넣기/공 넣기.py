N, M = map(int, input().split()) # 바구니 N개, 공 넣는 횟수 M번
N_list = [0] * N
for _ in range(M):
    minN, maxN, ball = map(int, input().split())
    for i in range(minN, maxN+1):
        N_list[i-1] = ball

for i in range(len(N_list)):
    print(N_list[i], end=" ")