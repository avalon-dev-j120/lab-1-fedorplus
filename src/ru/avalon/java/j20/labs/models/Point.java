package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point <T extends Number>{
    /**
     * Абсцисса точки.
     */
    private final Number x;
    /**
     * Ордината точки.
     */
    private final Number y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public Point(T x, T y) {
        this.x = x.floatValue();
        this.y = y.floatValue();
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public Number getX() {
        return x;
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public Number getY() {
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
        float dx = x.floatValue() - point.x.floatValue();
        float dy = y.floatValue() - point.y.floatValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
