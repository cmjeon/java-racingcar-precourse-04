# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항 정의

- 자동차의 이름을 부여할 수 있다.
- 자동차의 이름을 부여할 때 쉼표를 기준으로만 부여할 수 있다.
- 자동차의 이름은 5자 이하여야만 한다.
- 시도할 횟수를 입력할 수 있다.
- 0 ~ 9사이의 랜던값을 구할 수 있다.
- 랜덤값이 4 이상인 경우 전진할 수 있다.
- 랜덤값이 3 이하인 경우 멈추어야 한다.
- 시도 횟수가 모두 끝나면 자동차 경주 게임이 종료되어야 한다.
- 자동차 경주 게임이 종료되면 누가 우승했는지 알려주어야 한다.
- 우승자가 한 명 이상인 경우, 쉼표로 구분하해서 출력해야 한다.
- 사용자가 잘못된 값을 입력할 경우, IllegalArgumentException 을 발생시켜야 한다.
- IllegalArgumentException 이 발생하면 "[ERROR]" 로 시작하는 메시지를 출력하여야 한다.
- IllegalArgumentException 이 발생되고 난 후 다시 입력을 받을 수 있어야 한다.
- Exception 이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리해야만 한다.
