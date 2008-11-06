#!/bin/sh

nano sk-deb/DEBIAN/control

dpkg-deb -b sk-deb/ .
