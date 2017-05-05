place = "Forest"
monster_counter = 4
baselevel = 1
luck = 20
atk = 10
death_event = False
wolfHP = 20
hitpoints = 20
inventory =["Empty"]

while place == "Forest":
    action = input("O que fazer? ")
    if action == "Descansar":
        print("Você se sente revigorado!")
        if hitpoints <= 10:
            hitpoints += 10
        else:
            hitpoints = 20
    elif action == "Procurar":
        print("Seu herói não achou nada util...")
    elif action == "Stats":
        print("Pontos de saude", hitpoints,"/ 20")
        print("Nivel", baselevel)
        print("Indice de ataque", atk)
        print("Indice de sorte", luck)
    elif action == "Inventário":
        print(inventory)
        inv_action = input("O que quer fazer no inventário? ")
        if inv_action == "Elixir" and inventory[0] == "Elixir":
            print("Você está totalmente curado!")
            hitpoints = 20
    else:
        print("Seu herói está confuso...")
    monster_counter -= 1
    if monster_counter == 1:
        print("As sombras se mexem a sua volta...")
    if monster_counter == 0:
        wolfHP = 20
        while monster_counter == 0:
            print("Um lobo ataca! O que fazer?")
            action = input("Ataque ou corra! ")
            if action == "Corra" and luck >= 15:
                print("Fugiu com sucesso")
                monster_counter = 5
            elif action == "Ataque":
                wolfHP -= atk
                print("Você deu", atk,"de dano em Lobo")
                print(wolfHP, "/ 20")
                if wolfHP <= 0:
                    print("Voce venceu! Você subiu de nivel!")
                    baselevel += 1
                    if inventory[0] != "Elixir":
                        print("Lobo deixou cair Elixir")
                        inventory[0] = "Elixir"
                    monster_counter = 5
                if wolfHP > 0:
                    hitpoints -= 10
                    if hitpoints <= 0:
                        death_event = True
                        place = "Netherrealm"
                        monster_counter == 5
                    print("Lobo te deu 10 pontos de dano! Ouch, doeu!")
                    print(hitpoints, "/ 20")

if place == "Netherrealm" and death_event == True:
    print("Você morreu")