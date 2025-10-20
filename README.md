# java-calculator-precourse

## 문자열 덧셈 계산기
입력한 문자열에서 숫자를 추출하여 더하는 계산기를 구현한다.

## 구현 기능 목록

- 계산기 구분자 관리 기능
   - 새로운 구분자를 추가
   - 문자가 구분자에 포함되는지 확인
- 문자열을 기본 구분자(쉼표, 콜론)를 기준으로 분리하여 숫자를 추출
- 문자열을 입력받아 숫자를 추출 및 더한 값을 반환
- 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 확인하고 추가
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료
   - 구분자 사이에 존재하는 문자가 숫자가 아닌 경우 예외를 발생
   - 구분자로 지정되지 않은 문자가 포함된 경우 예외를 발생

## 패키지 구조

```
calculator/
├── Application.java           # 메인 진입점
├── manager/
│   └── CalculatorManager.java # 애플리케이션 흐름 제어
├── domain/
│   ├── Calculator.java        # 계산 로직
│   └── Separator.java         # 구분자 관리
├── parser/
│   ├── SeparatorParser.java   # 커스텀 구분자 파싱
│   └── StringParser.java      # 문자열 → 숫자 변환
└── print/
    ├── InputView.java         # 입력 메시지 출력
    └── OutputView.java        # 결과 출력
```

## 구현 기능 상세

### CalculatorManager
- 전체 계산 프로세스 제어
- 입력, 파싱, 계산, 출력 흐름 관리

### Separator
- 구분자 저장 및 관리
- 기본 구분자 초기화
- 커스텀 구분자 동적 추가
- 특정 문자가 구분자인지 판별

### SeparatorParser
- 커스텀 구분자 선언부 파싱
- `//` 로 시작하는 입력에서 구분자 추출
- 숫자 표현식 부분만 반환

### StringParser
- 구분자를 기준으로 문자열 분리
- 각 토큰을 정수로 변환
- 숫자가 아닌 토큰 검증

### Calculator
- 파싱된 숫자 리스트를 합산
- 최종 계산 결과 반환
