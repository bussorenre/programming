
// Future とmap の関係を確認する
// 参考URL: https://yuroyoro.hatenablog.com/entry/20100317/1268819400
import scala.concurrent._
import ExecutionContext.Implicits.global

val hoge: Future[Option[Int]] = Future { Some(1) }

hoge.map {
  case Some(x) => Future {Some(x)}
}