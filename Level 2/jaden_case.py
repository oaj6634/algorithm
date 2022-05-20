def listToString(str_list):
    result = ""
    for s in str_list:
        result += s + " "
    return result.strip()

def solution(s):
    r = s.split(" ")
    for i in range(len(r)):
        r[i] = r[i].capitalize()
    return listToString(r)



#다른사람 풀이
def solution(s):
    return ' '.join(map(lambda s: s[0].upper() + s[1:].lower() if s else s, s.split(' ')))
