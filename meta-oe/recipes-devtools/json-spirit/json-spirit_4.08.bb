SUMMARY = "A C++ JSON Parser/Generator Implemented with Boost Spirit."
DESCRIPTION = "JSON Spirit, a C++ library that reads and writes JSON files or streams. \
It is written using the Boost Spirit parser generator. If you are \
already using Boost, you can use JSON Spirit without any additional \
dependencies."
HOMEPAGE = "https://www.codeproject.com/kb/recipes/json_spirit.aspx"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=278ef6183dec4aae1524fccc4b0113c9"

SRC_URI = "file://json_spirit_v${PV}.zip \
           file://0001-Adjust-the-cmake-files.patch \
"

S = "${WORKDIR}/json_spirit_v${PV}"

DEPENDS = "boost"

LDFLAGS += "-Wl,--as-needed -latomic -Wl,--no-as-needed"

inherit cmake

FILES_${PN}-dev += "${datadir}/cmake/Modules/FindLibJsonSpirit.cmake"

BBCLASSEXTEND = "nativesdk"
