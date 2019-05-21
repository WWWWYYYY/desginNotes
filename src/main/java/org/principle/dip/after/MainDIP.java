package org.principle.dip.after;

public class MainDIP {

    /**
     * {@link Mother#read(Readings)} 让read方法依赖 Readings 接口，并且让所有的读物实现该接口，这么read方法就可以得到复用了，再新增新的读物时，不需要变更已有的类了，
     * 使得程序尽可能少的修改到其他类，让程序更加稳定
     * @param args
     */
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.read(new Book());
        mother.read(new Newspaper());
    }
}
