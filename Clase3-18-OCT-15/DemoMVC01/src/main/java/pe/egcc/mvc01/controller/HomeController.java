package pe.egcc.mvc01.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.egcc.mvc01.model.PagoBean;
import pe.egcc.mvc01.service.api.ClienteServiceApi;
import pe.egcc.mvc01.service.api.CuentaServiceApi;
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
	

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("yo", "GUSTAVO CORONEL" );
		
		return "home";
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
	
	
	
	
}
