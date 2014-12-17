#!/bin/bash

currentDir=$(pwd)
mongoJavaDriver="mongo-java-driver-2.13.0-rc0.jar"

export CLASSPATH="$currentDir/$mongoJavaDriver:$CLASSPATH"
export ice="cream"

echo Added $mongoJavaDriver to CLASSPATH
