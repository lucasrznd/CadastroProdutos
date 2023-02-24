import javax.swing.*;
import java.awt.*;

public class PrimeiroProjeto extends JFrame {

    private JLabel labelCodigo, labelNome, labelPreco, labelQtd;
    private JTextField textFieldCodigo, textFieldNome, textFieldPreco, textFieldQtd;
    private JButton buttonInserir, buttonBuscar, buttonExcluir, buttonEditar, buttonSair;
    public PrimeiroProjeto() {
        setTitle("Cadastro Produtos");
        setSize(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adiciona os rótulos e campos de texto
        labelCodigo = new JLabel("Código");
        textFieldCodigo = new JTextField(10);

        labelNome = new JLabel("Nome");
        textFieldNome = new JTextField(10);

        labelPreco = new JLabel("Preço");
        textFieldPreco = new JTextField(10);

        labelQtd = new JLabel("Quantidade");
        textFieldQtd = new JTextField(10);

        // Cria os botões
        buttonInserir = new JButton("Inserir");
        buttonBuscar = new JButton("Buscar");
        buttonExcluir = new JButton("Excluir");
        buttonEditar = new JButton("Editar");
        buttonSair = new JButton("Sair");

        // Cria o painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7,2));

        // Adiciona os itens no painel principal
        panel.add(labelCodigo);
        panel.add(textFieldCodigo);
        panel.add(labelNome);
        panel.add(textFieldNome);
        panel.add(labelPreco);
        panel.add(textFieldPreco);
        panel.add(labelQtd);
        panel.add(textFieldQtd);
        panel.add(buttonInserir);
        panel.add(buttonBuscar);
        panel.add(buttonEditar);
        panel.add(buttonExcluir);
        panel.add(buttonSair);

        // Exibe o painel principal na posição
        getContentPane().add(panel, BorderLayout.CENTER);

        // Exibe o JFrame
        setVisible(true);

    }
    public static void main(String[] args) {

        new PrimeiroProjeto();

    }

}