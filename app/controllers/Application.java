package controllers;

import models.Account;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
	
	
    public static Result index() {
//        return ok(index.render("Your new application is ready."));
    	return redirect(routes.Application.create());
    }
  
    public static Result create() {
    	Form<Account> accountForm = Form.form(Account.class);
    	return ok(createForm.render(accountForm));
    }
    
    public static Result save() {
    	return TODO;
    }
}
