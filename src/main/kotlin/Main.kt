//fun main(args: Array<String>) {
//  var number : Int = 0
//    while (number < 10)
//        number ++
//        println(number)
//
//// do and while loop
//    var lek : Int = 0
//    do {
//        println(lek)
//        lek ++
//    }while (lek >5 )
//
//
//
// // another example of while do loop
//
//
//
//}

fun main (){
    var Number : Int = 20

    do {
        if (Number % 2 == 0){
            println(Number)
        }

        Number ++

    }
    while(Number <= 100)



// the use of break
    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }

    var j = 4
    while (j >3){
        println(j)
        j++
        if (j==10){
            break
        }
    }


    }

   for (i in 1..100){
       println(i)

       // break when i equal 50
       if (i == 50){
           break
       }
   }

   // if i wanna to break the inner and outside loop

   myLoop@ for (a in 1..3){
       for (b in 1..3){
           println("${a} $b")
           if ( a ==1 && b == 2)
               break@myLoop
       }
   }



}