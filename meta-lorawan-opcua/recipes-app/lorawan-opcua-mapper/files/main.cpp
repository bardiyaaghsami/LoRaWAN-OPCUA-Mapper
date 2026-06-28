#include <iostream>
#include <thread>
#include <chrono>

int main() {
    std::cout << "[LoRaWAN OPC UA Mapper] Starting..." << std::endl;

    while (true) {
        std::cout << "Collecting LoRaWAN data..." << std::endl;

        // اینجا بعداً:
        // - MQTT subscribe
        // - LoRaWAN payload decode
        // - OPC UA node update

        std::this_thread::sleep_for(std::chrono::seconds(5));
    }

    return 0;
}
