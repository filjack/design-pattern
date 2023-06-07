package com.design.state;

/**
 * 负责管理状态，联系警报中心
 *
 * @author xpf
 * @since 2023/6/7
 */
public interface Context {
    /**
     * 设置时间
     *
     * @param hour
     */
    void setClock(int hour);

    /**
     * 改变状态
     *
     * @param state
     */
    void changeState(State state);

    /**
     * 联系警报中心
     *
     * @param msg
     */
    void callSecurityCenter(String msg);

    /**
     * 在警报中心留下记录
     *
     * @param msg
     */
    void recording(String msg);
}
