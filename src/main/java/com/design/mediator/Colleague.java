package com.design.mediator;

/**
 * @author xpf
 * @since 2023/6/4
 */
public interface Colleague {
    /**
     * 设置仲裁者
     *
     * @param mediator 仲裁者
     */
    void setMediator(Mediator mediator);

    /**
     * 接受仲裁者传达的是否启用信息
     *
     * @param enabled 是否启用
     */
    void setColleagueEnabled(boolean enabled);
}
