package org.principle.isp.after;

public class Searcher {
    public void searchBueatyGirl(BaseBueaty bueaty){
        bueaty.face();
        bueaty.height();
        bueaty.weight();
    }
    public void searchBueatyGirl(Model model){
        model.height();
        model.weight();
    }
}
