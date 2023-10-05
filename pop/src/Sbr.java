import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Image;

public class Sbr {
    public static void main(String[] args) {
        // Caminho para os arquivos de imagem (certifique-se de que o caminho do arquivo esteja correto)
        String caminhoImagem1 = "C:\\Users\\lucas.ladislau\\Pictures\\Screenshots\\Captura de tela 2023-08-23 153502.png";
        String caminhoImagem2 = "C:\\Users\\lucas.ladislau\\Desktop\\e8b4d502b8ee0a9ee0cdb6df11a7ca48.png";
        String caminhoImagem3 = "C:\\Users\\lucas.ladislau\\Desktop\\download (1).jpg";
        String caminhoImagem4 = "C:\\Users\\lucas.ladislau\\Desktop\\80f0de7eb7efa6a977aa8b87f4c9c14e.jpg" ;
        String caminhoImagem5 = "C:\\Users\\lucas.ladislau\\Desktop\\Dirty Deeds Done Dirt Cheap.png";
        // Crie instâncias de ImageIcon e JLabel para as imagens
        ImageIcon icon1 = criarImageIcon(caminhoImagem1, 200, 200);
        ImageIcon icon2 = criarImageIcon(caminhoImagem2, 200, 200);
        ImageIcon icon3 = criarImageIcon(caminhoImagem3, 200, 200);
        ImageIcon icon4 = criarImageIcon(caminhoImagem4, 200, 200);
        ImageIcon icon5 = criarImageIcon(caminhoImagem5,200,200);

        // Exiba os pop-ups com as imagens
        exibirPopUp(icon1, "CANTE !!!!!!!");
        exibirPopUp(icon2, "STELLLLLLLLL");
        exibirPopUp(icon3, "BALLLLLLLL");
        exibirPopUp(icon4, "RUNNNNNNNNNN");
        exibirPopUp(icon5," Dirty Deeds Done Dirt Cheap");

    }

    // Método para criar um ImageIcon redimensionado
    private static ImageIcon criarImageIcon(String caminhoImagem, int largura, int altura) {
        ImageIcon icon = new ImageIcon(caminhoImagem);
        Image imagemRedimensionada = icon.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        return new ImageIcon(imagemRedimensionada);
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
