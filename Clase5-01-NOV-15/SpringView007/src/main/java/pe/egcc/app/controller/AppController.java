package pe.egcc.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pe.egcc.app.model.ProductoBean;
import pe.egcc.app.service.ProductoService;

/**
 * 
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 *
 */
@Controller
public class AppController {

  @Autowired
	protected ProductoService productoService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<ProductoBean> listaProductos = productoService.getListaProductos();
		model.addAttribute("listaProductos", listaProductos);
		return "listaProductos";
	}

	@RequestMapping(value = "/exportExcel", method = RequestMethod.GET)
	public ModelAndView getExcel() {
		List<ProductoBean> listaProductos = productoService.getListaProductos();
		return new ModelAndView("listaProductosExcelView", "listaProductos", listaProductos);
	}
	
	@RequestMapping(value = "/exportExcel2", method = RequestMethod.GET,
	    produces="application/vnd.ms-excel")
	@ResponseBody
  public String getExcel2(HttpServletResponse response) {
	  response.setHeader("Content-disposition", "attachment; filename=productos.xls");
    List<ProductoBean> listaProductos = productoService.getListaProductos();
    String data = "CODIGO\tNOMBRE\tPRECIO\tSTOCK\tVALORACION\n";
    int cont = 1;
    for(ProductoBean bean: listaProductos){
      cont++;
      data += bean.getId() + "\t";
      data += bean.getNombre() + "\t";
      data += bean.getPrecio() + "\t";
      data += bean.getStock() + "\t";
      data += "+C" + cont + "*D" + cont + "\n";
    }
    return data;
  }

}