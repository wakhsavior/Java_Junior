package org.example.Seminar_01.task2;

public interface Food extends Thing{
    /**
     * Получить наличие протеинов в еде
     * @return Наличие протеинов
     */
    boolean  getProteins();

    /**
     * Получить наличие жиров в еде
     * @return Наличие жиров
     */
    boolean getFats();

    /**
     * Получить наличие углеводов в еде
     * @return Наличие углеводов
     */
    boolean getCarbohydrates();

}
