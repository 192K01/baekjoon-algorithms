n = int(input()) # 과목의 개수 n

# 점수 입력
score = list(map(int, input().split()))

newScore = [0] * n
for i in range(n):
    newScore[i] = score[i] / max(score)
    
print(sum(newScore) / n * 100)