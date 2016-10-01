@echo off
call mvn archetype:create-from-project
cd target\generated-sources\archetype
call mvn install
cd ..\..\..
echo DONE