package pe.egcc.mvc01.dao.impl;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import pe.egcc.mvc01.dao.espec.EmpleadoDaoEspec;
import pe.egcc.mvc01.mapper.EmpleadoMapper;
import pe.egcc.mvc01.model.EmpleadoBean;

@Repository
public class EmpleadoDaoImpl extends AbstractDaoSupport implements
    EmpleadoDaoEspec {

  @Override
  public EmpleadoBean validar(String usuario, String clave) {
    String sql = "select CHR_EMPLCODIGO,VCH_EMPLPATERNO,"
        + "VCH_EMPLMATERNO,VCH_EMPLNOMBRE,VCH_EMPLCIUDAD,"
        + "VCH_EMPLDIRECCION,VCH_EMPLUSUARIO "
        + "from empleado "
        + "where VCH_EMPLUSUARIO = ? "
        + "and VCH_EMPLCLAVE = ?";
    Object[] args = {usuario,clave};
    EmpleadoBean empleadoBean;
    try {
      empleadoBean = jdbcTemplate.queryForObject(sql, args, new EmpleadoMapper());
    } catch (EmptyResultDataAccessException e) {
      empleadoBean = null;
    }
    return empleadoBean;
  }

}
