package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import play.modules.search.Field;
import play.modules.search.Indexed;

@Entity
@Indexed
public class Document extends Model {

	@Field
	public String text;

	public Document(String text) {
		this.text = text;
	}
}