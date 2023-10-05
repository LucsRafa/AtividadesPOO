import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Image;

public class Main {
    public static void main(String[] args) {
        // Caminho para o arquivo de imagem (certifique-se de que o caminho do arquivo esteja correto)
        String caminhoImagem = "C:\\Users\\lucas.ladislau\\Desktop\\download.jpg";

        // Carregue a imagem do arquivo
        ImageIcon icon = new ImageIcon(caminhoImagem);

        // Redimensione a imagem para um tamanho desejado (por exemplo, 200x200)
        Image imagemRedimensionada = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

        // Crie um novo ImageIcon com a imagem redimensionada
        ImageIcon iconRedimensionado = new ImageIcon(imagemRedimensionada);

        // Crie um rótulo para exibir a imagem redimensionada
        JLabel label = new JLabel(iconRedimensionado);

        // Crie um JOptionPane personalizado com o rótulo contendo a imagem redimensionada
        JOptionPane.showMessageDialog(null, label, "Konno Dio daa", JOptionPane.PLAIN_MESSAGE);
    }
}

