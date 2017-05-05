baselevel = 1
hitpoints = baselevel * 20
manapoints = baselevel * 5
atk = baselevel * 2
armor = baselevel * 2

place = "Village"

while place == "Village":
    action = input("O que fazer? ")
    if action == "Stats":
        print("Nível", baselevel)
        print("Pontos de saúde", hitpoints)
        print("Pontos de magia", manapoints)
        print("Indice de dano", atk)
        print("Indice de armadura", armor)
    elif action == "XP Potion":
        baselevel += 1
        hitpoints = baselevel * 20
        manapoints = baselevel * 5
        atk = baselevel * 2
        armor = baselevel * 2
        print("Você se sente revigorado!...")
    else:
        print("Seu herói está confuso")