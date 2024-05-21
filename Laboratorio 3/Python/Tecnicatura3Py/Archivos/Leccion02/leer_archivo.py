# c:\\usuario\\Nelson\\TUP3°Semestre\\Laboratorio3\\Python\\Tecnicatura3Py\\Archivos\\Leccion02\\prueba.txt si no se encuentra en la misma carpeta
# se debe colocar la url
try:
    archivo = open('prueba.txt', 'r', encoding='utf8')  #
    # print(archivo.read())
    # print(archivo.read(16))
    # print(archivo.read(10)) # Continiamos desde la línea anterior
    # print(archivo.readline())
    # print(archivo.readline())

    # vamos a iterar el archivo, cada una de las líneas
    #for linea in archivo:
        # print(linea): Iteramos todos los elementos del archivo
        # print(archivo.readlines()[11]) #  accedemos al archivo como si fuera una lista


    # Anexamos información, copiamos a otro
    archivo2 = open('copia.txt', 'w',encoding='utf8')
    archivo2.write(archivo.read())
except Exception as e:
    print(e)
finally:
    archivo.close() # cerramos el primer archivo
    archivo2.close() # cerramos el segundo archivo

    print('Se a terminado el proceso de leer y copiar archivos')
