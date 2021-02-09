package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    //Caso 1: DEAD: Revisar que la condición isAlive = False lo cual indica que no esta vivo
    //isAlive = False
    @Test
    public void validateRegistryDead() {
        Person person = new Person("Ana",2146136,20,Gender.FEMALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    //Caso 2: DUPLICATED: Revisar que la condición isAlive = True para corroborar que la persona este viva y
    // despues revisamos que person01.getId = person02.getId lo cual nos muestra con el id de la persona que
    // se esta ingresando ya existe en nuestra lista de personas, lo cual indica que la persona esta duplicada
    // registrados.contains(p.getId())
    @Test
    public void validateRegistryResultDuplicate() {
        Person person01 = new Person("Richard",2158299,20,Gender.MALE,true);
        Person person02 = new Person("Richard",2158299,20,Gender.MALE,true);

        RegisterResult result01 = registry.registerVoter(person01);
        RegisterResult result02 = registry.registerVoter(person02);

        Assert.assertEquals(RegisterResult.VALID, result01);
        Assert.assertEquals(RegisterResult.DUPLICATED, result02);
    }
    //Caso 3:UNDERAGE: Verficamos que la variable getAge < 18 AND getage > 0 que nos muestra que la persona
    // esta por debajo de la edad requerida
    // p.getAge()<18 && p.getAge()>0
    @Test
    public void validateRegistryResultUnderAge() {
        Person person = new Person("Ana",2146136,17,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }


    //Caso 4: VALID: verificamos que la persona este viva, tenga una edad valida y este en una edad apropiada y que no
    // sea no sea una persona duplicada
    //isAlive = true and !registrados.contains(p.getId()) and p.getAge()>=18 and p.getAge()<=120
    @Test
    public void validateRegistryResultValid() {
        Person person = new Person("Ana",2146136,20,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    //Caso 5: INVALID_AGE: Verificamos que la variable getAge < 0 AND getAge > 120 lo cual nos indica que es una
    // edad invalida
    // p.getAge()<0 or p.getAge()>120
    @Test
    public void validateRegistryResultInvalidAge(){
        Person person = new Person("Richard",2158299,-20,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
}