SUMMARY = "Simple OPC UA Server"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://main.c \
    file://CMakeLists.txt \
    file://opcua-server.service \
"

S = "${WORKDIR}"

inherit cmake systemd

DEPENDS += "open62541"

SYSTEMD_SERVICE:${PN} = "opcua-server.service"
SYSTEMD_AUTO_ENABLE = "enable"

do_install:append() {

    install -d ${D}${bindir}
    install -m 0755 ${B}/opcua-server ${D}${bindir}/opcua-server


    install -d ${D}${systemd_system_unitdir}
    install -m 0644 \
        ${WORKDIR}/opcua-server.service \
        ${D}${systemd_system_unitdir}/opcua-server.service
}
