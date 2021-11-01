package main

import java.util.*
/*
* LINEAR AND BINARY SEARCH ALGOS USING LAMBDAS*/
fun main(){
    val reader = Scanner(System.`in`)
    println("Enter the List and value you want to search and select the Algorithm for searching")
    println("ENTER THE NUMBER OF THE ALGO")
    println("1. Linear search")
    println("2. binary Search *IN THIS CASE ENTER A SORTED LIST*")
    val choice = reader.nextInt().also { println("ENTER") }
    println()
    println("ENTER THE LIST AND SEPARATE THE ELEMENT WITH ','")
    val list : List<Int> = readLine()!!.trim().split(",").map (String::toInt) //RIGHT NOW No IDEA ABOUT THIS CODE *FROM STACKOVERFLOW*
    println()
    println("Enter the Required Element :  ")
    println()
    val requiredElement  = readLine()?.toInt()

    val mainProcess = requiredElement?.let { Model(list, it) }
    mainProcess?.calculations(choice)



}