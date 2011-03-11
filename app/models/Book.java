package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.modules.search.Field;
import play.modules.search.Indexed;
import javax.persistence.Lob;

@Entity
@Indexed
public class Book extends Model {

    public Book(String title, String author, String content, int shelfNumber) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.shelfNumber = shelfNumber;
    }

    public Book() {}
    @Field
    public String title;
    @Field
    public String author;
    @Field
    @Lob
    public String content;
    @Field
    public int shelfNumber;
}
