place = "Village"

while place == "Village":
    action = input("O que fazer? ")
    if action == "Montanha":
        print("Você chegou na montanha, terras geladas, monstros perigosos e muitos mistérios o aguardam...")
        place = action
    else:
        print("Seu herói está confuso...")

while place == "Montanha":
    print("Compilado")
    action = input("O que deseja fazer? Code 0")