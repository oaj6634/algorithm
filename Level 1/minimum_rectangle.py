def solution(sizes):
    print(sizes)
    for i in range(len(sizes)):
        if sizes[i][0] < sizes[i][1]:
            tmp = sizes[i][0]
            sizes[i][0] = sizes[i][1]
            sizes[i][1] = tmp

    return max([i[0] for i in sizes]) * max([i[1] for i in sizes])

