package calculator;

public class Calculator {

	/**
	 * 문자열 계산기- 계산이 끝나면, 재시작 여부 확인
	 * @param userInputStr: 유저 입력 문자열
	 */
	public static int start(String userInputStr) throws IllegalArgumentException {

		CalculatorVaild.validCalculatorString(userInputStr);
		
		String[] userInputArr = userInputStr.split(" ");

		int result = Integer.parseInt(userInputArr[0]);

		// 유저가 입력한 계산식에서 연산자와 수 2개씩 끊어서 계산하는 반복문
		for (int i = 1; i < userInputArr.length; i = i + 2) {

			// 계산
			// 가독성 고민
			// result = CalculatorType.getOperator(userInputArr[i]).calculate(result, Integer.parseInt(userInputArr[i + 1]));
			result = CalculatorType.getCalculateResult(userInputArr[i], result, Integer.parseInt(userInputArr[i + 1]));
		}

		// 결과 리턴
		return result;
	}
}
