# 直角三角形の判別を行う。
# 判別にはピタゴラスの定理を用いる
# ３つの数字を受け取って、
# a*a == b*b + c*c の結果を返す 関数を定義する
# その関数を用いて、入力された3辺が成す三角形が
# 直角三角形か判断してね〜〜〜〜〜













def pythagorean(a, b, c):
    if a ** 2 == b ** 2 + c ** 2 or \
        b ** 2 == c ** 2 + a ** 2 or \
        c ** 2 == a ** 2 + b ** 2:
        return True
    else:
        return False

x = 5
y = 12
z = 13

if(pythagorean(x, y, z)):
    print("直角三角形です！")