package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * Идеальный вес для мужщины. Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return (height - 100)*1.15D;
    }

    /**
     * Идеальный вес для женщины. Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return (height - 110)*1.15D;
    }
}
