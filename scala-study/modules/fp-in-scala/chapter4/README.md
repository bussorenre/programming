
# chapter 4 例外を使わないエラー処理

## 部分関数

一部の入力に対して、定義されない関数の事。例えば、割り算は０で割った時例外を返すので、部分関数である。
一般的には、入力型によって暗黙的に定義されない入力に関してある種の前提を設けている。

関数型プログラミングでは、この部分性に Option 及びEither 型で対応するのが一般的

## 標準のライブラリを回避する

```
import scala.{Option => _, Either => _, _}
```

このようにして、Option 及び Either にアクセスできないようにする

## B :> A

Bの型が Aと同じかAのスーパークラスと同一の型である必要がある