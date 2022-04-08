

#This function takes character and converts it to deciaml ascii
def charToAscii(char):
    return(ord(char))

#Takesa a string and converts it to a list of decimal ascii
def stringToAscii(string):
    decimalNumList = []
    for char in string:
        decimalNumList.append(charToAscii(char))
    return decimalNumList

#Takes a list of decimal ascii and converts it to binary string
def asciiToBinary(decimalNumList):
    binaryString = ""
    for num in decimalNumList:
        start = 64
        binaryNum = ""
        for binaryPlace in range(0,7):
            if(num >= start):
                num = num - start
                binaryNum += '1'
            else:
                binaryNum += '0'
            start = start/2
        binaryString += binaryNum + " "
    binaryString = binaryString[0:len(binaryString)-1]
    return binaryString

#takes a string and converts it to string binary
def stringToBinary(string):
    asciiList = stringToAscii(string)
    binary = asciiToBinary(asciiList)
    return binary

myBinary = stringToBinary("Hello This is my test String")
print(myBinary)


def pythonBinary(string):
    return (' '.join(format(ord(x), 'b') for x in string))



pythBinary = pythonBinary("Hello This is my test String")
print(pythBinary)


print(type(pythBinary))
