num = int(input())
money = list(map(int, input().split()))
sum = 0
ans = 0
money.sort()

for i in range(num+1):
    for n in range(i):
        sum += money[n]
    ans += sum
    sum = 0
print(ans)