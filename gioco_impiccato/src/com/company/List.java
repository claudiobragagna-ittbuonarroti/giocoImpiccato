package com.company;

public interface List <T>{
    abstract public float readElement(int index);
    abstract public float editElement(int index);
    abstract public int countElements();
    abstract public void deleteElement(int index);
    abstract public void addElement(int index, float valore);

}
