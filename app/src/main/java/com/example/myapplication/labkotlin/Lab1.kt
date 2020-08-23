package com.example.myapplication.labkotlin

fun main(){
    val subjectScore : Array<Int> = arrayOf(57, 77, 89, 61, 75)
    println("There are " + subjectScore.size + " subjects in array.")

    var GpaxArray = CalGPAX(subjectScore)
    GPAX(GpaxArray)
}

fun CalGPAX(subjectArr : Array<Int>) : Array<Double>{
    var i : Int = 1
    var grade : String
    var gpax : Double
    var GpArr : Array<Double> = arrayOf()
    for (value : Int in subjectArr){
        if(value >= 80){
            grade = "A"
            gpax = 4.0
        } else if (value >= 75){
            grade = "B+"
            gpax = 3.5
        } else if (value >= 70){
            grade = "B"
            gpax = 3.0
        } else if (value >= 65){
            grade = "C+"
            gpax = 2.5
        } else if (value >= 60){
            grade = "C"
            gpax = 2.0
        } else if (value >= 55){
            grade = "D+"
            gpax = 1.5
        } else if (value >= 50){
            grade = "D"
            gpax = 1.0
        } else {
            grade = "F"
            gpax = 0.0
        }
        println(" Grade of Subject Number $i = $grade : $gpax")
        GpArr += gpax
        i++
    }
    return GpArr
}

fun GPAX(StrArr : Array<Double>){
    var numberFirst : Int = 1
    var sum : Double = 0.0
    var num : Double = 0.0
    var subJect : Double = 3.0
    var Double2F : Double
    print("GPAX = (")
    for (j in StrArr){
        sum += j * 3
        num += subJect
        while (numberFirst == 1){
            print("($j*3)")
            numberFirst = 2
        }
        print(" + ($j*3)")
    }
    Double2F = String.format("%.2f", sum/num).toDouble()
    print(") = $Double2F")
}

