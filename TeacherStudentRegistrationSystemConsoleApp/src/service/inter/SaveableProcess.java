package service.inter;

import bean.Config;

public interface SaveableProcess extends Process {
    public default void process(){
        processLogic();
        Config.save();
    }
}
