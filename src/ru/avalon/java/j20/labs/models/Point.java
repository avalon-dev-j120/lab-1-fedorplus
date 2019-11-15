package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point {
    /**
     * Абсцисса точки.
     */
    private final int x;
    /**
     * Ордината точки.
     */
    private final int y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public int getX() {
        return x;
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public int getY() {
        return y;
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public double distanceTo(Point point) {
        float dx = x - point.x;
        float dy = y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
