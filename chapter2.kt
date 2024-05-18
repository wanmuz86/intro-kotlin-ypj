// Bila app kita bermula ini adalah tempat pemulanya
// main function
fun main () {    

    // Control flow in Kotlin
    // In Kotlin if doing if else with one line {} is optional but I encourage you to use {}
    
    var myAge = 16 // TUkar 30, ke 16,
    
    // if (jika)
    if (myAge < 18) { // If the age is below 18 
    	println("You are underage") // This line will be executed
    }
    println("The End")
    
    
    // If and else (Jika dan lain lain)
    if (myAge < 18){
        println("You are underage")  // If below 18
    }
    else  {
        println("You can watch the movie") // If not
    }
    
    // If, else if, else (jika, jdan ika .. , dan lain lain)
    
    if (myAge < 13){
        println("Ypu cannot watch the movie")
    }
    else if (myAge < 18){
        println("You can watch with parent (PG)")
    }
    else {
        println("You can watch the movie")
    }
    
    // bawah 13 tahun tak boleh
    // 13 tahun ke atas kena ada parent
    // 18 tahun ke atas boleh
    
    var childAge = 17
    var parent = true
    
    if (childAge < 13 || childAge < 18 && parent == false){
        println("You cannot watch the movie")
    }
    else {
        println("You can watch the movie")
    }
    
    
    // When (a.k.a Switch Case in other language)
    // Akan dipakai di dalam Android apabila kita membuat button
    
    var size = 1
    var price:Int? = null
    
    when (size) { 
        1-> price = 5
        2-> price = 7
        3-> price = 10
        else-> println("We dont support other size")  // default
    }
    println(price)
    
        
    var tinggi = 170.0
    var berat = 70
    var bmi =   berat /((tinggi / 100)* (tinggi / 100))// (point) / Int
   println(bmi)

   
 when {
	childAge < 13 -> println("You cannot watch movie")
	childAge < 18 && parent == false -> println("You cannot watch the movie")
	childAge < 18 && parent == true -> println("You can watch the movie")
	else -> println("You can watch the movie")
	}
 
 
 
 
 // For loop
 
 // Bekerja dengan index, ataupun nombor
  println("Menaik")
 for (i in 0..5){
     println("i=$i") // Dari 0 sehingga 5, keluarkan nilai i
 }
 println("Menurun")
 
 for (i in 5 downTo 0){
     println("i=$i") // Dari 5 sehingga 0 keluarkan nilai i
 }
   println("Menaik tambah 2")
 for (i in 1..5 step 2) {
     println("i=$i") // Dari 1 sehingga 5, setiap kali naik 2
 }
   println("Menurun kurang 2")
 
 for (i in 5 downTo 1 step 2){  // downTo
     println("i=$i") // Dari 5 hingga 1 , setiap kali turun 2
 }

  for (i in 5 downTo 1 step 2){  // downTo
     println("i=$i") // Dari 5 hingga 1 , setiap kali turun 2
 }
  
    
  // For item in array // untuk bekerja dengan collection (foreach)
  
  var languages = arrayOf("Ruby", "Kotlin","Python","Java")
  
  for (item in languages){
      println(item)
  }
  
  // languages.size = 4
  // dari 0 sehingga 3
  // Item start from 0, 1,2,3 
  // langauages[0] = "Ruby", languages[1] = "Kotlin"..
  // ${} -> Interpolation kalau ada function
  // FYI we can also use indices (If you curious you can have a look)
  
  for (i in 0 ..languages.size - 1){
      println("Item at index $i is ${languages[i]}")
  }
  
  
  // While
  var x1 = 30
  while (x1 <= 5){
      println("x1 = $x1")
      x1++ // Selagi nilai x1 kurang dari 5, keluarkan nilai x1 dan tambah 1 setiap kali
  }
  
  
  //Do while
  // Selagi => But do while will ensure that the code inside do to be executed at least 1
  var x2 = 30
    do {
        println("x2 = $x2")  // keluarkan nilai x2
        x2++ // dan tambahkan kepada 1
    } 
    while(x2<=5) // ulang semula selagi x2 kurang sama dengan 5
    
    
    // KELUAR DARI CONTROL FLOW -break
    
    var x3 = 1
    do {
        println("x=$x3")
        x3++
        if (x3 == 3) break  // KELUAR DARI DO WHILE / CONTROL FLOW INI
    }
    while (x3<=5)
    
    // continue - ABAIKAN SENARIO INI
    
    var x4= 0
    do {
        x4++
        if (x4==3) {continue} // abaikan senario ini tetapi teruskan ke while
        println("x4=$x4")
    }
    while (x4 <=5)
    
    sayHello() // FUnction invokation / Memanggil function
    
    sayGoodbye("Wan")
    sayGoodbye("John")
    
    println(sum(3,4))
    
    
    println(calculateBmi(170.0,80.0))
}

// Function is a group expression that an be reusable in our code

fun sayHello(){
    println("Hello World") // Declaring a function name sayHello, this function will just print "Hello World"
}

// FUnction with argument/ parameter
fun sayGoodbye(name:String){
    println("Goodbye $name");
}
// Function with return 

fun sum(a:Int, b:Int):Int {
    return a+ b
}


//Iya mengambil dua argument height dan weight di dalam Double
fun calculateBmi(height:Double, weight:Double): Double{ // Formula yang dipulangkan adalah Double
    return weight / ((height/100) * (height/100)) // Function ini akan memulangkan formula ini
}

    
    
