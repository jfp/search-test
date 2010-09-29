package controllers;

import models.Document;
import play.mvc.Controller;

public class Documents extends Controller {
	public static void index () {
		renderText("There are "+Document.count()+" documents");
	}
}
