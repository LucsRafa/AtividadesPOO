import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Image;

public class Declaracao {
    public static void main(String[] args) {
        // Pergunta inicial
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Você é a Maria Hélen?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            // Caminho para os arquivos de imagem (certifique-se de que o caminho do arquivo esteja correto)
            String caminhoImagem1 = "C:\\Users\\lucas.ladislau\\Downloads\\WhatsApp Image 2023-08-28 at 10.53.56.jpeg";
            String caminhoImagem2 = "C:\\Users\\lucas.ladislau\\Downloads\\WhatsApp Image 2023-08-28 at 10.54.51.jpeg";
            String caminhoImagem3 = "C:\\Users\\lucas.ladislau\\Downloads\\WhatsApp Image 2023-08-28 at 10.57.01.jpeg";
            String caminhoImagem4 = "C:\\Users\\lucas.ladislau\\Downloads\\WhatsApp Image 2023-08-28 at 10.53.45.jpeg";
            String caminhoImagem5 = "C:\\Users\\lucas.ladislau\\Downloads\\WhatsApp Image 2023-08-28 at 10.54.52.jpeg";

            // Crie instâncias de ImageIcon e JLabel para as imagens
            ImageIcon icon1 = criarImageIcon(caminhoImagem1, 200, 200);
            ImageIcon icon2 = criarImageIcon(caminhoImagem2, 200, 200);
            ImageIcon icon3 = criarImageIcon(caminhoImagem3, 200, 200);
            ImageIcon icon4 = criarImageIcon(caminhoImagem4, 200, 200);
            ImageIcon icon5 = criarImageIcon(caminhoImagem5, 200, 200);

            // Exiba os pop-ups com as imagens
            exibirPopUp(icon1, "EU TE AMO");
            exibirPopUp(icon2, "HOJE E SEMPRE");
            exibirPopUp(icon3, "TO MORRENDO DE SAUDADES");
            exibirPopUp(icon4, "TE AMO DEMAIS GAROTAAAAAA");
            exibirPopUp(icon5, "❤️❤️❤️❤️❤️❤️❤️❤️❤️");
        } else {
            // O usuário escolheu "Não" ou fechou o pop-up de confirmação
            // Adicione aqui o que deseja fazer nesse caso
            JOptionPane.showMessageDialog(
                    null,
                    "Você não é o meu amor ",
                    "SE MANDA",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
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

