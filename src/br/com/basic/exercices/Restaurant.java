package br.com.basic.exercices;

public class Restaurant extends Company{
    public Restaurant(String name, String telephone, String address) {
        super(name, telephone, address);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + getName() + '\'' +
                ", telephone='" + getTelephone() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
