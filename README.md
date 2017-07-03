# Java Wrapper for Raspberry Pi Sense Hat

Simple Java wrapper for Sense Hat which allows to write various applications in any JVM language

- https://www.raspberrypi.org/products/sense-hat/
- https://github.com/RPi-Distro/python-sense-hat

### Supported sensors
- Environmental sensors
- IMU (inertial measurement unit)

### Unsupported sensors (TODO)
- Joystick
- LED

## Type of communication

### Simple command execution
Builds command for Python core and execute via new process

### Multiple command execution (TODO - not supported yet)
Creates new Python process and communicate only with this process (if possible) to save resources

## Usage

- Install Python library for Sense Hat on RPi (https://github.com/RPi-Distro/python-sense-hat)
- Clone this repository

```
# On RPi
./gradlew clean build

# On different platform
./gradlew clean -x test
```
- Copy _build/libs/java-executor-1.0-SNAPSHOT.jar_ into your project classpath
- Alternatively it's possible to edit _rpi.sense.hat.example.Project_ and run
```
./gradlew run
```
