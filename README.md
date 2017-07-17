# Java Wrapper for Raspberry Pi Sense Hat

Simple Java wrapper for Sense Hat which allows to write various applications in any JVM language

- https://www.raspberrypi.org/products/sense-hat
- https://github.com/RPi-Distro/python-sense-hat

### Supported components
- Environmental sensors
- IMU (inertial measurement unit)
- LED Matrix
- Joystick (only blocking operation, must be used in separate thread)

## Usage

- Install Python library for Sense Hat on RPi (https://github.com/RPi-Distro/python-sense-hat)
- Clone this repository (on RPi - git clone ...)

```
# On RPi
./gradlew clean build

# On different platform
./gradlew clean build -x test
```
- Copy _build/libs/java-executor-1.0-SNAPSHOT.jar_ into your project classpath
- Alternatively it's possible to edit _rpi.sense.hat.example.Project_ and run on RPi
```
./gradlew run
```
or as simple background process
```
nohup ./gradle run &
```

## API

```
SenseHat senseHat = new SenseHat();

senseHat.environmentalSensor.<method>
senseHat.IMU.<method>
senseHat.ledMatrix.<method>
senseHat.joystick.<method>
```
