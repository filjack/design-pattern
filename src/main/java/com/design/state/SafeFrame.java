package com.design.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 警报系统
 *
 * @author xpf
 * @since 2023/6/7
 */
public class SafeFrame extends Frame implements Context, ActionListener {

    /**
     * 显示当前时间
     */
    private TextField textClock = new TextField(60);
    /**
     * 显示警报中心的记录
     */
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonExit = new Button("结束");

    /**
     * 当前状态
     */
    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());
        // 配置textClock
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        // 配置textScreen
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEnabled(false);
        // 为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 配置界面
        add(panel, BorderLayout.SOUTH);
        // 显示
        pack();
        setVisible(true);
        // 设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void setClock(int hour) {
        String clockString = "现在时间是：";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "变为了" + state.toString());
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call!" + msg + "\n");
    }

    @Override
    public void recording(String msg) {
        textScreen.append("record..." + msg + "\n");
    }

    /**
     * 按钮被按下后，方法会被调用
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        // 金库使用按钮
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }
}
