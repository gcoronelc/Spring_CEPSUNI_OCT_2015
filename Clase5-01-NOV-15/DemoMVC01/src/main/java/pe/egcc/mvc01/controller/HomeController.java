package pe.egcc.mvc01.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.egcc.mvc01.model.EmpleadoBean;
import pe.egcc.mvc01.model.PagoBean;
import pe.egcc.mvc01.service.api.ClienteServiceApi;
import pe.egcc.mvc01.service.api.CuentaServiceApi;
import pe.egcc.mvc01.service.api.EmpleadoServiceApi;
import pe.egcc.mvc01.service.api.MateServiceApi;
import pe.egcc.mvc01.service.api.PagoServiceApi;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MateServiceApi mateService;
	
	@Autowired
  private PagoServiceApi pagoService;
	
	@Autowired
	private CuentaServiceApi cuentaService;
	
	@Autowired
  private EmpleadoServiceApi empleadoService;
  
	@RequestMapping(value = "/", method = RequestMethod.GET)
  public String home() { 
    return "main";
  }
	
	
	@RequestMapping(value = "/logon.htm", method = RequestMethod.GET)
	public String logon() {		
		return "logon";
	}
	
	@RequestMapping(value="cargaPagina.htm", method=RequestMethod.GET)
	public String cargaPagina(HttpServletRequest request) {
	  String pagina = request.getParameter("pagina");
    return (pagina);
  }
	
	@RequestMapping(value="sumar.htm", method=RequestMethod.POST)
	public String sumar(HttpServletRequest request, Model model){
	  // Datos
	  int n1 = Integer.parseInt(request.getParameter("num1"));
	  int n2 = Integer.parseInt(request.getParameter("num2"));
	  // Proceso
	  int suma = mateService.sumar(n1, n2);
	  // Forward
	  model.addAttribute("n1", n1);
	  model.addAttribute("n2", n2);
	  model.addAttribute("suma", suma);
	  return "sumar";
	}
	
	@RequestMapping(value="mcd.htm", method=RequestMethod.POST)
  public String mcdProccess(
      @RequestParam("num1") int n1,
      @RequestParam("num2") int n2,
      Model model){
	  // Proceso
	  int mcd = mateService.calcularMcd(n1,n2);
	  // Forward
	  model.addAttribute("n1", n1);
	  model.addAttribute("n2", n2);
	  model.addAttribute("mcd", mcd);
	  return "mcd";
	}
	
	@RequestMapping(value="pago.htm", method=RequestMethod.POST)
  public String pagoProccess(
      @ModelAttribute PagoBean pagoBean,
      Model model){
	  pagoService.procesar(pagoBean);
	  model.addAttribute("pagoBean", pagoBean);
	  return "pago";
	}
	
	@RequestMapping(value="cantCuentas.htm")
	public String getCantCuentas(Model model){
	  model.addAttribute("cant", cuentaService.obtenerCantCuentas());
	  return "cantCuentas";
	}
	
	@RequestMapping(value="conCuentaResumen.htm", method=RequestMethod.POST)
  public String getCuentaResumen(@RequestParam("cuenta") String cuenta,Model model){
    List<Map<String,Object>> lista;
    lista = cuentaService.obtenerCuentaResumen(cuenta);
	  model.addAttribute("lista", lista);
    return "conCuentaResumen";
  }
	
	@RequestMapping(value="regDeposito.htm", method=RequestMethod.POST)
  public String regDeposito(
      @RequestParam("cuenta") String cuenta,
      @RequestParam("importe") double importe,
      Model model, HttpSession session){
	  try {
	    
	    EmpleadoBean empleadoBean = (EmpleadoBean) session.getAttribute("usuario");
	    
	    cuentaService.registrarDeposito(cuenta, importe, empleadoBean.getUsuario());
	    model.addAttribute("mensaje", "Proceso ejecutado correctamente. Importe: " + importe + ".");
    } catch (Exception e) {
      model.addAttribute("error", "Proceso abortado.");
      e.printStackTrace();
    }
    return "regDeposito";
  }
	
	@RequestMapping(value="logon.htm", method=RequestMethod.POST)
  public String logon(
      @RequestParam("usuario") String usuario,
      @RequestParam("clave") String clave,
      Model model, HttpSession session){
	  String destino;
    try {
      EmpleadoBean empleadoBean =  empleadoService.validar(usuario,clave);
      if(empleadoBean == null){
        throw new RuntimeException("Datos incorrectos.");
      }
      session.setAttribute("usuario", empleadoBean);
      destino = "home";
    } catch (Exception e) {
      model.addAttribute("error", "Proceso abortado. " + e.getMessage());
      destino = "logon";
      e.printStackTrace();
    }
    return destino;
  }
	
	
}
