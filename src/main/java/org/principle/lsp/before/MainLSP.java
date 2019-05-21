package org.principle.lsp.before;

/**
 * ToyGun 和 Gun 想要表达的本意不一样，因此出现了问题，发现士兵在使用玩具枪的时，玩具枪不能射击，居然还能打死敌人。
 * 由于是继承，会打破封装性，需要留意子类和基类表达的意思是否一致。如果不一致就不能让这个类继承基类
 */
public class MainLSP {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        RlfGun rlfGun =new RlfGun();
        soldier.killEnemy(rlfGun);

        System.out.println("******使用玩具枪*******");
        ToyGun toyGun =new ToyGun();
        soldier.killEnemy(toyGun);
    }
}
