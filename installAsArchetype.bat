@echo off
mvn archetype:create-from-project
cd target\generated-sources\archetype
mvn install