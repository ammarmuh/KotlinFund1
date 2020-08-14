import java.util.*
fun main(){
    var grade=""
    print("Nilai : ")
    val reader = Scanner(System.`in`)
    val nilai:Int = reader.nextInt()
    if(nilai>90 && nilai<=100) grade="A"
    else if (nilai>80 && nilai<=90) grade="B"
    else if (nilai>70 && nilai<=80) grade="C"
    else if (nilai>60 && nilai<=70) grade="D"
    else if (nilai>=50 && nilai<=60) grade="E"
    else grade="tidak terdefinisi"
    print("Selamat ya bro nilai kamu $nilai (akreditasi $grade)")
}