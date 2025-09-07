package generic.test.ex3;

import generic.animal.Animal;

/**
 *  제너릭은 Animal과 자식들만 들어 올수 있게금 선언 해야 한다.
 *  타입 매개변수 제한
 * */
public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물이름 " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
