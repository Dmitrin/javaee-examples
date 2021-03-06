package ru.dmitrin.ee.service.generators;

import ru.dmitrin.ee.annotations.Loggable;
import ru.dmitrin.ee.annotations.ThirteenDigits;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {

	@Inject
	private Logger logger;

	@Loggable
	public String generateNumber() {
		String mock = "MOCK-" + Math.abs(new Random().nextInt());
		logger.info("Сгенерирован Mock : " + mock);
		return mock;
	}
}
