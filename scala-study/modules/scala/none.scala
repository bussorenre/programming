// https://yuroyoro.hatenablog.com/entry/20100710/1278763193

import java.io.File

def findFile(filename: String): Option[File] = {
  val file = new File(filename)
  if (file.exists) Some(file)
  else None
}

def existsCheck(file: Option[File]): String = {
  file match {
    case Some(f) => "exist! [%s]" format f.getName
    case None => "no such file or directory"
  }
}

def valueLength(map: Map[String,String], key: String) = {
  map.get(key) match {
    case Some(v) if v == null => "key %s value is null" format(key)
    case Some(v) => "Key %s value's length is %d" format(key, v.length)
    case None => "Key %s is not contains" format(key)
  }
}