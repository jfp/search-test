package controllers;

import java.util.List;

import models.Document;
import play.modules.search.Search;
import play.modules.search.Query;
import play.mvc.Controller;

public class Documents extends Controller {
	public static void index () {
		renderText("There are "+Document.count()+" documents");
	}
	public static void search () {
		Query q = Search.search("text:he", Document.class);
		List<Document> docs = q.fetch();
		renderText("Query  "+Document.count()+" documents");
	}
}
