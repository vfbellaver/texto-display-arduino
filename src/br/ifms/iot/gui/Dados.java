/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.iot.gui;

import br.ifms.iot.util.RXTXUtil;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;

/**
 *
 * @author Vagner Bellaver
 */
public class Dados {
    RXTXUtil rxtx = new RXTXUtil();
    public void EnviarDados(String origem) throws IOException, PortInUseException, UnsupportedCommOperationException{
     
        rxtx.conectar(rxtx.listarPortasSeriais().get(0));
        rxtx.enviarDados(origem);
        rxtx.desconectar();
    }
    
  
}
