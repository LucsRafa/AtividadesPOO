import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.net.URL;

public class Confirma {
    public static void main(String[] args) {
        // Pergunta inicial
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Você é o Samuel ?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            // URLs das imagens da web
            String urlImagem1 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSz8cTCStspuinSKamUHT-hbsUAZ8w70gmkqQ&usqp=CAU";
            String urlImagem2 = "https://i.pinimg.com/originals/e8/b4/d5/e8b4d502b8ee0a9ee0cdb6df11a7ca48.png";
            String urlImagem3 = "https://pbs.twimg.com/media/EPMQs_vUwAARzAu.jpg";
            String urlImagem4 = "https://i.pinimg.com/236x/7c/20/50/7c205066e8fd812860702c5908440676.jpg";
            String urlImagem5 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIPihb2ihFwvkYHXMDvsUyRzmFueb8gP16N0X8XFBrmHDDR9uO7uzmKmuTWSauQGfddqY&usqp=CAU";

            // Crie instâncias de ImageIcon e JLabel para as imagens
            ImageIcon icon1 = criarImageIcon(urlImagem1, 200, 200);
            ImageIcon icon2 = criarImageIcon(urlImagem2, 200, 200);
            ImageIcon icon3 = criarImageIcon(urlImagem3, 200, 200);
            ImageIcon icon4 = criarImageIcon(urlImagem4, 200, 200);
            ImageIcon icon5 = criarImageIcon(urlImagem5, 200, 200);

            // Exiba os pop-ups com as imagens
            exibirPopUp(icon1, "CANTE !!!!!!!");
            exibirPopUp(icon2, "STELLLLLLLLL");
            exibirPopUp(icon3, "BALLLLLLLL");
            exibirPopUp(icon4, "RUNNNNNNNNNN");
            exibirPopUp(icon5, "Dirty Deeds Done Dirt Cheap");
        } else {
            // O usuário escolheu "Não" ou fechou o pop-up de confirmação
            // Adicione aqui o que deseja fazer nesse caso
            JOptionPane.showMessageDialog(
                    null,
                    "Se manda",
                    "Adeus",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    // Método para criar um ImageIcon redimensionado a partir de uma URL
    private static ImageIcon criarImageIcon(String url, int largura, int altura) {
        try {
            ImageIcon icon = new ImageIcon(new URL(url));
            Image imagemRedimensionada = icon.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
            return new ImageIcon(imagemRedimensionada);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para exibir um pop-up com uma imagem e título
    private static void exibirPopUp(ImageIcon icon, String titulo) {
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(
                null,
                label,
                titulo,
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
