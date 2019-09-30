#!/bin/bash

#searches for all .java files in the directory and sub-directories and count the number of vocabularies in the file

for file in `find . -name '*.java'`
	do
    total=$(grep -roE '\w+' $file | sort -u -f | wc -l)
    echo "$file,$total"
done
