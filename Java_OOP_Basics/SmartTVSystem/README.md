# SmartTV System

## Overview

The **SmartTV System** is a simple Java-based project designed to demonstrate fundamental object-oriented programming (OOP) principles. The project simulates the functionality of a SmartTV, allowing users to control its state, volume, and channel using basic methods. This project showcases encapsulation, method-driven behaviors, and clean code practices.

## Features

The `SmartTV` class provides the following features:

1. **Power Control:**
   - The TV can be turned on and off, toggling the `isOn` state.

2. **Volume Control:**
   - Increase or decrease the volume by a single unit (+1 or -1).

3. **Channel Control:**
   - Increment or decrement the channel by 1.
   - Directly set a specific channel number.

## Class Characteristics

The `SmartTV` class contains three primary attributes:

- **`isOn`**: A boolean representing whether the TV is on (`true`) or off (`false`).
- **`channel`**: An integer representing the current channel number.
- **`volume`**: An integer representing the current volume level.

## Methods

### 1. Power Control
- **`turnOn()`**: Turns the TV on by setting `isOn` to `true`.
- **`turnOff()`**: Turns the TV off by setting `isOn` to `false`.

### 2. Volume Control
- **`increaseVolume()`**: Increases the volume by 1, provided the TV is on.
- **`decreaseVolume()`**: Decreases the volume by 1, provided the TV is on.

### 3. Channel Control
- **`nextChannel()`**: Switches to the next channel (+1), provided the TV is on.
- **`previousChannel()`**: Switches to the previous channel (-1), provided the TV is on.
- **`setChannel(int newChannel)`**: Directly sets the channel to `newChannel`, provided the TV is on.

## Project Purpose

This project is part of a portfolio to demonstrate:

- Proficiency in Java programming.
- Understanding of OOP concepts such as encapsulation and method-driven operations.
- Ability to create structured and reusable code for simple system simulations.

## Getting Started

### Prerequisites
To run the project, ensure you have:

- Java Development Kit (JDK) 8 or higher installed.
- An integrated development environment (IDE) such as IntelliJ IDEA, Eclipse, or VS Code.

### Setup
1. Clone this repository:
   ```bash
   git clone https://github.com/drnogueira/SmartTVSystem.git
   ```

2. Open the project in your IDE.

3. Compile and run the `SmartTV` class to test its functionality.


## Notes

This project is a personal learning exercise developed as part of a course. It is not licensed or distributed under any official terms.

---

Feel free to explore, modify, and improve this project as needed. Contributions are welcome!
