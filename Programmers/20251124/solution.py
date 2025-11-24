def solution(my_string):
    answer = {x:x for x in my_string}
    return "".join(list(answer.keys()))
