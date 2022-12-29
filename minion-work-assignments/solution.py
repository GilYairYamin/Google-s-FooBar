def solution(data, n):
    minions_amount = {}
    for minion in data:
        if minion not in minions_amount.keys():
            minions_amount[minion] = 1
        else:
            minions_amount[minion] = minions_amount[minion] + 1

    return [minion for minion in data if minions_amount[minion] <= n]
