def enter(s):
    return s + "님이 들어왔습니다."

def leave(s):
    return s + "님이 나갔습니다."

def uid(li):
    dic = {}
    for i in li:
        a = i.split()
        if not a[0] == 'Leave':
            key = a[1]
            dic[key] = a[2]
    return dic

def solution(record):
    answer = []
    dic = uid(record)
    for m in record:
        a = m.split()
        if a[0] == 'Enter':
            answer.append(enter(dic[a[1]]))
        elif a[0] == 'Leave':
            answer.append(leave(dic[a[1]]))
    return answer

print(solution(["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]))