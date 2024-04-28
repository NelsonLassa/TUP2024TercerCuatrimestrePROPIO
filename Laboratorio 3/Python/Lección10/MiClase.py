class MiClase:
    #  Variable de clase, este atributo dará a cada objeto el mismo valor
    variable_clase = 'Esta es una variable de clase'

    def __init__(self, variable_instancia):  # La variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia

    @staticmethod
    def metodo_estatico():  # Método estático, se asocia a la clase
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls):  # cls es una refencia la clase
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)

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

MiClase.metodo_estatico()

MiClase.metodo_clase()
miObjeto1 = MiClase('variable de instancia')
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()