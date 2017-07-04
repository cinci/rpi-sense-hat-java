# Java Wrapper for Raspberry Pi Sense Hat

Simple Java wrapper for Sense Hat which allows to write various applications in any JVM language

- https://www.raspberrypi.org/products/sense-hat/
- https://github.com/RPi-Distro/python-sense-hat

### Supported components
- Environmental sensors
- IMU (inertial measurement unit)
- LED Matrix

### Unsupported components (TODO)
- Joystick

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
- Alternatively it's possible to edit _rpi.sense.hat.example.Project_ and run on RPi
```
./gradlew run
```
