import logging as log

# docs.python.org/3/howto/logging.html
# Llamamos una configuración básica

log.basicConfig(level=log.DEBUG,
                # 1° hora de error - 2° Nivel de error - 3° Nombre del Archivo - 4° Linea que se ejecuto - 5° El mensaje
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(message)s',
                # Formato de la fecha %HORA: %MINUTOS: %SEGUNDOS % AM O PM
                datefmt='%I:%M:%S %p',
                #Handler (recibe el nombre del archivo)
                handlers=[
                    log.FileHandler('capa_datos.log'),
                    log.StreamHandler()
                ])

if __name__ == '__main__':
    log.debug('Mensaje a nivel debug')
    log.info('Mensaje a nivel info')
    log.warning('Mensje a nivel warning')
    log.error('Mensaje a nivel error')
    log.critical('Mensaje a nivel critical')
