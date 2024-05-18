   // print -> type tanpa enter
    println("Hello, Android ") // println (print dan enter new line)
    
    // Sentence, word, character ""
     
    // Creating constant variable // Pemalar (Nombor)
    val x = 1
    val y = 3
    
    println(x)   // 1
    
    val z = x+y //4
    println(z)
    
    
    // Implicit declaration, Explicit declaration
    // TIdak perlu sepecify data type (imply - agak)
    // Explicit - Kita akan specify
    
    
    // Constant vs variable
    // Pemalar vs Pemboleh Ubah
    // Constant (val) -> Once I declare it, I cannot change the value anymore
    // A constant use less memory because it is fixed
    val name = "Muzaffar"
   // name = "Wan Muzaffar"
    println(name)
    
    // Variable (var)=> Once declared as var, I can change the value
    // Dynamic memory alocation
    var fullName = "Muzaffar"
    fullName = "Wan Muzaffar"
    println(fullName)
    
    
    // Data type Jenis Data
    
    // String -> Perkataan, ayat  / ""
    // Char -> Karekter huruf / ''
    // Saya juga boleh specify data type yang digunakan
    
    // : (of type)
    
    val address:String = "Seri Kembangan"
    println(address)
    
    
    // Huruf - pakai Char
    var jantina:Char = 'L'
    println(jantina)
    
    // Operasi 
    // +
    val message = "My name is "+name+" I live in "+address
    println(message)
    
    // String interpolation
    // $ -> akan cari variable yang ditetapkan name
    val anotherMessage:String = "My name is $name and I live in $address"
    println(anotherMessage)
    
    // Bermula dengan huruf kecil, untuk perkataan besarkan
    // anotherMessage
    
    // Number
    
    // Kalau declare double, kena specify . walaupun 0
    // Kalau Double + Int boleh tetapi hasil mesti Double
    // In case saya nak hasil Int, round ..
    
    var num1:Int = 9
    var num2:Int = 5
    
    var sum = num1+num2
    println(sum)
    
    // Operasi + , - , * , / , %
    
    var minus = num1-num2
    println(minus)
    
    var product = num1 * num2
    println(product)
    
    var division = num1 / num2 // Integer Division / Integer divide by Integer = Integer = 9 /5 = 1 
    // Salah satu kena double untuk dapatkan Double division
    println(division)
    
    // % ganjil genap ,  num % 2 == 0  (genap) num % 2 == 1 (ganjil) 
    // design yang reset, line 1 merah line 2 biru, line 3 kuning line 4 merah, biru , kuning
    // line % 3 == 1 (merah)
    // line % 3 == 2 (biru)
    // line % 3 == 0 (kuning)
    var modulo = num1 % num2 // baki operasi bahagi 9/5 bakinya adalah 1 9/5 , bakinya adalah 4
    println(modulo)
    
    
    // Boolean (true or false)
    // Boolean data type is normally use for logic , ex: when using if else statement
    var eaten = true
    var tired:Boolean = false
    
    // Boolean operation : && (AND), || (OR), ! (Reverse)
    
    println(eaten && tired) // Kedua dua perlu true untuk ia true
    println(eaten || tired) // Salah satu perlu true untuk ia true
    println(!eaten) // Reverse kalau true, akan return false, kalau false, return true !
    
    
    /// Nullable ?
    // null (tiada value)
    
    // Kita tak declare of type = Imply it is nullable
   
    var profession = null // (Tiada value) / Bayangkan dalam form benda yang tak wajib diisi dan kita nak retrieve value dia
    // TO declare a variable as nullable the data type needs to be added with ?
    
    var newProfession:String? = null // Question means it can be null or it can be a value
    println(newProfession)
   	println(profession)
    newProfession = "Trainer"
    println(newProfession)
    
    var tinggi = 170
    var berat = 70
    var bmi =   berat /((tinggi / 100)* (tinggi / 100))// (point) / Int
   // println(bmi)
    
    
    // Array 
    // Is a data type to store a collection of repeated item
    // I create a variable to store a collection of scores
    // Index of an array start from 0
    
    var scores = arrayOf(70,90,100,80,85,60)
    
    println(scores[0]) // To retrieve the first item in the array
    println(scores[1])
    println(scores.size) // How many item in the array (length)

    
    

