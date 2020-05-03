program sc

!Un programa sencillo para el calculo de superficie corporal 
implicit none 

! Declaracion de variables 
real:: peso, talla, s_corporal

! Declaracion de constantes 
real, parameter:: a = 0.20247 
real, parameter:: b = 0.725 
real, parameter:: c = 0.425 

! Asignacion de valores 
peso = 70 
talla = 1.72

! Operaciones 
s_corporal = a * talla**b * peso**c

! Salida de resultados 
print *, 'La superficie corporal es', s_corporal

end program 
