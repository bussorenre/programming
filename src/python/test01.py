# なべあつを作る
# 40 までの数で
# 3の倍数と、3がつくときだけ 「アホ」と出力する
# それ以外は 数字を出力する

for i in range(40):
    x = i + 1
    if x % 3 == 0 or x%10 == 3 or x//10 == 3:
        print("aho")
    else:
        print(x)

