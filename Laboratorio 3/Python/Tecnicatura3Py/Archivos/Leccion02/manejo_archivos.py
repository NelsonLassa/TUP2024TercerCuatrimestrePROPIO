# Derclaramos una variable
try:
    archivo = open('prueba.txt', 'w')  # La w es de write que significa escribir
except Exception as e:
    print(e)
finally: # siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo

