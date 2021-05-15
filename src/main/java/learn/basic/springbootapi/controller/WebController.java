package learn.basic.springbootapi.controller;

import learn.basic.springbootapi.database.*;
import learn.basic.springbootapi.models.SimpleRequest;
import org.springframework.web.bind.annotation.*;

@RestController //  indicates this class will have Rest End points and the value returned from a function in this class will either be converted to JSON or XML
public class WebController {

    private Database db = new Database(-1);

    @RequestMapping("/") // maps the /library endpoint to LibraryData Function
    public Record[] GetQuotes(){
        //@RequestParam indicates that we will have one Query parameter called name. The default value of name is “Robot”

        // Get list of database library records and  construct a response
        Record[] res = db.getRecords();

        return res;
    }

    @RequestMapping(value="/quote", method = RequestMethod.GET) // maps the /library endpoint to LibraryData Function
    public @ResponseBody Quote GetAQuote(@RequestParam(value="id") int id){
        IntegerKey emptyK = new IntegerKey(id);
        Quote emptyQ = new Quote("No quote to quote", emptyK);

        // Get list of database library records and  construct a response
        Record res = db.find(new IntegerKey(id));

        if (res == null){
            return emptyQ;
        }
        else {
            return (Quote) res;
        }

    }

    @RequestMapping(value="/quote", method = RequestMethod.POST)
    public Quote AddQuote(@RequestBody SimpleRequest inputPayload) {
        Quote q = new Quote(inputPayload.getMessage(), inputPayload.getKey());
        Boolean result = db.insert(q);
        if (result) {
            return q;
        }

        return new Quote("Sorry, Unable to add quote :-( ", inputPayload.getKey());

    }


}
