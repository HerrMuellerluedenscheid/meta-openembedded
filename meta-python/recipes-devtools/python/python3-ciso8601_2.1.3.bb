SUMMARY = "Fast ISO8601 date time parser for Python written in C"
DESCRIPTION = "ciso8601 converts ISO 8601 or RFC 3339 date time strings into Python datetime objects."
AUTHOR = "Marius Kriegerowski <marius.kriegerowski@gmail.com"
HOMEPAGE = "https://pypi.org/project/ciso8601/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=650b6b7ede4fbd14ab012aceb71d69d7"

SRC_URI[md5sum] = "5d6434ad5ba5d54167aaa96b3503d81e"

PYPI_PACKAGE = "ciso8601"

inherit pypi setuptools3 distutils3

BBCLASSEXTEND = "native"

