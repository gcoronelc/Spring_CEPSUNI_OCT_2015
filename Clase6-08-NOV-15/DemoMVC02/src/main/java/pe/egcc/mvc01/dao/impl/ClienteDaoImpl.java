package pe.egcc.mvc01.dao.impl;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import pe.egcc.mvc01.dao.espec.ClienteDaoEspec;
import pe.egcc.mvc01.mapper.ClienteMapper;
import pe.egcc.mvc01.model.ClienteBean;

@Repository
public class ClienteDaoImpl extends AbstractDaoSupport implements ClienteDaoEspec {

  @Override
  public String obtenerNombre(String codigo) {
    String nombre;
    try {
      String sql = "select vch_clienombre from cliente where chr_cliecodigo = ?";
      Object[] args = { codigo };
      nombre = jdbcTemplate.queryForObject(sql, args, String.class);
    } catch (EmptyResultDataAccessException e) {
      nombre = null;
    }
    return nombre;
  }

  @Override
  public ClienteBean obtenerCliente(String codigo) {
    ClienteBean clienteBean;
    try{
      String sql = "select chr_cliecodigo, vch_cliepaterno, vch_cliematerno, "
          + "vch_clienombre, chr_cliedni, vch_clieciudad, vch_cliedireccion, " 
          + "vch_clietelefono, vch_clieemail "
          + "from cliente where chr_cliecodigo = ?";
      Object[] args = { codigo };
      clienteBean = jdbcTemplate.queryForObject(sql, args, new ClienteMapper());
    } catch(EmptyResultDataAccessException e){
      clienteBean = null;
    }
    return clienteBean;
  }

  @Override
  public List<ClienteBean> obtenerClientes(String nombre) {
    List<ClienteBean> lista;
    String sql = "select chr_cliecodigo, vch_cliepaterno, vch_cliematerno, "
        + "vch_clienombre, chr_cliedni, vch_clieciudad, vch_cliedireccion, " 
        + "vch_clietelefono, vch_clieemail "
        + "from cliente "
        + "where vch_cliepaterno like ? "
        + "or vch_cliematerno like ? "
        + "or vch_clienombre like ? ";
    nombre += "%";
    Object[] args = { nombre, nombre, nombre };
    lista = jdbcTemplate.query(sql, args, new ClienteMapper());
    return lista;
  }

 
  
  
  
  
  
}
