package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Person Jeff = new Person();
        Jeff.addFurniture();
        Jeff.addFurniture();
        Jeff.addFurniture();
        System.out.println(Jeff);
    }
    abstract static class Furniture{
        public String colour;
        public int legs;
        public String name;
        public Furniture(String colour, int legs, String name){
            this.colour = colour;
            this.legs = legs;
            this.name = name;
        }
        public String getColour(){
            return colour;
        }
        public void setColour(String colour){
            this.colour = colour;
        }
        public int getLegsQuantity(){
            return legs;
        }
        public void setLegsQuantity(int legs) {
            this.legs = legs;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    static class Table extends Furniture{

        public Table(String colour, int legs, String name){
            super(colour, legs, name);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getColour(){
            return colour;
        }
        public void setColour(String colour){
            this.colour = colour;
        }
        public int getLegsQuantity(){
            return legs;
        }
        public void setLegsQuantity(int legs) {
            this.legs = legs;
        }
        @Override
        public String toString() {
            return "Table{" +
                    "colour='" + colour + '\'' +
                    ", legs=" + legs +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    static class Chair extends Furniture{

        public Chair(String colour, int legs, String name){
            super(colour, legs, name);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getColour(){
            return colour;
        }
        public void setColour(String colour){
            this.colour = colour;
        }
        public int getLegsQuantity(){
            return legs;
        }
        public void setLegsQuantity(int legs) {
            this.legs = legs;
        }
        @Override
        public String toString() {
            return "Chair{" +
                    "colour='" + colour + '\'' +
                    ", legs=" + legs +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    static class Sofa extends Furniture{

        public Sofa(String colour, int legs, String name){
            super(colour, legs, name);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getColour(){
            return colour;
        }
        public void setColour(String colour){
            this.colour = colour;
        }
        public int getLegsQuantity(){
            return legs;
        }
        public void setLegsQuantity(int legs) {
            this.legs = legs;
        }
        @Override
        public String toString() {
            return "Sofa{" +
                    "colour='" + colour + '\'' +
                    ", legs=" + legs +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    static class FurnitureShop{
        Table Vitra = new Table("brown", 4, "Vitra");
        Chair Minotti = new Chair("red", 4, "Minotti");
        Sofa Knoll = new Sofa("black", 0, "Knoll");
        public Furniture getFurniture(int selector){
            switch(selector) {
                case 1:
                    return Vitra;
                case 2:
                    return Minotti;
                case 3:
                    return Knoll;
            }
            return null;
        }
    }
    static class Person extends FurnitureShop{
        public Furniture[] basket = new Furniture[10];
        int a;
        int i = 0;
        public void addFurniture(){
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
             basket[i]= getFurniture(a);
             i++;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "basket=" + Arrays.toString(basket) +
                    '}';
        }
    }
}
