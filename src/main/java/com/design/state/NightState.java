package com.design.state;

/**
 * @author xpf
 * @since 2023/6/7
 */
public class NightState implements State {

    private static final NightState singleton = new NightState();

    private NightState() {
    }

    public static NightState getSingleton() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急，使用金库（夜晚）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（夜晚）");
    }

    @Override
    public void doPhone(Context context) {
        context.recording("通话录音（夜晚）");
    }

    @Override
    public String toString() {
        return "[夜晚]";
    }
}
