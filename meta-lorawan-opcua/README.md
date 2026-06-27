# meta-lorawan-opcua

## Overview

`meta-lorawan-opcua` is the custom Yocto layer for the **LoRaWAN OPC UA Mapper** project.

The layer contains all project-specific recipes required to build, deploy and maintain the software stack running on Raspberry Pi 5.

---

# Objectives

* Provide the LoRaWAN OPC UA Mapper application
* Integrate OPC UA (open62541)
* Support MQTT communication
* Support LoRaWAN payload processing
* Provide systemd services
* Support future protocol extensions

---

# Supported Platform

* Raspberry Pi 5
* Yocto Scarthgap
* systemd

---

# Directory Layout

```text
meta-lorawan-opcua

├── conf
├── recipes-app
├── recipes-opcua
├── recipes-protocols
├── recipes-support
└── README.md
```

---

# Main Components

## recipes-app

Application recipes.

Example:

* lorawan-opcua-mapper

---

## recipes-opcua

OPC UA related recipes.

Example:

* opcua-server

---

## recipes-protocols

Protocol extensions and bbappend files.

Example:

* open62541

---

## recipes-support

Utility recipes.

---

# Dependencies

* open62541
* systemd
* CMake
* C++17

Future:

* MQTT
* ChirpStack
* LoRaWAN libraries

---

# Build

Add the layer using:

```bash
bitbake-layers add-layer ../meta-lorawan-opcua
```

---

# License

MIT

---

# Project

LoRaWAN OPC UA Mapper

Copyright (c) 2026
