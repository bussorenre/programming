// https://yuroyoro.hatenablog.com/entry/20100710/1278763193
// オプション解析をOption でいい感じにする

// よくわからんけどコピった
val OptPattern = """-(\S+)\s?([^-]\S+)?""".r
def parse( args:String ):Map[String,String] = 
  OptPattern.findAllIn(args).matchData.map{ m => 
    m.group(1) -> (if( m.group(2) == null ) "" else m.group(2)) }.toMap


// よくわからんけどサンプルをコピって用意した
val rawargs = "-verbose -unchecked -deprecation -classpath ./:./lib -d ./bin hoge.scala"

// map[String, String]が帰ってくる
val opts = parse(rawargs)
