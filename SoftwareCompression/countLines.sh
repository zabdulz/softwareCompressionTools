#!/bin/bash

#searches for all .java files in the directory and sub-directories and count the number of lines of code in the file

for file in `find . -name '*.java'`
	do
    total=$(wc -l < $file)
    echo "$file,$total"
done
