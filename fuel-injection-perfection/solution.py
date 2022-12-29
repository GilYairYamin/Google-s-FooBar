def solution(n):
    num = abs(int(n))
    res = 0
    
    while(num > 1):
        res += 1
        if num % 2 == 0:
            num = num >> 1
            continue
        
        res += 1
        if num & 2 == 0:
            num = num >> 1
            continue
        
        if num > 3:
            num += 1
            
        num = num >> 1
        
    return res

    
example = str(123456123456)
print(solution(example))