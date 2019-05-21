package org.principle.lsp.after;

/**
 * 将gun接口再拆分出一个基类 PowerGun，该基类表示肯定能射击的枪的基类，因此{@link Soldier}应该依赖 PowerGun
 */
public class MainLSP {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        RlfGun rlfGun =new RlfGun();
        soldier.killEnemy(rlfGun);

        System.out.println("******使用玩具枪*******");
        ToyGun toyGun =new ToyGun();
//        soldier.killEnemy(toyGun);//不接受ToyGun类型，保证了子类和基类表示的是相同的意思
    }
}
