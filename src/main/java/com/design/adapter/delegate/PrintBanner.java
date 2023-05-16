package com.design.adapter.delegate;

/**
 * @author xpf
 * @since 2023/5/16 22:40
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
