// フィボナッチ数列を出力する関数
def fib(n: Int): Int = {
	if ( n == 1 ) 0
	else if ( n == 2 ) 1
	else fib(n - 1) + fib(n - 2)
}