# 문자열 덧셈 계산기
## 코드 설명
### Calculator
* String Type 으로 입력 받은 텍스트를 int 형으로 변환 하여 합을 반환

### Positive
* int 형 숫자가 양수인지 체크하는 validation 을 포함하며 양수를 리턴
* 추가 validation 확장성을 고려하여 wrapper class 로 작성했습니다.

### StringUtil
* 기본 구분자 및 커스텀 구분자를 포함하여 텍스트를 분리하여 String type의 숫자 리스트를 반환
* String Type의 숫자를 int 형으로 형변환

## 구현 내용
### 기본 기능
- [x] 쉼표 또는 클론을 구분자로 가지는 문자열을 합으로 반환 (“” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)

### 추가 기능
- [x] “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용 ("//\;n1;2;3")

### 예외
- [x] 숫자 이외의 값, 음수 전달 시 RuntimeException throw

----
# 자동차 경주 게임
## 코드 설명
`구현 부분을 크게 입력, 자동차 경주, 출력 세 부분으로 패키지를 나누어 작성했습니다.`
### input
* 자동차 경주 참가자 이름을 입력 받는다
* 경주 횟수를 입력 받는다

### racing
* 매 경기 마다 자동차 경주 참가자 별 이동한 결과값을 리턴
* 레이스 최종 이동 결과값을 리턴
* 우승한 참가자 목록을 리턴

### utils
* 1~10 사이 임의의 값을 리턴

### output
* 매 실행 결과값을 출력
* 최종 결과값을 출력
* 우승자 이름 리스트를 출력

## 구현 내용
### 입력
- 경주할 자동차 이름 (쉼표로 구분 : pobi,woni,jun)
    - [x] 5자 이하만 가능
- 시도할 횟수 (예 : 5)
    - [x] 양수만 가능

### 자동차 경주
- 자동차는 전진한다
    - [x] 전진 조건 : 0-9 random 값.
    - [x] 4이상 전진, 3이하 멈춤
- 우승자 선발
    - [x] 우승자는 가장 많이 이동한 사람
    - [x] 우승자 한명 이상 가능

### 출력
- [x] 게임이 끝난 후, 우승자들 출력
- [x] 매 실행 결과, 자동자 이동 출력 

----
# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
