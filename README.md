# Introduction

This is a small example of computing code coverage over multiple modules with JaCoCo and Maven. Note that the module
wide reports are still contained in single directories (and, for example, have to be summarizied by a simple script).

Call with

    mvn clean compile test
    # Print out report directories
    find . -name coverage

