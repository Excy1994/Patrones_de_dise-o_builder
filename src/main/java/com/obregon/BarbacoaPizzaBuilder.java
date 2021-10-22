package com.obregon;

public class BarbacoaPizzaBuilder extends PizzaBuilder {

    public void ponerNombre() {
        pizza.setNombre("Barbacoa");
    }
    @Override
    public void crearMasa() {
        pizza.setMasa("gorda");
    }
    @Override
    public void crearSalsa() {
        pizza.setSalsa("barbacoa");
    }
    @Override
    public void crearIngredientes() {
        pizza.setIngredientes("mozzarella, ternera, cebolla, maíz");
    }
}
