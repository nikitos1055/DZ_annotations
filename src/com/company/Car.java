package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Car {
//    @MyAnnotation(name = "BMW")
    @MyAnnotation()
    private String name;

    private String model;

    @MyAnnotation()
    private String color;

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }


    void checkAnnotation(Object o) throws ClassNotFoundException, IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations)
                if (annotation.annotationType().equals(MyAnnotation.class))
                    System.out.println("Field <"+field.get(o) + "> - Is annotated");else{
                    System.out.println("No annotated fields");
                }
        }
    }

    // getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
