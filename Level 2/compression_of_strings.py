def solution(s):
    answer = 1000
    if len(s) == 1:
        return 1
    for n in range(1, len(s)//2+1):
        ret = ''
        count = 1
        tmp = s[:n]

        for i in range(n, len(s)+n, n):
            if tmp == s[i:i+n]:
                count += 1
            else:
                if count == 1:
                    ret += tmp
                else:
                    ret += str(count) + tmp
                tmp = s[i:i+n]
                count = 1
        answer = min(answer, len(ret))
    return answer

print(solution("aabbaccc"))