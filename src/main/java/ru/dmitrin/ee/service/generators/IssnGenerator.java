package ru.dmitrin.ee.service.generators;

import ru.dmitrin.ee.annotations.EightDigits;
import ru.dmitrin.ee.annotations.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@EightDigits
public class IssnGenerator implements NumberGenerator {

	@Inject
	private Logger logger;

	@Loggable
	public String generateNumber() {
		String issn = "8-" + Math.abs(new Random().nextInt());
		logger.info("Сгенерирован ISBN : " + issn);
		return issn;
	}
}
