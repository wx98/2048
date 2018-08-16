package com.game.main;

import com.game.view.Window;

import javax.swing.*;
import java.awt.*;


/**
 * 实例化窗口启动
 *
 * @author 洛玖
 * @version 1.0
 * @date 2018/07/25
 */

public class GameMain {
    public static void main(String[] args) {
        Window win = new Window();
        win.initView();
        win.setTitle("2048[来自王某人]");
        win.getContentPane()
        	.setPreferredSize(new Dimension(400, 500));
        //JFrame直接调用setBackground设置背景色不生效
        win.getContentPane()
        	.setBackground(new Color(0xfaf8ef));
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false); //去掉最大化按钮
        win.pack();    //获得最佳大小
        win.setVisible(true);
    }
}
