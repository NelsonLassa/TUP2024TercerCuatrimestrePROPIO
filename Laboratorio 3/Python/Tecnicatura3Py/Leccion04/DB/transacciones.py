import psycopg2 as bd  # Esto es para poder conectarnos a PostgreSQL

conexion = bd.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido,email) VALUES (%s, %s, %s)'
    valores = ('Maria','Esparza','mesparza@mail.com')
    cursor.execute(sentencia,valores)
    print('Termina la transacción')


except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    # cursor.close() el cierre del cursor lo esta haciendo el with
    conexion.close()



# Documentación de la conexion a la base de datos
# https://www.psycopg.org/docs/usage.html
