package jaimy.monsuur.Chemistry.controller;
import jaimy.monsuur.Chemistry.model.element;
import jaimy.monsuur.Chemistry.service.elementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import jaimy.monsuur.Chemistry.service.elementService;

@Controller
@RequestMapping("elements")
public class elementController {
    //elemenyService object

    @Autowired
    private elementService elementService;

    //get all elements
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllElements() {
        return ResponseEntity.status(200).body(elementService.getAllElements());
    }

    //get element by AtomicNumber
    @RequestMapping(value = "/atomicNumber/{atomicNumber}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getElementByAtomicNumber(@PathVariable("atomicNumber") int atomicNumber) {
        return ResponseEntity.status(200).body(elementService.getElementByAtomicNumber(atomicNumber));
    }

    //get element by Symbol
    @RequestMapping(value = "/symbol/{symbol}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getElementBySymbol(@PathVariable("symbol") String symbol) {
        return ResponseEntity.status(200).body(elementService.getElementBySymbol(symbol));
    }

    //get element by Name
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getElementByName(@PathVariable("name") String name) {
        return ResponseEntity.status(200).body(elementService.getElementByName(name));
    }

    //get element by Group
    @RequestMapping(value = "/group/{group}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getElementByGroup(@PathVariable("group") String group) {
        return ResponseEntity.status(200).body(elementService.getElementByGroup(group));
    }

    //get element by AtomicWeight
    @RequestMapping(value = "/atomicWeight/{atomicWeight}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getElementByAtomicWeight(@PathVariable("atomicWeight") double atomicWeight) {
        return ResponseEntity.status(200).body(elementService.getElementByAtomicWeight(atomicWeight));
    }
    //delete element by AtomicNumber
    @RequestMapping(value = "/delete/{atomicNumber}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> deleteElementByAtomicNumber(@PathVariable("atomicNumber") int atomicNumber) {
        return ResponseEntity.status(200).body(elementService.deleteElement(atomicNumber));
    }

    //update element
    @RequestMapping(value = "/update/{atomicNumber}", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> updateElement(@RequestBody element e, @PathVariable("atomicNumber") int atomicNumber) {
        element result = elementService.updateElement(e, atomicNumber);
        return ResponseEntity.status(201).body(result);
    }

    //add element
    @RequestMapping(value = "/add", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addElement(@RequestBody element e) {
        element result = elementService.addElement(e);
        return ResponseEntity.status(201).body(result);
    }
}
