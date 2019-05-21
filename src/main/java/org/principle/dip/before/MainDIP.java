package org.principle.dip.before;

public class MainDIP {

    /**
     * {@link Mother#read(Book)}直接依赖具体的读物，导致如果mother读报纸时，或者电子书时不能复用read方法。
     * @param args
     */
    public static void main(String[] args) {
        new Mother().read(new Book());
    }
}
