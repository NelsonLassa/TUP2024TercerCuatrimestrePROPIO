class MiClase:
    #  Variable de clase, este atributo dará a cada objeto el mismo valor
    variable_clase = 'Esta es una variable de clase'

    def __init__(self, variable_instancia):  # La variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia


print(MiClase.variable_clase)
miCalse1 = MiClase('Esta es una variable de instancia')
print(miCalse1.variable_instancia)
print(miCalse1.variable_clase)
miCalse2 = MiClase('Esta es otra prueba de variable de instancia')
print(miCalse2.variable_instancia)
print(miCalse2.variable_clase)

MiClase.variable_clase2 = 'valor de variable de clase 2'
print(MiClase.variable_clase2)
print(miCalse1.variable_clase2)
print(miCalse2.variable_clase2)
