package _gui.controller;

import _gui.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static final int FRAME_WIDTH = 600;
    public static final int FRAME_Height = 500;

    public int FRAME_X = 300;
    public int FRAME_Y = 200;

    public MainFrame(){
        super("검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        double sw = dimension.getWidth();
        double sh = dimension.getHeight();

        FRAME_X = (int)((0.5)* (sw- FRAME_WIDTH));
        FRAME_Y = (int)((0.5)* (sh- FRAME_Height));

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView,"Center");

        setLocation(FRAME_X, FRAME_Y);
        setSize(FRAME_WIDTH, FRAME_Height);
        setVisible(true);





    }
    public static void main(String[] args) {
        new MainFrame();
    }
}
