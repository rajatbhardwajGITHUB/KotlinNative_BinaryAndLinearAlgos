/**
* LINEAR AND BINARY SEARCH ALGOS USING LAMBDAS*/
//THIS ONE LOOKS KINDA CHILDISH
//JUST THE CMD INTERFACE
package main

import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter the List and value you want to search and select the Algorithm for searching")
    println("ENTER THE NUMBER OF THE ALGO")
    println("1. Linear search")
    println("2. binary Search *IN THIS CASE ENTER A SORTED LIST*")

    //Takes the choice for Binary and Linear Search
    val choice = reader.nextInt()
    println()

    //Takes the input with a delimiter ',' and separates them and store them in the list
    println("ENTER THE LIST AND SEPARATE THE ELEMENT WITH ','")
    val list : List<Int> = readLine()!!.trim().split(",").map (String::toInt) //RIGHT NOW No IDEA ABOUT THIS CODE *FROM STACKOVERFLOW*
    println()
    println("Enter the Required Element :  ")
    println()

    //Element to Be searched
    val requiredElement  = readLine()?.toInt()

    //checks for null
    val mainProcess = requiredElement?.let { Model(list, it) }
    mainProcess?.calculations(choice)



}