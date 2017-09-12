// Simple tail recursion for

def factorial(n:Int): Int =
  if (n == 0) 1 else n * factorial(n -1)

// Print the tail recursive factorial.

factorial(5)


// Factorial reduction using the reduce function instead of tail recursion
def factorial_reduce(n:Int):Int = (2 to n).reduce(_ * _)

// print the reduce factorial
factorial_reduce(5)


// The classic GCD for
def gcd(a:Int, b:Int):Int =  (a,b)match{
  case (a, 0) => a
  case (a, b) => gcd(b, a % b)
}


gcd(22,7)


// Fold left
val fold_list_list : List[Int] = List(1,2,3,4,5,6)
fold_list_list.foldLeft((total, cur) => total * cur)
//def folding_left(left_list: List[Int]):Int =
