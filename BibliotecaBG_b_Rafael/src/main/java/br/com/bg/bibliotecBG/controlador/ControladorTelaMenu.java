package br.com.bg.bibliotecBG.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Rafael Rios
 */
public class ControladorTelaMenu {
    private JLabel jlaUsuarioLogado;
    private JLabel jlaDiaSemana;
    private JLabel jlaData;
    private JLabel jlaHora;
    private JLabel jlaLogoEmpresa;
    private Timer timer;

    public ControladorTelaMenu(JLabel jlaDiaSemana, JLabel jlaData, JLabel jlaHora) {
        //super(telaMenu, jdpTelaFilho);
        this.jlaDiaSemana = jlaDiaSemana;
        this.jlaData = jlaData;
        this.jlaHora = jlaHora;
        atualizacaoTimer();
    }
    
    private void atualizaHora(){
        jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }
    
    private void atualizaData(){
        //Data
        jlaData.setText(DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
        //Dia da semana
        jlaDiaSemana.setText(new SimpleDateFormat("EEEE").format(new Date()));
        //Hora
        jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void atualizacaoTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizaHora();
            }
        });
        timer.start();
        atualizaData();
    }
    
    
}
