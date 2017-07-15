package com.course.netec;

import View.FormCredit;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame rootFrame = new JFrame("Agregar Credito");
        rootFrame.setSize(500,500);
        rootFrame.setContentPane(new FormCredit().panel1);
        rootFrame.setVisible(true);

    }
}
