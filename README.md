<h1 align="center">
  <br>
  <a href=""><img src="https://i.pinimg.com/originals/b4/ee/c4/b4eec4d093adbe9d8a3cbb40d024836a.png" width="450"></a>
  <br>
  <br>
</h1>

## 수정 사항
### 맵 파싱 및 엔티티 생성 과정 개선
- Strategy 패턴 사용
  - `EntityFactory`라는 함수형 인터페이스를 선언하여 엔티티 생성 행위를 추상화
  - 구체적인 엔티티 생성 로직을 `EntityFactory`를 구현하여 `entityFactoryMap`에 넣음
- Command 패턴 사용
  - `EntityFactory`로 캡슐화된 구체적인 로직을 `entityFactoryMap`에 모아둠
  - 엔티티 생성이 필요할 때 `entityFactoryMap`에서 꺼내서 실행함

### 게임 단계를 상태화하여 재도전 기능 구현
- State 패턴 사용
  - `GameState`로 상태를 추상화하여 각 게임 단계를 규정
    - `MenuState` : 게임 시작 또는 재시작하기 전 준비 단계
    - `PlayState` : 게임 플레이 단계
    - `GameOverState` : 게임 종료 단계
  - 각 상태 각각에서 상태 전환 로직을 규정하도록 만듦
  - `Game.java`의 책임을 분산시키는 효과를 도출함

### 유령 강화 상태 구현
- Strategy 패턴 사용
  - `IGhostStatStrategy`로 유령의 현재 상태를 추상화하여 유령의 강화 유무를 규정
    - `NormalStatStrategy` : 일반적인 유령 상태
    - `EmpoweredStatStrategy` : 강화된 유령 상태
  - 유령이 10초 이상 팩맨을 쫓을 경우 화가 나서 이동 속도가 2배 상승
  - 하지만 화가 난 유령을 슈퍼 팩껌을 이용해 먹으면 점수가 2배 상승
___
## General info
Good ol' PacMan.

To play, you just need to use the arrow keys on your keyboard ◀️ ▶️ 🔼 🔽 (or with 🇿 🇶 🇸 🇩).
Avoid traps, eat some super pac gums and chase the 👻 to eat them.
<br />
What's the best score you can get ?

Let's find out !
___
## Technologies

Made with ❤️ in Java.
<br />
Runs using _java.swing_ library and the **Factory**, **State** and **Strategy** design patterns.
___
## Setup

Prerequisites: You must have [Java](https://www.java.com/en/download/) installed (JRE 16 at least) on your computer.

1. On GitHub, go to the main page of the [repository](https://github.com/lucasvigier/pacman).
2. Go to the ``Releases`` [section](https://github.com/lucasvigier/pacman/releases/tag/production), and download the file ``pacman.jar``
3. Run the game with the command :

    ```
    java -jar pacman.jar
    ```
    (*Or just double click the file on Windows*)
4. Enjoy !

___
## License
This project is licensed under the MIT License - see the [LICENSE](https://github.com/lucasvigier/pacman/blob/main/LICENSE) file for more details.

<h1 align="center">
  <a href=""><img src="https://res.cloudinary.com/dek4evg4t/image/upload/v1562055192/pac-man-logo-icon-512x512.png" width="50"></a>
  <br>
</h1>
