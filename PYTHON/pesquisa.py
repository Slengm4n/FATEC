
def pesquisa():

    entrevistados = []

    N = int(input("Quantas pessoas participaram? "))
    
    for i in range (N):
        print(f"\nPessoa {i+1}:")
        sexo = str(input("Qual o sexo da pessoa entrevistada?\nM - Masculino | F - Feminino: ")).strip().upper()
        resp = str(input("Gostou do produto?\nS - Sim | N - Não: ")).strip().upper()
        entrevistados.append({"Sexo": sexo, "Opiniao": resp})

        total_sim = sum(1 for e in entrevistados if e["Opiniao"] == "S")
        total_nao = sum(1 for e in entrevistados if e["Opiniao"] == "N")

        sexo_masc = sum(1 for e in entrevistados if e["Sexo"] == "M")
        sexo_fem = sum(1 for e in entrevistados if e["Sexo"] == "F")

        total_fem_sim = sum(1 for e in entrevistados if e["Sexo"] == "F" and e ["Opiniao"] == "S")
        total_masc_nao= sum(1 for e in entrevistados if e["Sexo"] == "M" and e ["Opiniao"] == "N") 

        perc_fem_sim = (total_fem_sim / sexo_fem  * 100)  if sexo_fem > 0 else 0
        perc_masc_nao = (total_masc_nao / sexo_masc * 100) if sexo_masc > 0 else 0

    print("\nResultados da pesquisa:")
    print(f"1. Número de entrevistados que responderam sim: {total_sim}")
    print(f"2. Número de entrevistados que responderam não: {total_nao}")
    print(f"3. Porcentagem de entrevistados do sexo feminino que responderam sim: {perc_fem_sim:.2f}%")
    print(f"4. Porcentagem de entrevistados do sexo masculino que responderam não: {perc_masc_nao:.2f}%")
pesquisa()

