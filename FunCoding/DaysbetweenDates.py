# Define a daysBetweenDates procedure that would produce the
# correct output if there was a correct nextDay procedure.
#
# Note that this will NOT produce correct outputs yet, since
# our nextDay procedure assumes all months have 30 days
# (hence a year is 360 days, instead of 365).
# 

def nextDay(year, month, day):
    """Simple version: assume every month has 30 days"""
    if(month==1 or month==3 or month==5 or month==7 or month==8 or month==10):
        if day < 31:
            return year, month, day + 1
        else:
            return year, month + 1, 1
    elif(month == 4 or month==6 or month==9 or month==11):
        if day < 30:
            return year, month, day+1
        else:
            return year, month + 1, 1
    elif(month==12):
        if day<31:
            return year,month,day+1
        else:
            return year+1,1,1
    elif(month==2):
        if day<29 and year%4==0:
            return year,month,day+1
        elif day<28 and not year%4==0:
            return year,month,day+1
        else:
            return year,month+1,1
            
def dateIsBefore(year1, month1, day1, year2, month2, day2):
    """Returns True if year1-month1-day1 is before year2-month2-day2. Otherwise, returns False."""
    
    if year1<year2:
        return True
    elif year1==year2 and month1<month2:
        return True
    elif year1==year2 and month1==month2 and day1<day2:
        return True
    return False
        
    
def daysBetweenDates(year1, month1, day1, year2, month2, day2):
    """Returns the number of days between year1/month1/day1
       and year2/month2/day2. Assumes inputs are valid dates
       in Gregorian calendar, and the first date is not after
       the second."""
        
    # YOUR CODE HERE!
    totalDays=0
    while(dateIsBefore(year1, month1, day1, year2, month2, day2)):
        '''
        tempy,tempm,tempd=nextDay(year1,month1,day1)
        if(tempy==year2 and tempm==month2 and tempd ==day2):
            break
        else:
            count=count+1
        '''
        year1,month1,day1=nextDay(year1,month1,day1)
        totalDays=totalDays+1
        
    return totalDays

def test():
    test_cases = [((2012,9,30,2012,10,30),30), 
                  ((2012,1,1,2013,1,1),360),
                  ((2012,9,1,2012,9,4),3),
                  ((1900,1,1,1999,12,31), 36523)]
    
    for (args, answer) in test_cases:
        result = daysBetweenDates(*args)
        if result != answer:
            print "Test with data:", args, "failed"
        else:
            print "Test case passed!"

test()
    
