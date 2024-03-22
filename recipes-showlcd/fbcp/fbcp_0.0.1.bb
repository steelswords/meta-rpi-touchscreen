SUMMARY = "Provides fbcp, a Frame Buffer Copy utiltiy"
DESCRIPTION = "Allows quick copying to a secondary framebuffer"
LICENSE = "MIT"

PV = "0.0.1+git${SRCPV}"

SRC_URI = "git://github.com/tasanakorn/rpi-fbcp.git;protocol=https;branch=master"
SRCREV = "af8d32246c23cb23e4030e6588668a14341f5ddc"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20cd56e60f87e0c4ddd2b6b2d6241e6f"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

DEPENDS += "cmake virtual/egl"

inherit cmake

EXTRA_OECMAKE = ""

do_install() {
	cmake_do_install
}
