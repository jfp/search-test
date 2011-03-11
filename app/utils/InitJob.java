package utils;

import models.Document;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class InitJob extends Job {

	@Override
	public void doJob() {
		for (int i = 0; i < 200; i++) {
			Document d = new Document("hello " + i);
			d.create();
		}
	}
}
