\# Brick Breaker Game



A classic brick breaker game built with Java. Break all the bricks with the bouncing ball while controlling the paddle to keep the ball in play!



\## Game Preview



\- \*\*Objective\*\*: Break all 36 bricks to win

\- \*\*Controls\*\*: Arrow keys to move paddle, Enter to start/restart

\- \*\*Scoring\*\*: Each brick is worth 5 points



\## Features



\- Classic brick breaker gameplay

\- 36 bricks arranged in a 4x9 grid

\- Score tracking system

\- Game over and win conditions

\- Restart functionality

\- Smooth collision detection

\- Responsive paddle controls



\## How to Play



1\. \*\*Start the game\*\*: Press `ENTER` to begin

2\. \*\*Move the paddle\*\*: Use `LEFT` and `RIGHT` arrow keys

3\. \*\*Break bricks\*\*: Bounce the ball off the paddle to hit bricks

4\. \*\*Win condition\*\*: Break all 36 bricks

5\. \*\*Lose condition\*\*: Let the ball fall below the paddle

6\. \*\*Restart\*\*: Press `ENTER` after game over to play again



\## Getting Started



\### Prerequisites



\- Java Development Kit (JDK) 8 or higher

\- An IDE (IntelliJ IDEA, Eclipse, or VS Code)



\### Installation



1\. Clone the repository:

```bash

git clone https://github.com/MansiDhanania/BrickBreaker.git

cd BrickBreaker/src

```



2\. Open the project in your IDE



3\. Run the `Main.java` file



\### Running from Command Line



```bash

\# Compile

javac breakoutBall/\*.java



\# Run

java breakoutBall.Main

```



\## Project Structure



```

BrickBreaker/

├── src/

│   └── breakoutBall/

│       ├── Main.java           # Entry point, creates game window

│       ├── Gameplay.java       # Core game logic and rendering

│       └── MapGenerator.java   # Brick grid generation and management

└── README.md

```



\## Game Mechanics



\### Controls

\- `<--` \*\*Left Arrow\*\*: Move paddle left

\- `-->` \*\*Right Arrow\*\*: Move paddle right  

\- \*\*Enter\*\*: Start game / Restart after game over



\### Scoring

\- Each brick broken: \*\*+5 points\*\*

\- Maximum possible score: \*\*180 points\*\* (36 bricks × 5 points)



\### Physics

\- Ball bounces off walls, paddle, and bricks

\- Collision detection using rectangle intersection

\- Ball speed: Consistent throughout the game



\## Technical Details



\### Built With

\- \*\*Java Swing\*\* - GUI framework

\- \*\*AWT Graphics\*\* - 2D rendering

\- \*\*Timer\*\* - Game loop (~125 FPS)



\### Key Components



\*\*Gameplay.java\*\*

\- Implements `ActionListener` for game loop

\- Implements `KeyListener` for user input

\- Handles collision detection and game state

\- Renders all game objects



\*\*MapGenerator.java\*\*

\- Generates 4x9 brick grid

\- Manages brick states (active/destroyed)

\- Handles brick rendering with borders



\*\*Main.java\*\*

\- Creates JFrame window (700x650)

\- Initializes gameplay panel

\- Sets up window properties



Happy Gaming!

---

