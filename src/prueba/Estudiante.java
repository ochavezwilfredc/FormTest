/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author crist
 */
public class Estudiante {
    private String name, surname, phone, sex, direction;

    public Estudiante() {
    }

    public Estudiante(String name, String surname, String phone, String sex, String direction) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.sex = sex;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "name=" + name + ", surname=" + surname + ", phone=" + phone + ", sex=" + sex + ", direction=" + direction + '}';
    }
    
    
    
}
