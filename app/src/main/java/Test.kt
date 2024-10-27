//package com.vijay.newsapiclient
//
//import kotlinx.coroutines.*
//import kotlin.system.measureTimeMillis
//
////TimeOut Test
////fun main() = runBlocking {
////    try {
////        withTimeout(2000L) {
////            println("Starting long-running task")
////            delay(3000L) // Task takes longer than the timeout
////            println("Task completed")
////        }
////    } catch (e: TimeoutCancellationException) {
////        println("Task timed out")
////    }
////}
//
//
//fun main() = runBlocking {
//    supervisorScope {
//        val job1 = launch {
//            delay(1000L)
//            throw RuntimeException("Job 1 failed")
//        }
//
//        val job2 = launch {
//            try {
//                delay(2000L)
//                println("Job 2 completed successfully")
//            } catch (e: Exception) {
//                println("Job 2 caught an exception: ${e.message}")
//            }
//        }
//
//        // job1 will fail but job2 will complete successfully
//    }
//}
//
////fun main() = runBlocking {
////    val totalTime = measureTimeMillis {
////        val delay1 = delayFun()
////        val delay2 = delayFun2()
////        println("Total delay is ${delay1 + delay2}")
////    }
////    println("Execution time: $totalTime ms")
////    println("Done")
////}
//
////fun main() = runBlocking {
////    val totalTime = measureTimeMillis {
////        val delay1 = async{delayFun()}
////        val delay2 = async{delayFun2()}
////        val res1 = delay1.await()
////        val res2 = delay2.await()
////        println("Total delay is ${res1 + res2}")
////    }
////    println("Execution time: $totalTime ms")
////    println("Done")
////}
//
//suspend fun delayFun(): Long {
//    val delayTime = 1000L
//    delay(delayTime)
//    return delayTime
//}
//
//suspend fun delayFun2(): Long {
//    val delayTime = 500L
//    delay(delayTime)
//    return delayTime
//}
