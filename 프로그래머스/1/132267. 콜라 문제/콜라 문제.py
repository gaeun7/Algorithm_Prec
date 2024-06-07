def solution(a, b, n):
    total_bottles = 0
    while n >= a:
        new_bottles = (n // a) * b
        total_bottles += new_bottles
        n = new_bottles + (n % a)
    return total_bottles
