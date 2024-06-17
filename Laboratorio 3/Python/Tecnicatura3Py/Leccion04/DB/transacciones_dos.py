import psycopg2 as bd  # Esto es para poder conectarnos a PostgreSQL

conexion = bd.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    conexion.autocommit = False # esto directamente no deberia estar, iniica la transacción
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido,email) VALUES (%s, %s, %s)'
    valores = ('Carlos', 'Lara', 'clara@mail.com')
    cursor.execute(sentencia, valores)

    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    valores = ('Juan', 'Juarez','jcjuarez@mail.com',1)
    cursor.execute(sentencia,valores)


    conexion.commit()  # Hacemos el commit manualmente, se cierra la transacción
    print('Termina la transacción')

except Exception as e:
    conexion.rollback()
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    # cursor.close() el cierre del cursor lo esta haciendo el with
    conexion.close()

# Documentación de la conexion a la base de datos
# https://www.psycopg.org/docs/usage.html
