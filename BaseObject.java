package com.javarush.task.task25.task2515;

public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;

    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public void draw(){}

    public void move(){}

    public void die(){
        isAlive = false;
    }
    /**
     * Если объекты пересеклись - возвращать true, если нет - false.
     * Если центр круга одного объекта попал в круг другого, то будем считать, что они столкнулись.
     */
    public boolean isIntersect(BaseObject o){
        return Math.sqrt(Math.pow((o.x - this.x), 2) + Math.pow((o.y - this.y), 2)) < Math.max(o.radius, this.radius);
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

//4. В классе BaseObject создай метод isIntersect(BaseObject o), который возвращает boolean.
//5. Реализуй метод isIntersect(BaseObject o). В случае если объекты столкнулись, нужно вернуть true, иначе - false