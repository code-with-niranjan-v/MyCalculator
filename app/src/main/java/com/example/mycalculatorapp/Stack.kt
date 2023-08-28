package com.example.mycalculatorapp

data class StackNode<T>(
    var data:T,
    var next:StackNode<T>? = null
)

class Stack<T>{

    var top:StackNode<T>? = null

    fun push(data:T):Stack<T>{
        var newNode = StackNode<T>(data)
        if (top == null){
            top = newNode
        }else{
            var temp:StackNode<T>? = top
            top = newNode
            top?.next = temp
        }
        return this
    }

    fun pop(){

        if(top==null){
            return
        }else{
            var temp = top
            top = top?.next
            temp = null
        }

    }

    fun display(){
        var temp = top
        while (temp!=null){
            println("|${temp.data}|")
            temp = temp.next
        }
    }

}

fun main() {
    val stack = Stack<Int>()
    stack.push(1).push(2).push(3)
    stack.display()
}