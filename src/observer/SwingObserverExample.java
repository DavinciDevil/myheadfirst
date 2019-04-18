/**
 * 版权声明 springcity 版权所有,违者必究
 * <p>
 * <br> Copyright：Copyright (c)  2018
 * <br> Company: springcity
 * <br> Author: lincc(l85520949@163.com)
 * <br> Date：2018-10-09
 * <br> Version： 1.0
 */
package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <br>
 * <b>功能描述:</b>
 * <p/>
 * <pre>
 *  //TODO
 * </pre>
 *
 * @author lincc(l85520949@163.com)
 * @since 1.0
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do id?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER,button);

    }

    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it,you might regret it!");
        }
    }

    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on,do it !");
        }
    }

}
