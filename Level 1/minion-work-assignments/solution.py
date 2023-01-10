def solution(data, n):
    minion_amounts = {}
    for minion in data:
        if minion not in minion_amounts.keys():
            minion_amounts[minion] = 0
        minion_amounts[minion] += 1

    return [minion for minion in data if minion_amounts[minion] <= n]