package ru.rzn.sbt.javaschool.functional;

  /*
     * Для тех, у кого осталось время:
     *
     *
     * 13. Сгенерировать список из случайного числа (не более N) случайных чисел от 0 до X
     * (Один из вариантов решения - метод randomIntegerList() в тесте к этому уроку)
     *
     * 14. Сгенерировать список из случайного числа (не менее N1 и не более N2) строк
     *    случайной длины (не менее M1 и не более M2), состоящих из случайных символов с кодами от C1 до C2.
     * (Один из вариантов решения - метод randomStringList() в тесте к этому уроку,
     *  ещё один вариант - в методе logEverything_full в BasicsLessonTest)
     *  */

import java.util.List;

import static ru.rzn.sbt.javaschool.functional.FunctionalLesson.anotherRandomGenerate;
import static ru.rzn.sbt.javaschool.functional.FunctionalLesson.randomGenerate;

public class AotherFunctionalLesson {

    public static void main(String[] args) {

        List<Integer> randomList = randomGenerate();
        System.out.println(randomList);
        //выводит список рандомного размера рандомных чисел(можно усложнить вводимыми аргументами пользователем)

        List<String> randomListAnother = anotherRandomGenerate();
        System.out.println(randomListAnother);

    }
}
