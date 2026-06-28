SUMMARY = "LoRaWAN to OPC UA Mapping Application"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://main.cpp \
           file://CMakeLists.txt \
           file://lorawan-opcua-mapper.service"

S = "${WORKDIR}"

inherit cmake systemd

DEPENDS += ""

SYSTEMD_SERVICE:${PN} = "lorawan-opcua-mapper.service"
SYSTEMD_AUTO_ENABLE = "enable"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/lorawan-opcua-mapper ${D}${bindir}/lorawan-opcua-mapper

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/lorawan-opcua-mapper.service \
        ${D}${systemd_system_unitdir}/lorawan-opcua-mapper.service
}
