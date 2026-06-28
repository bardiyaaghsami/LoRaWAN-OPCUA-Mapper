SUMMARY = "LoRaWAN OPC UA Gateway Image"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += " \
    opcua-server \
    openssh \
    packagegroup-core-boot \
"

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_FSTYPES += "wic wic.bz2 wic.bmap"
