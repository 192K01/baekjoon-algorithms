a = [0] * 10

# A값 입력 받기
for i in range(10):
    a[i] = int(input())
    
rest = [0] * 10 # 나머지 배열

# 42로 나눈 나머지 구하기
for i in range(10):
    rest[i] = a[i] % 42

print(len(set(rest)))