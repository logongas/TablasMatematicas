#!/bin/bash

rm TablasMatematicas.jar
wget --no-cache -O TablasMatematicas.jar https://github.com/logongas/TablasMatematicas/blob/master/dist/TablasMatematicas.jar?raw=true
java -jar "TablasMatematicas.jar" &