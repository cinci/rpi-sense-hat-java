# Java Wrapper for Raspberry Pi Sense Hat

Simple Java wrapper for Sense Hat which allows to write various applications in any JVM language

- https://www.raspberrypi.org/products/sense-hat/
- https://pythonhosted.org/sense-hat

### Supported sensors
- Environmental sensors

### Unsupported sensors (TODO)
- IMU
- Joystick
- LED

## Type of communication

### Simple command execution
Builds command for Python core and execute via new process

### Multiple command execution (TODO - not supported yet)
Creates new Python process and communicate only with this process (if possible) to save resources
