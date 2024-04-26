def solution(n):
    total_sum = 0
    even_numbers = []
    
    for i in range(2, n + 1, 2):
        total_sum += i
        even_numbers.append(str(i))
    
    return total_sum