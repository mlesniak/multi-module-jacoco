# Introduction

This is a small example of computing code coverage over multiple modules with JaCoCo and Maven. Note that the module
wide reports are still contained in single directories (and, for example, have to be summarizied by a simple script).

Call with

    mvn clean compile test
    # Print out report directories
    find . -name coverage

# Record coverage on normal program execution (example)

By recording the execution paths you can 1) see which code paths are actually executed and 2) use tools such as
[DalekJS](http://dalekjs.com/) to compute coverage data. Note that you have to have ```mvn install``` executed at
least once such that the jacoco runtime-jar is downloaded.

Start the program, exemplified here for the module module-1, with:

    cd module-1
    mvn clean compile
    export AGENT=-javaagent:$HOME/.m2/repository/org/jacoco/org.jacoco.agent/0.7.2.201409121644/org.jacoco.agent-0.7.2.201409121644-runtime.jar=includes=com.mlesniak.*,destfile=target/jacoco.exec
    java $AGENT -cp $(mvn dependency:build-classpath|grep ^/):target/classes com.mlesniak.jacoco.Module1Main 1
    mvn jacoco:report
    # Show coverage report.
    open target/site/jacoco/index.html

