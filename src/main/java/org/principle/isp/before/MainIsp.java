package org.principle.isp.before;

/**
 * 当搜索一个美女时，需要衡量 脸蛋、身高、体重
 * 但是搜索一个模特时，只需要关心身高时。就会显得{@link IBueaty}接口方法太多，显得很臃肿。
 */
public class MainIsp {
    public static void main(String[] args) {
        Searcher searcher =new Searcher();
        searcher.searchBueatyGirl(new Anglelababy());
    }
}
