### EJECUTAR LAS PRUEBAS
> ## Revise cuál es la diferencia.
>> * **package:** Compila el proyecto y lo empaqueta
>> * **test:** Ejecuta las pruebas de unidad

### FINALIZAR EL EJERCICIO
> ## Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5.
>> 1. DEAD:\
    isAlive = False

2. UNDERAGE:\
    getAge < 18

3. INVALID_AGE:\
    getAge < 0 AND getAge > 120

4. DUPLICATED:\
    person01.getId = person02.getId

5. VALID:\
    Not DEAD, Not UNDERAGE, Not INVALID_AGE, Not DUPLICATED
