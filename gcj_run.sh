#! /bin/bash

problem=sample
# problem=small
# problem=large

javac Gcj.java
if [ $? == 0 ]; then
  java Gcj < input-$problem.txt > output-$problem.txt
else
  echo "Compilation failed!!"
fi
