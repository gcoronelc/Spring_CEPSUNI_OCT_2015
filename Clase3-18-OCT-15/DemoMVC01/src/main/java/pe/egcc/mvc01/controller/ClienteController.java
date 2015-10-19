package pe.egcc.mvc01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.egcc.mvc01.model.ClienteBean;
import pe.egcc.mvc01.service.api.ClienteServiceApi;

@Controller
public class ClienteController {

  @Autowired
  private ClienteServiceApi clienteService;
  
  @RequestMapping(value="nombreCliente.htm", method=RequestMethod.POST)
  public String getNombreCliente( @RequestParam("codigo") String codigo, Model model){
    // Proceso
    String nombre = clienteService.traerNombre(codigo);
    // Reporte
    model.addAttribute("nombre", nombre);
    return "conNombreCliente";
  }
  
  @RequestMapping(value="traerCliente.htm", method=RequestMethod.POST)
  public String traerCliente( @RequestParam("codigo") String codigo, Model model){
    // Proceso
    ClienteBean clienteBean = clienteService.traerCliente(codigo);
    // Reporte
    model.addAttribute("clienteBean", clienteBean);
    return "conCliente";
  }
  
}
