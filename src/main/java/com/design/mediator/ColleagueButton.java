package com.design.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author xpf
 * @since 2023/6/4
 */
public class ColleagueButton extends Button implements Colleague, ActionListener {

    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mediator.colleagueChanged();
    }
}
