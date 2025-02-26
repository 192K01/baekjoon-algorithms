t = int(input())
for i in range(t):
    n, st = input().split()
    for j in range(len(st)):
        print(st[j] * int(n), end='')
    print('')
