package racing;

import static org.assertj.core.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

	@Test
	@DisplayName("랜덤 상수 생성 테스트")
	void randomTest() {

		int number = new Random().nextInt(10);

		System.out.println(number);
		assertThat(number).isLessThan(10);
	}

	@Test
	@DisplayName("자동차 단일 객체 생성 및 주행 테스트")
	void createCarObjectTest() {

		RacingCar car = new RacingCar();

		for (int i = 0; i < 10; i++) {

			System.out.println("Racing [" + i + "] Location = " + car.racing());
		}
	}
}
