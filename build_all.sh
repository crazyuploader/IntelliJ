#!/usr/bin/env bash

# Colors
GREEN="\033[1;32m"
NC="\033[0m"
YELLOW="\033[1;33m"
MAGENTA="\033[1;35m"
RED="\033[0;31m"

echo ""
echo -e "${GREEN}" "Available Files -${NC}"
if [[ ! -d "temp" ]]; then
    mkdir temp
fi
LIST_FILES="$(find src/ -name '*.java')"
echo "${LIST_FILES}"
echo ""
FILES=0
echo -e "${YELLOW}Compiling with Javac${NC}"
echo ""
for f in ${LIST_FILES}; do
    ((FILES = FILES + 1))
    echo "Compiling '${f}'";
    javac "${f}" -d ./temp
    ERROR_CODE="$?"
    if [[ ${ERROR_CODE} != "0" ]]; then
        echo ""
        echo -e "${RED}Error while compiling ${MAGENTA}'${f}'${NC}"
        echo ""
    fi
done
echo ""
echo -e "No. of files checked: ${GREEN}${FILES}${NC}"
