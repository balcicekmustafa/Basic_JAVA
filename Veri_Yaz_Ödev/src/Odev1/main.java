package Odev1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class main {
    private Queue kuyruk = new Queue();
    private JTextArea textArea = new JTextArea();
    private JButton startButton = new JButton("İşlemleri Başlat");
    private JButton addButton = new JButton("Sıraya kişi ekle");

    public main() {
        for (int i = 1; i <= 10; i++) {
            kuyruk.enqueue(i);
        }

        JFrame frame = new JFrame("ATM Kuyrugu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false); 
                processQueue();
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kuyruk.enqueue(kuyruk.size() + 1);
                textArea.append((kuyruk.size()) + ". kişi sıraya eklendi.\n");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(startButton);

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void processQueue() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!kuyruk.isEmpty()) {
                    try {
                        Thread.sleep(10000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int siradakiKisi = (int) kuyruk.dequeue();
                    textArea.append(siradakiKisi + ". kişi işlemini tamamladı.\n");
                }
                textArea.append("Tüm müşteriler işlemlerini tamamladı.");
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main();
            }
        });
    }
}