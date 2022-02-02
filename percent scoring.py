# Takes input for name, and 3 different types of marks to output total percentage and a grade

#Creates a function to find the total score percentage from three values
def percentscore(score1, score2, score3):
    totalpercent = (100*(score1 + score2 + score3)/175)
    return totalpercent

#Asks for inputs for name, homework score, assessment score, and final exam score. Additionally detects errors and gives error messages
while True:
    try:
        name = input("What is your name? ")
        hwscore = float(input("What is your homework score? "))
        if hwscore <= 25 and hwscore >=0:
            assessscore =  float(input("What is your assessment score? "))
            if assessscore <= 50 and assessscore >=0:
                finexamscore = float(input("What is your final exam score? "))
                if finexamscore <= 100 and finexamscore >=0:
                    break
                else:
                    print("The maximum score on the final exam was 100")
                    continue
            else:
                print("The Maximum score on the assessments is 50")
                continue
        else:
            print("The maximum score for homework is 25")
            continue
    except ValueError:
        print("Please only input numbers for your scores")

# Inputs the given data into the percentscore function, rounds it to 1 decimal place and assigns it to the mark value
endmark = round(percentscore(hwscore, assessscore, finexamscore), 1)

# Uses the mark value to determine what value should be assigned to grade
def grading(mark):
    if mark >= 90:
        grade = "A*"
    elif mark >= 80:
        grade = 'A'
    elif mark >= 70:
        grade = 'B'
    elif mark >= 60:
        grade = 'C'
    elif mark >= 50:
        grade = 'D'
    else:
        grade = 'F'
    return grade

# Prints a readout that combines all information
print(f"{name} scored {endmark}% and has achieved a {grading(endmark)} grade!")
