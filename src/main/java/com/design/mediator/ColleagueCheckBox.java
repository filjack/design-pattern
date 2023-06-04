package com.design.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author xpf
 * @since 2023/6/4
 */
public class ColleagueCheckBox extends Checkbox implements Colleague, ItemListener {

    private Mediator mediator;

    public ColleagueCheckBox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
        super(label, group, state);
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
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
