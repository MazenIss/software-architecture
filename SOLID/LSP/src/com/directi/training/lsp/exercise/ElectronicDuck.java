package com.directi.training.lsp.exercise;

public class ElectronicDuck extends Duck {
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Turning switch on");
            this._on = true;
            System.out.println("Electronic duck quack...");

        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Turning switch on");
            this._on = true;
            System.out.println("Electronic duck swim...");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}
