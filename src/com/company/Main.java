package com.company;

public class Main {

    public static void main(String[] args) {
        Boss slash = new Boss();
        slash.setDamage(50);
        slash.setHealth(1200);
        slash.weapon.setNameWeapon("мечь");
        slash.weapon.setNameWeapon("холодное оружие");
        System.out.println("Здоровье босса " + slash.health + "Урон босса  " + slash.damage + "Имя оружия " + slash.weapon.getNameWeapon() + "Вид оружия" + slash.weapon.getTypWeapon());
    }
}
