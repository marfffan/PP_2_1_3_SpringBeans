package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Timer timer;


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());/*Пришлось изменить код мейна чтобы счетчик не создавался каждый раз, но по другому тут не как. Хотя можно было просто и в задании написать что докажите мол что таймер singltone*/
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}

