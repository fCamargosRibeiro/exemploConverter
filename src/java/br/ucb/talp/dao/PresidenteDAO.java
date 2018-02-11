/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.talp.dao;

import br.ucb.talp.beans.Presidente;
import java.util.List;

/**
 *
 * @author uc11031397
 */
public interface PresidenteDAO {
      public List<Presidente> findAll();
      public Presidente findByCpf(String cpf);
}
