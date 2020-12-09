package racing.model;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

	// 레이싱 차량 저장 리스트
	private final List<RacingCar> racingCars;

	/**
	 * 객체 생성 시 입력받은 수 만큼 자동차 객체를 만들어 주는 생성자
	 * @param racingCarNumber : 유저가 입력한 레이싱 경주 차량 댓수
	 */
	public RacingCars(int racingCarNumber) {

		this.racingCars = initRacingCars(racingCarNumber);
	}

	/**
	 * 유저가 입력한 수만큼 자동차 객체를 생성하는 메서드
	 * @param racingCarNumber : 유저가 입력한 레이싱 경주 차량 댓수
	 * @return : 생성한 경주 차량 리스트 리턴
	 */
	private List<RacingCar> initRacingCars(int racingCarNumber) {

		List<RacingCar> initRacingCars = new ArrayList<>();
		for (int i = 0; i < racingCarNumber; i++) {

			initRacingCars.add(new RacingCar());
		}

		return initRacingCars;
	}

	/**
	 * 자동차 객체 리스트에 있는 모든 차량 레이스 시작
	 */
	public void start() {

		// 가독성이 안좋아서 수정
		// this.racingCars.forEach((racingCar -> racingCar.move(()->racingCar.checkCar().isMove())));
		for (RacingCar car : this.racingCars) {

			car.move(() -> car.axel().isMove());
		}
	}

	/**
	 * 거리를 출력하기 위해 자동차 객체 리턴
	 * @return : 자동차 객체 리스트 리턴
	 */
	public List<RacingCar> getRacingCars() {

		return this.racingCars;
	}
}
