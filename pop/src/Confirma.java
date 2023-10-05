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
                "",
                "",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            // URLs das imagens da web
            String urlImagem1 = "";
            String urlImagem2 = "";
            String urlImagem3 = "";
            String urlImagem4 = "";
            String urlImagem5 = "";

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
