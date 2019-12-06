package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static <T extends Number>int sum(T[] values) {
        int sum = 0;
        for (T value : values) sum += value.intValue();
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static <T extends Number> double avg(T[] values) {
        return (double) sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */
    public static <T extends Number> int  max(T a, T b) {
        return a.intValue() > b.intValue() ? a.intValue() : b.intValue();
        
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @return максимальное значение массива
     */
    public static <T extends Number> int max(T[] values) {
        int result = values[0].intValue();
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param a первое значение
     * @param b второе значение
     * @return меньшее из дух значений
     */
    public static<T extends Number> int min(T a, T b) {
        return a.intValue() < b.intValue() ? a.intValue() : b.intValue();
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param values массив значений
     * @return минимальное значение массива
     */
    public static <T extends Number> int min(T[] values) {
        int result = values[0].intValue();
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }
}
