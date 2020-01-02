Feature: ¿Cual es el valor de la prima para el seguro de un carro?
	El vendedor de seguros de carros desea saber el valor de la prima de un carro.

	Scenario: El vendedor de seguros consulta el valor de la prima de una persona joven
    	Given El cliente tiene 25 anios con 20 puntos
    	When El vendedor calcula el valor de prima
    	Then La prima es 900
    
	Scenario: El vendedor de seguros consulta el valor de la prima de una persona de la tercera edad
    	Given El cliente tiene 62 anios con 30 puntos, tiene los puntos completos
    	When El vendedor calcula el valor de prima
    	Then La prima es 250