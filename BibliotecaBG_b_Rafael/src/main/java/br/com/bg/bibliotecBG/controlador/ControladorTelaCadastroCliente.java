
package br.com.bg.bibliotecBG.controlador;

import br.com.bg.bibliotecBG.dominio.Usuario;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 2binfo
 */
public class ControladorTelaCadastroCliente {
    private JTextField jtfNome;
    private JTextField jtfEmail;
    private JTextField jtfCPF;
    private JTextField jtfRG;
    private JTextField jtfIdade;
    private JTextField jtfSexo;
    
    Usuario usuario;

    public ControladorTelaCadastroCliente(JTextField jtfNome, JTextField jtfEmail, JTextField jtfCPF, JTextField jtfRG, JTextField jtfIdade, JTextField jtfSexo, Usuario usuario) {
        this.jtfNome = jtfNome;
        this.jtfEmail = jtfEmail;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jtfIdade = jtfIdade;
        this.jtfSexo = jtfSexo;
        this.usuario = usuario;
    }
    
    private void preencherUsuario(){
        usuario = new Usuario();
        
        usuario.setNome(jtfNome.getText());
        usuario.seteMail(jtfEmail.getText());
        usuario.setCpf(jtfCPF.getText());
        usuario.setRg(jtfRG.getText());
        usuario.setIdade(Integer.parseInt(jtfIdade.getText()));
        usuario.setSexo(jtfSexo.getText());
    }
    
    private void salvarUsuario(){
        preencherUsuario();
        JOptionPane.showMessageDialog(null, "Usuario - "+usuario.toString());
    }
    
    
    
    
}
