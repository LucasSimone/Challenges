
//Takes character and converts it to deciaml ascii
function charToAscii(ch){
    return ch.charCodeAt(0);
}

//Takes a string and converts it to a list of decimal ascii
function stringToAscii(str){

    let splitString = str.split("")
    const decimalList = splitString.map(ch => charToAscii(ch))
    return decimalList
}

//Takes a list of decimal ascii and converts it to binary string
function asciiToBinary(decimalList){
    var binaryString = ""

    const binaryList = decimalList.map(num => {
        let start = 64
        let binary = ""
        for(let i = 0; i < 7; i++){
             if(num >= start){
                num = num - start
                binary += '1'
             }else{
                binary += '0'
             }
            start = start/2
        }

        return binary
    })

    return binaryList.join(" ")
}

//takes a string and converts it to string binary
function stringToBinary(str){
    var asciiList = stringToAscii(str)
    var binaryStr = asciiToBinary(asciiList)
    return binaryStr
}

let mStr = "HELLO THIS is MYT"

console.log(stringToBinary(mStr))
