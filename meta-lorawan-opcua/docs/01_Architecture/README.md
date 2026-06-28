# System Architecture

## Overview

This system connects LoRaWAN devices to OPC UA industrial systems using an edge gateway.

## Diagram

![Architecture](../assets/images/lorawan-opcua-architecture.png)

## Components

- LoRaWAN Sensor Nodes
- LoRaWAN Gateway Stack
- Mapper Service (C++)
- OPC UA Server (open62541)
- Industrial Clients (SCADA / HMI)
