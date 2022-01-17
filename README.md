# Figuras
Api rest Sprign Boot Figuras

**Ejemplo metodo POST**

Mediante la url http://localhost:8080/figura se insertan los datos enviando
los siguientes datos en formato JSON dependiendo el tipo de figura (circulo, rectangulo, triangulo, cuadrado)
```
{
    "base": 12.5,
    "altura": 25.0,
    "diametro":null,
    "tipoFigura": "cuadrado"
}
```


**Ejemplo llamado al metodo GET**

- http://localhost:8080/figura/rectangulo
- http://localhost:8080/figura/cuadrado
- http://localhost:8080/figura/triangulo
- http://localhost:8080/figura/circulo
