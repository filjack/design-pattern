package com.design.strategy;

/**
 * @author xpf
 * @since 2023/5/25
 */
public interface Strategy {
    /**
     * 获取下一局手势
     *
     * @return 手势
     */
    Hand nextHand();

    /**
     * 是否学习上一局手势
     *
     * @param win 上局是否获胜
     */
    void study(boolean win);
}
