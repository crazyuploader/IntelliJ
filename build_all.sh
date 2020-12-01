#!/usr/bin/env bash

# Colors
GREEN="\033[1;32m"
NC="\033[0m"
YELLOW="\033[1;33m"
# MAGENTA="\033[1;35m"
RED="\033[0;31m"

echo ""
echo -e "${GREEN}" "Available File(s) -${NC}"
FILES=0
LIST_FILES="$(find src/ -name '*.java' | sort)"
for f in ${LIST_FILES}; do
    ((FILES = FILES + 1))
    echo "${f}"
done
echo ""
echo -e "${YELLOW}Compiling with Javac using Ant${NC}"
ANT_OUTPUT="$(ant)"
ERROR_CODE="$?"
if [[ ${ERROR_CODE} != "0" ]]; then
    echo ""
    echo -e "${RED}${ANT_OUTPUT}${NC}"
    echo ""
    echo -e "${YELLOW}Error(s) in some file(s).${NC}"
    echo ""
    echo -e "No. of file(s) checked: ${GREEN}${FILES}${NC}"
    exit 1
else
    echo ""
    echo "${ANT_OUTPUT}"
    echo ""
    echo -e "No. of file(s) checked: ${GREEN}${FILES}${NC}"
fi
