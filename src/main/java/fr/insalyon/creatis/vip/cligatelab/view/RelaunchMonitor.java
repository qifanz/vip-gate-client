package fr.insalyon.creatis.vip.cligatelab.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;

import static fr.insalyon.creatis.vip.cligatelab.controller.Main.INTERFACESCALE;
import static fr.insalyon.creatis.vip.cligatelab.controller.Main.SCREENHEIGHT;
import static fr.insalyon.creatis.vip.cligatelab.controller.Main.SCREENWIDTH;

/**
 * Created by qifan on 2017/7/13.
 */
public class RelaunchMonitor {
    private JPanel panel1;
    private JLabel spinner;
    private JLabel InfoLabel;
    private JFrame actualFrame;


    public RelaunchMonitor() {
        actualFrame = new JFrame();
        actualFrame.setVisible(true);
        actualFrame.setBounds(0, 0, (int) (SCREENWIDTH * INTERFACESCALE * 0.2), (int) (SCREENHEIGHT * INTERFACESCALE * 0.2));
        actualFrame.setContentPane(panel1);
        actualFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spinner.setVisible(true);

    }

    public JFrame getActualFrame() {
        return actualFrame;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JLabel getSpinner() {
        return spinner;
    }

    public JLabel getInfoLabel() {
        return InfoLabel;
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        spinner = new JLabel();
        spinner.setIcon(new ImageIcon(getClass().getResource("/Spinner.gif")));
        spinner.setText("Getting information");
        panel1.add(spinner, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        InfoLabel = new JLabel();
        InfoLabel.setText("");
        panel1.add(InfoLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
