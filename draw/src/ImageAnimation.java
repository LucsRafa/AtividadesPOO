import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ImageAnimation extends JPanel implements ActionListener {
    private Timer timer;
    private int currentFrame = 0;
    private BufferedImage[] frames;
    private int totalFrames = 10; // Total de quadros (imagens) na animação

    public ImageAnimation() {
        loadFrames(); // Carrega as imagens da sequência

        timer = new Timer(100, this); // Ajuste a velocidade da animação aqui
        timer.start();
    }

    private void loadFrames() {
        frames = new BufferedImage[totalFrames];

        for (int i = 0; i < totalFrames; i++) {
            String imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRue7XzYl9235r_u7TULRNzQkg1Hr7eIF1Gzg&usqp=CAU" + i + ".png"; // Substitua pela URL da sua imagem
            try {
                frames[i] = ImageIO.read(new URL(imageUrl));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (currentFrame < totalFrames) {
            BufferedImage currentImage = frames[currentFrame];
            g.drawImage(currentImage, 10, 20, getWidth(), getHeight(), null);
        } else {
            timer.stop(); // Para a animação quando todos os quadros foram exibidos
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint(); // Redesenha o painel com o próximo quadro
        currentFrame++; // Avança para o próximo quadro
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animação de Imagem");
        ImageAnimation imageAnimation = new ImageAnimation();

        frame.add(imageAnimation);
        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
