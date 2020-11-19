print("enter an integer between 0-100")
grade = int(input())
while grade != -1:
    if grade > 100:
        print("error please enter an integer between 0 and 100")
    elif 93 <= grade:
        print("4.0,A")
    elif 83 <= grade:
        print("3.7,A-")
    elif 74 <= grade:
        print("3.3,B+")
    elif 68 <= grade:
        print("3.0,B")
    elif 58 <= grade:
        print("2.7,B-")
    elif 51 <= grade:
        print("2.3,C+")
    elif 43 <= grade:
        print("2.0,C")
    elif 33 <= grade:
        print("1.7,C-")
    elif 26 <= grade:
        print("1.3,D+")
    elif 13 <= grade:
        print("1.0,D")
    elif 0 <= grade:
        print("0.0,F")
    elif grade < 0:
        print("error please enter an integer between 0 and 100")
    print("enter an integer between 0-100")
    grade = int(input())
