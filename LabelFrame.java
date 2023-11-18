import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

//12.6 and 12.7
public class LabelFrame extends JFrame
{
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame()
    {
        super("Testing JLabel");
        setLayout(new FlowLayout());

        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);

        Icon bug = new ImageIcon("C:\\Users\\ACER i3 LAPTOP\\Pictures\\image_for_OOP.jpg");
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }


    public static void main(String[] args)
    {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(260, 180);
        labelFrame.setVisible(true);
    }
}

