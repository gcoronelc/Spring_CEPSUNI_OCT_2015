package pe.egcc.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.egcc.app.model.EstudianteBean;
import pe.egcc.app.model.VentaBean;
import pe.egcc.app.service.EstudianteService;
import pe.egcc.app.service.VentaService;
import pe.egcc.app.validator.EstudianteValidator;
import pe.egcc.app.validator.VentaValidator;

/**
 * 
 * 
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 *
 */
@Controller
public class HomeController {

  private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

  @Autowired
  private EstudianteService estudianteService;
  
  @Autowired
  private VentaService ventaService;

  /**
   * Registramos el validador
   * 
   * @param binder
   */
  @InitBinder("estudianteBean")
  protected void initEstudianteBinder(WebDataBinder binder) {
    binder.setValidator(new EstudianteValidator());
   }

  @InitBinder("ventaBean")
  protected void initVentaBinder(WebDataBinder binder) {
    binder.setValidator(new VentaValidator());
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home() {

    logger.info("Cargando la página principal.");

    return "home";

  }

  @RequestMapping(value = "/formulario.htm", method = RequestMethod.GET)
  public ModelAndView formulario() {

    logger.info("Cargando la página principal.");

    ModelAndView view = new ModelAndView("notas/formulario", "estudianteBean", new EstudianteBean());

    return view;

  }

  @RequestMapping(value = "/doProcesarEstudiante.htm", method = RequestMethod.POST)
  public String doProcesarEstudiante(Model model, @Validated EstudianteBean estudianteBean, BindingResult result) {

    logger.info("Inicio de proceso.");

    // si hay errores volvemos a la vista del formulario
    logger.info("Se verifica la validación.");
    if (result.hasErrors()) {
      return "notas/formulario";
    }

    // Procediendo a calcular el promedio
    logger.info("Calculando el promedio.");
    estudianteService.calcPromedio(estudianteBean);

    // Preparando la salida
    logger.info("Creando el objeto ModelAndView.");
    model.addAttribute("estudianteBean", estudianteBean);

    // Mostrando la vista y fin del proceso
    logger.info("Fin de proceso.");
    return "notas/resultado";

  }

  @RequestMapping(value = "/otroError.htm", method = RequestMethod.GET)
  public String otroError() throws Exception {

    logger.info("Generando una excepción.");
    throw new Exception("Error de prueba.");

  }

  // -----------------------------------------------
  // VENTA
  // -----------------------------------------------

  // Formulario
  @RequestMapping(value = "/ventaFormulario.htm", method = RequestMethod.GET)
  public ModelAndView ventaFormulario() {

    logger.info("Cargando el formulario de venta.");

    ModelAndView view = new ModelAndView("venta/formulario", "ventaBean", new VentaBean());

    return view;

  }
  
  @RequestMapping(value = "/doProcesarVenta.htm", method = RequestMethod.POST)
  public String doProcesarVenta(Model model, @Validated VentaBean ventaBean, BindingResult result) {

    logger.info("Inicio de proceso.");

    // si hay errores volvemos a la vista del formulario
    logger.info("Se verifica la validación.");
    if (result.hasErrors()) {
      return "venta/formulario";
    }

    // Procediendo a calcular el promedio
    logger.info("Calculando la venta.");
    ventaService.procesar(ventaBean);

    // Preparando la salida
    logger.info("Creando el objeto ModelAndView.");
    model.addAttribute("ventaBean", ventaBean);

    // Mostrando la vista y fin del proceso
    logger.info("Fin de proceso.");
    return "venta/resultado";

  }
  
  
  
  
  

}
