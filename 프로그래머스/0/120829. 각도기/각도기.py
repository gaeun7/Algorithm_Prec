def solution(angle):
    if 0 < angle < 90:
        return 1  # Acute angle
    elif angle == 90:
        return 2  # Right angle
    elif 90 < angle < 180:
        return 3  # Obtuse angle
    elif angle == 180:
        return 4  # Straight angle
    else:
        return "Invalid angle"