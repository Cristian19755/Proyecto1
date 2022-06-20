class Token:
    def __init__(self, lexema:str , linea:int , columna:int , tipo:str) -> None:
        self.lexema = lexema
        self.linea = linea
        self.columna = columna
        self.tipo = tipo

class Error:

    def __init__(self,descripcion : str, linea : int, columna : int):
        self.descripcion = descripcion
        self.linea = linea
        self.columna = columna

class AnalizadorLexico:
    
    def __init__(self) -> None:
        self.listaTokens  = []
        self.listaErrores = []
        self.listaIgnored = []
        self.listaTrancisiones = []
        self.linea = 1
        self.columna = 0
        self.buffer = ''
        self.estado = 0
        self.simbolo = ''
        self.i = 0
        self.listaAFD = []

    def new_token(self,caracter,token):
        self.listaTokens.append(Token(caracter,self.linea,self.columna,token))
        self.buffer = ''

    def new_error(self,caracter):
        self.listaErrores.append(Error('Lexema ' + caracter + ' no reconocido en el lenguaje.', self.linea, self.columna))
        self.buffer = ''
    
    def s0(self, caracter: str):
        if caracter == '<':
            self.estado = 1
            self.buffer += caracter
            self.columna += 1 
        elif caracter== '\n':
            self.linea += 1
            self.columna = 0
        elif caracter in ['\t',' ']:
            self.columna += 1
        elif caracter == "·":
            pass 
        else:
            self.buffer += caracter
            print('El lexema: '+self.buffer+' no es un comentario en html(False)')
            self.new_error(caracter)
            self.columna += 1
            self.estado = 0
    
    def s1(self, caracter: str):
        if caracter == '!':
            self.estado = 2
            self.buffer += caracter
            self.columna += 1
        else:
            self.buffer += caracter
            print('El lexema: '+self.buffer+' no es un comentario en html(False)')
            self.new_error(self.buffer)
            self.columna += 1
            self.estado = 0
    
    def s2(self, caracter: str):
        if caracter == '-':
            self.estado = 3
            self.buffer += caracter
            self.columna += 1

    def s3(self, caracter: str):
        if caracter == '-':
            self.estado = 4
            self.buffer += caracter
            self.columna += 1
        else:
            self.buffer += caracter
            print('El lexema: '+self.buffer+' no es un comentario en html(False)')
            self.new_error(self.buffer)
            self.columna += 1
            self.estado = 0
    
    def s4(self, caracter: str):
        if caracter not in ['-']:
            self.estado = 4
            self.buffer += caracter
            self.columna += 1
        else:
            self.estado = 5
            self.buffer += caracter
            self.columna += 1
    
    def s5(self,caracter: str):
        if caracter not in ['-']:
            self.estado = 4
            self.buffer += caracter
            self.columna += 1
        else:
            self.estado = 6
            self.buffer += caracter
            self.columna += 1
    
    def s6(self, caracter: str):
        if caracter == '>':
            self.buffer += caracter
            self.estado = 0
            self.columna += 1
            print('El lexema: '+self.buffer+' es un comentario en html(True)')
            self.new_token(self.buffer, 'Comentario_html')
        elif caracter == '·':
            self.buffer += caracter
            print('El lexema: '+self.buffer+' no es un comentario en html(False)')
            self.new_error(self.buffer)
            self.estado = 0
            self.columna += 1
        else:
            self.estado = 4
            self.buffer += caracter
            self.columna += 1
    
    def analizar(self, cadena):
        cadena = cadena + '·'
        self.listaErrores = []
        self.listaTokens = []
        self.i = 0
        while self.i < len(cadena):
            if self.estado == 0:
                self.s0(cadena[self.i])
            elif self.estado == 1:
                self.s1(cadena[self.i])
            elif self.estado == 2:
                self.s2(cadena[self.i])
            elif self.estado == 3:
                self.s3(cadena[self.i])   
            elif self.estado == 4:
                self.s4(cadena[self.i])   
            elif self.estado == 5:
                self.s5(cadena[self.i])
            elif self.estado == 6:
                self.s6(cadena[self.i])
            self.i += 1

M = AnalizadorLexico()
pruebas = ['<-->','<!--abc-->-->','<!-- :) -->']
for prueba in pruebas:
    M.analizar(prueba)