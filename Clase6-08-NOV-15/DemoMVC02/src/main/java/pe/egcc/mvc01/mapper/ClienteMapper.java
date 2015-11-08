package pe.egcc.mvc01.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.egcc.mvc01.model.ClienteBean;

public class ClienteMapper implements RowMapper<ClienteBean>{

  @Override
  public ClienteBean mapRow(ResultSet rs, int rowNum) throws SQLException {
    ClienteBean clienteBean = new ClienteBean();
    clienteBean.setCodigo(rs.getString("chr_cliecodigo"));
    clienteBean.setPaterno(rs.getString("vch_cliepaterno"));
    clienteBean.setMaterno(rs.getString("vch_cliematerno"));
    clienteBean.setNombre(rs.getString("vch_clienombre"));
    clienteBean.setDni(rs.getString("chr_cliedni"));
    clienteBean.setCiudad(rs.getString("vch_clieciudad"));
    clienteBean.setDireccion(rs.getString("vch_cliedireccion"));
    clienteBean.setTelefono(rs.getString("vch_clietelefono"));
    clienteBean.setEmail(rs.getString("vch_clieemail"));
    return clienteBean;
  }
  
    
}
 