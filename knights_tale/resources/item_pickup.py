place = "Village"
inventory = ["Empty"]
atk = 1*2

while place == "Village":
    action = input("O que fazer? ")
    if action == "Procurar" and inventory[0] != "Flamablade":
        print("Você achou a espada de fogo!")
        inventory[0] = ("Flamablade")
    elif action == "Inventário":
        print(inventory)
        inv_action = input("O que deseja fazer no inventário? ")
        if inv_action == "Sair":
            print("Voltando...")
        elif inv_action == "Flamablade" and inventory[0] == "Flamablade":
            print("Flamablade equipada! Seus golpes dão dano de fogo! ATK +20")
            atk += 20
        else:
            print("Seu herói está confuso...")
    else:
        print("Seu herói está confuso...")