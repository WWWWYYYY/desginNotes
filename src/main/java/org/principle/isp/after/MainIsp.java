package org.principle.isp.after;
import org.principle.isp.before.IBueaty;

/**
 * 当搜索一个美女时，需要衡量 脸蛋、身高、体重
 * 但是搜索一个模特时，只需要关心身高和体重时。就会显得{@link IBueaty}中的接口方法太多，显得很臃肿。
 * 因此需要将{@link IBueaty}接口拆分成两个子接口{@link NiceGirl}和{@link Model}
 *
 * ps:接口隔离抓住接口拆分的思想就好了。
 */
public class MainIsp {
    public static void main(String[] args) {
        Searcher searcher =new Searcher();
        searcher.searchBueatyGirl(new Anglelababy());
        searcher.searchBueatyGirl(new Ladygaga());
    }
}
