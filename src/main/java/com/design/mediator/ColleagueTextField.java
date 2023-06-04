package com.design.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @author xpf
 * @since 2023/6/4
 */
public class ColleagueTextField extends TextField implements Colleague, TextListener {

    private Mediator mediator;

    public ColleagueTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.WHITE : Color.LIGHT_GRAY);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
