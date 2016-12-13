import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutSwing extends JFrame {

public BorderLayoutSwing() {
GridLayout gridLayout = new GridLayout(2,2);
JPanel panel = new JPanel(gridLayout);
JButton [] btn = new JButton[4];
JTextField [] text = new JTextField[4];
for(int j=0; j<text.length; j++){
text[j] = new JTextField("TextField " + (j+1));
panel.add(text[j]);
}
for(int i=0; i<btn.length; i++) {
btn[i] = new JButton("button " + (i+1));
panel.add(btn[i]);
}

add(panel);
setSize(500,200);
setVisible(true);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new BorderLayoutSwing();
}

}