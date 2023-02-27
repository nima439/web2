package edu.fra.uas.conversation.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@RestController
//@RequestMapping(value = "/barChart")
@Controller
public class GraphController {
	private static final Logger log = LoggerFactory.getLogger(ConversationController.class);

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		log.debug("/Dashboard --> start ");
		return "dashboard";
	}

	@RequestMapping("/dashboard2")
	public String dashboard2(Model model) {
		log.debug("/test dash --> start ");
		return "dashboard2";
	}

	@RequestMapping("/barChart")
	public String barChart(Model model) {
		log.debug("/bar Chart --> start ");
		return "barChart";
	}

	@RequestMapping("/barChartName")
	public String barChartName(Model model) {
		log.debug("/barChartName--> start ");
		return "barChartName";
	}

	@RequestMapping("/pieChart")
	public String pieChart(Model model) {
		log.debug("/pieChart--> start ");
		return "pieChart";
	}

	@RequestMapping("/basicLine")
	public String basicLine(Model model) {
		log.debug("/basicLine --> start ");
		model.addAttribute("pass", 90);
		model.addAttribute("fail", 10);
		return "basicLine";
	}

	@RequestMapping("/lineChart")
	public String lineChart(Model model) {
		log.debug("/Line Chart --> start ");
		return "lineChart";
	}

	@RequestMapping("/areaChart")
	public String areaChart(Model model) {
		log.debug("/area Chart --> start ");
		return "areaChart";
	}

	@RequestMapping("/scatterChart")
	public String scatterChart(Model model) {
		log.debug("/scatter Chart --> start ");
		return "scatterChart";
	}

	@RequestMapping("/table_form")
	public String table_form(Model model) {
		log.debug("/Table  --> start ");
		return "table_form";
	}

	@RequestMapping("/stockChart")
	public String stockChart(Model model) {
		log.debug("/stockChart  --> start ");
		return "stockChart";
	}

	@RequestMapping("/candlestickChart")
	public String candlestickChart(Model model) {
		log.debug("/candlestickChart  --> start ");
		return "candlestickChart";
	}

}
/*
 * package edu.fra.uas.conversation.controller;
 * 
 * import java.util.LinkedHashMap; import java.util.Map;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import edu.fra.uas.config.DB;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory;
 * 
 * //@RestController //@RequestMapping(value = "/barChart")
 * 
 * @Controller public class GraphController { private static final Logger log =
 * LoggerFactory.getLogger(ConversationController.class); private DB data = new
 * DB();
 * 
 * @RequestMapping(value = {"/barChart" }, method = RequestMethod.GET ) // Er
 * Matcht mit dem anderen barCHart vom HTML index also ruft er das dann auf
 * public String barChart (Model model) { Map<String, Integer> data = new
 * LinkedHashMap<String, Integer>(); log.debug("/barChart --> SIUUU " );
 * data.put("Ashish", 30); data.put("Ankit", 50); data.put("Gurpreet", 70);
 * data.put("Mohit", 90); data.put("Manish", 25); data.put("Aco", 120);
 * data.put("Nima", 140); model.addAttribute("keySet", data.keySet());
 * model.addAttribute("values", data.values()); return "barChart"; }
 * 
 * @RequestMapping ("/pieChart") public String pieChart(Model model) {
 * log.debug("/pieChart --> SIUUU " ); model.addAttribute("pass",90);
 * model.addAttribute("fail",10); return "pieChart"; }
 * /*@GetMapping("/pieChart") public String showGraphForm(Model model) { //
 * Initialisiere das Model mit leeren Werten f端r das Kreisdiagramm
 * model.addAttribute("keySet", data.getAll().keySet());
 * model.addAttribute("values", data.getAll().values());
 * 
 * log.debug("/piechart --> get " + data.getAll().size() ); return "pieChart"; }
 * 
 * @PostMapping
 * 
 * @RequestMapping("/pieChart") public String
 * updateGraph(@RequestParam("value1") String name,
 * 
 * @RequestParam("value2") int value, Model model) { // Aktualisiere das Model
 * mit den neuen Werten f端r das Kreisdiagramm log.debug("/pieChart --> post " );
 * data.inputValue(name, value); return "redirect:/pieChart"; }
 * 
 * 
 * }
 * 
 * /* import org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * @Controller public class GraphController {
 * 
 * @GetMapping("/barChart") public String showGraphForm(Model model) { //
 * Initialisiere das Model mit leeren Werten f端r das Kreisdiagramm
 * model.addAttribute("value1", 0); model.addAttribute("value2", 0);
 * model.addAttribute("value3", 0); return "graph_form"; }
 * 
 * @PostMapping("/barChart") public String updateGraph(@RequestParam("value1")
 * int value1,
 * 
 * @RequestParam("value2") int value2,
 * 
 * @RequestParam("value3") int value3, Model model) { // Aktualisiere das Model
 * mit den neuen Werten f端r das Kreisdiagramm model.addAttribute("value1",
 * value1); model.addAttribute("value2", value2); model.addAttribute("value3",
 * value3); return "barChart"; } }
 */
