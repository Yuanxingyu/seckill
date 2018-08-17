package org.seckill.enums;

import com.sun.tools.javac.code.Attribute;

/**
 * 把数据字典放到枚举当中
 * 常量枚举的开发规范
 * @author stary
 * @date 2018/7/25 下午6:37
 */
public enum  SeckillStateEnum {

    SUCCESS(1,"秒杀成功"),
    END(0,"秒杀结束"),
    REPEAT_KILL(-1,"重复秒杀"),
    INNER_ERROR(-2,"系统异常"),
    DATA_REWRITE(-3,"数据篡改");

    private int state;

    private String stateInfo;

    SeckillStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static SeckillStateEnum stateOf(int index){
        for (SeckillStateEnum state : values()){
            if (state.getState()==index)
                return state;
        }
        return null;
    }
}
