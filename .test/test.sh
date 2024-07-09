#! /bin/bash

# Compile the Java code
javac -encoding utf8 -classpath .:./.github/test/junit-platform-console-standalone-1.11.0-M2.jar .github/test/TestMain.java Main.java BarGraph.java ColorCode.java UtilityBelt.java
# Check if compilation was successful
if [ $? -ne 0 ]; then
    exit 1
fi

# Run unit tests
java -Dfile.encoding=UTF8 -jar ./.github/test/junit-platform-console-standalone-1.11.0-M2.jar execute --class-path .:./.github/test/ --scan-class-path
# Check if unit tests were successful
if [ $? -ne 0 ]; then
    exit 2
fi

# Perform style checks
java -Dfile.encoding=UTF8 -jar ./.github/test/checkstyle-10.17.0-all.jar -c ./.github/test/cs111_l01_style.xml Main.java
# Check if style checks were successful
if [ $? -ne 0 ]; then
    exit 3
fi

# If all checks passed, exit with code 0
exit 0