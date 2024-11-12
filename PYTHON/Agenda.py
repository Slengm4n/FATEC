while True:

    name = str(input("Digite o nome: "))
    fone = int(input("Digite o número de telefone: "))
    email = str(input("Digite o email: "))

    R = name,fone,email 
        
    print (R)
    
    OP = str(input("Deseja continuar? (S/N)"))
    if (OP) != "S":
        print ("Obrigado por usar o programa!")
        break
    
