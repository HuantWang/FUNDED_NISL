@REM joern-cli launcher script
@REM
@REM Environment:
@REM JAVA_HOME - location of a JDK home dir (optional if java on path)
@REM CFG_OPTS  - JVM options (optional)
@REM Configuration:
@REM JOERN_CLI_config.txt found in the JOERN_CLI_HOME.
@setlocal enabledelayedexpansion
@setlocal enableextensions

@echo off


if "%JOERN_CLI_HOME%"=="" (
  set "APP_HOME=%~dp0\\.."

  rem Also set the old env name for backwards compatibility
  set "JOERN_CLI_HOME=%~dp0\\.."
) else (
  set "APP_HOME=%JOERN_CLI_HOME%"
)

set "APP_LIB_DIR=%APP_HOME%\lib\"

rem Detect if we were double clicked, although theoretically A user could
rem manually run cmd /c
for %%x in (!cmdcmdline!) do if %%~x==/c set DOUBLECLICKED=1

rem FIRST we load the config file of extra options.
set "CFG_FILE=%APP_HOME%\JOERN_CLI_config.txt"
set CFG_OPTS=
call :parse_config "%CFG_FILE%" CFG_OPTS

rem We use the value of the JAVA_OPTS environment variable if defined, rather than the config.
set _JAVA_OPTS=%JAVA_OPTS%
if "!_JAVA_OPTS!"=="" set _JAVA_OPTS=!CFG_OPTS!

rem We keep in _JAVA_PARAMS all -J-prefixed and -D-prefixed arguments
rem "-J" is stripped, "-D" is left as is, and everything is appended to JAVA_OPTS
set _JAVA_PARAMS=
set _APP_ARGS=

set "APP_CLASSPATH=%APP_LIB_DIR%\io.shiftleft.joern-cli-87fc3621984030df45365f30a7747701585d9d15.jar;%APP_LIB_DIR%\com.thoughtworks.paranamer.paranamer-2.8.jar;%APP_LIB_DIR%\com.michaelpollmeier.macros_2.13-3.4.4.5.jar;%APP_LIB_DIR%\com.lihaoyi.fastparse_2.13-2.1.3.jar;%APP_LIB_DIR%\com.h2database.h2-mvstore-1.4.199.jar;%APP_LIB_DIR%\org.javassist.javassist-3.21.0-GA.jar;%APP_LIB_DIR%\org.yaml.snakeyaml-1.15.jar;%APP_LIB_DIR%\com.lihaoyi.upickle-core_2.13-0.8.0.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite-repl-api_2.13.0-1.8.1.jar;%APP_LIB_DIR%\org.jline.jline-terminal-jna-3.6.2.jar;%APP_LIB_DIR%\com.michaelpollmeier.gremlin-scala_2.13-3.4.4.5.jar;%APP_LIB_DIR%\commons-lang.commons-lang-2.6.jar;%APP_LIB_DIR%\io.shiftleft.codepropertygraph-protos_2.13-0.11.87.jar;%APP_LIB_DIR%\org.apache.commons.commons-lang3-3.9.jar;%APP_LIB_DIR%\commons-collections.commons-collections-3.2.2.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-collection-compat_2.13-2.1.2.jar;%APP_LIB_DIR%\net.objecthunter.exp4j-0.4.8.jar;%APP_LIB_DIR%\io.shiftleft.overflowdb-traversal_2.13-0.52.jar;%APP_LIB_DIR%\com.lihaoyi.upack_2.13-0.8.0.jar;%APP_LIB_DIR%\au.com.bytecode.opencsv-2.4.jar;%APP_LIB_DIR%\io.shiftleft.codepropertygraph_2.13-0.11.87.jar;%APP_LIB_DIR%\commons-configuration.commons-configuration-1.10.jar;%APP_LIB_DIR%\net.java.dev.jna.jna-4.2.2.jar;%APP_LIB_DIR%\io.shiftleft.fuzzyc2cpg_2.13-1.1.32.jar;%APP_LIB_DIR%\com.lihaoyi.scalaparse_2.13-2.1.3.jar;%APP_LIB_DIR%\io.circe.circe-numbers_2.13-0.12.2.jar;%APP_LIB_DIR%\com.jcabi.jcabi-manifests-1.1.jar;%APP_LIB_DIR%\org.scala-lang.scala-reflect-2.13.0.jar;%APP_LIB_DIR%\org.apache.tinkerpop.gremlin-shaded-3.4.4.jar;%APP_LIB_DIR%\io.circe.circe-parser_2.13-0.12.2.jar;%APP_LIB_DIR%\org.msgpack.msgpack-core-0.8.17.jar;%APP_LIB_DIR%\com.carrotsearch.hppc-0.7.1.jar;%APP_LIB_DIR%\ch.qos.logback.logback-core-1.2.3.jar;%APP_LIB_DIR%\org.jline.jline-terminal-3.6.2.jar;%APP_LIB_DIR%\io.shiftleft.semanticcpg_2.13-0.11.87.jar;%APP_LIB_DIR%\io.shiftleft.dataflowengine_2.13-0.11.87.jar;%APP_LIB_DIR%\com.lihaoyi.ujson_2.13-0.8.0.jar;%APP_LIB_DIR%\io.shiftleft.overflowdb-tinkerpop3-0.52.jar;%APP_LIB_DIR%\org.typelevel.cats-macros_2.13-2.0.0.jar;%APP_LIB_DIR%\org.javatuples.javatuples-1.2.jar;%APP_LIB_DIR%\org.typelevel.cats-effect_2.13-2.0.0.jar;%APP_LIB_DIR%\io.circe.circe-generic_2.13-0.12.2.jar;%APP_LIB_DIR%\org.zeroturnaround.zt-zip-1.13.jar;%APP_LIB_DIR%\com.massisframework.j-text-utils-0.3.4.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-parallel-collections_2.13-0.2.0.jar;%APP_LIB_DIR%\commons-io.commons-io-2.5.jar;%APP_LIB_DIR%\com.chuusai.shapeless_2.13-2.3.3.jar;%APP_LIB_DIR%\org.scala-lang.scala-compiler-2.13.0.jar;%APP_LIB_DIR%\org.scala-lang.scala-library-2.13.0.jar;%APP_LIB_DIR%\net.sf.trove4j.core-3.1.0.jar;%APP_LIB_DIR%\com.lihaoyi.sourcecode_2.13-0.1.8.jar;%APP_LIB_DIR%\org.json4s.json4s-ast_2.13-3.6.7.jar;%APP_LIB_DIR%\org.typelevel.cats-core_2.13-2.0.0.jar;%APP_LIB_DIR%\org.typelevel.jawn-parser_2.13-0.14.2.jar;%APP_LIB_DIR%\commons-cli.commons-cli-1.4.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite-runtime_2.13.0-1.8.1.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite-terminal_2.13-1.8.1.jar;%APP_LIB_DIR%\com.lihaoyi.upickle-implicits_2.13-0.8.0.jar;%APP_LIB_DIR%\org.json4s.json4s-native_2.13-3.6.7.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite-interp-api_2.13.0-1.8.1.jar;%APP_LIB_DIR%\jline.jline-2.14.6.jar;%APP_LIB_DIR%\com.jcabi.jcabi-aspects-0.17.1.jar;%APP_LIB_DIR%\com.lihaoyi.fansi_2.13-0.2.7.jar;%APP_LIB_DIR%\io.get-coursier.interface-0.0.8.jar;%APP_LIB_DIR%\com.github.scopt.scopt_2.13-3.7.1.jar;%APP_LIB_DIR%\com.lihaoyi.pprint_2.13-0.5.6.jar;%APP_LIB_DIR%\com.jcabi.jcabi-log-0.14.3.jar;%APP_LIB_DIR%\org.antlr.antlr4-runtime-4.7.2.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-xml_2.13-1.2.0.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite-interp_2.13.0-1.8.1.jar;%APP_LIB_DIR%\io.circe.circe-core_2.13-0.12.2.jar;%APP_LIB_DIR%\com.google.guava.guava-21.0.jar;%APP_LIB_DIR%\org.apache.logging.log4j.log4j-core-2.11.0.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-collection-contrib_2.13-0.2.1.jar;%APP_LIB_DIR%\com.lihaoyi.os-lib_2.13-0.4.2.jar;%APP_LIB_DIR%\com.github.pathikrit.better-files_2.13-3.8.0.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite-ops_2.13-1.8.1.jar;%APP_LIB_DIR%\org.aspectj.aspectjrt-1.8.0.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite-util_2.13-1.8.1.jar;%APP_LIB_DIR%\com.lihaoyi.requests_2.13-0.2.0.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-java8-compat_2.13-0.9.0.jar;%APP_LIB_DIR%\org.jline.jline-reader-3.6.2.jar;%APP_LIB_DIR%\org.apache.logging.log4j.log4j-api-2.11.0.jar;%APP_LIB_DIR%\org.json4s.json4s-scalap_2.13-3.6.7.jar;%APP_LIB_DIR%\org.apache.tinkerpop.gremlin-core-3.4.4.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite-repl_2.13.0-1.8.1.jar;%APP_LIB_DIR%\com.lihaoyi.ammonite_2.13.0-1.8.1.jar;%APP_LIB_DIR%\com.github.javaparser.javaparser-core-3.2.5.jar;%APP_LIB_DIR%\io.circe.circe-jawn_2.13-0.12.2.jar;%APP_LIB_DIR%\ch.qos.logback.logback-classic-1.2.3.jar;%APP_LIB_DIR%\org.json4s.json4s-core_2.13-3.6.7.jar;%APP_LIB_DIR%\javax.validation.validation-api-1.1.0.Final.jar;%APP_LIB_DIR%\com.lihaoyi.geny_2.13-0.1.8.jar;%APP_LIB_DIR%\com.squareup.javapoet-1.8.0.jar;%APP_LIB_DIR%\org.slf4j.jcl-over-slf4j-1.7.25.jar;%APP_LIB_DIR%\com.lihaoyi.upickle_2.13-0.8.0.jar;%APP_LIB_DIR%\org.slf4j.slf4j-api-1.7.25.jar;%APP_LIB_DIR%\org.typelevel.cats-kernel_2.13-2.0.0.jar;%APP_LIB_DIR%\io.shiftleft.console_2.13-0.11.87.jar;%APP_LIB_DIR%\com.google.protobuf.protobuf-java-3.10.0.jar"
set "APP_MAIN_CLASS=io.shiftleft.joern.Cpg2Scpg"
set "SCRIPT_CONF_FILE=%APP_HOME%\conf\application.ini"

rem Bundled JRE has priority over standard environment variables
if defined BUNDLED_JVM (
  set "_JAVACMD=%BUNDLED_JVM%\bin\java.exe"
) else (
  if "%JAVACMD%" neq "" (
    set "_JAVACMD=%JAVACMD%"
  ) else (
    if "%JAVA_HOME%" neq "" (
      if exist "%JAVA_HOME%\bin\java.exe" set "_JAVACMD=%JAVA_HOME%\bin\java.exe"
    )
  )
)

if "%_JAVACMD%"=="" set _JAVACMD=java

rem Detect if this java is ok to use.
for /F %%j in ('"%_JAVACMD%" -version  2^>^&1') do (
  if %%~j==java set JAVAINSTALLED=1
  if %%~j==openjdk set JAVAINSTALLED=1
)

rem BAT has no logical or, so we do it OLD SCHOOL! Oppan Redmond Style
set JAVAOK=true
if not defined JAVAINSTALLED set JAVAOK=false

if "%JAVAOK%"=="false" (
  echo.
  echo A Java JDK is not installed or can't be found.
  if not "%JAVA_HOME%"=="" (
    echo JAVA_HOME = "%JAVA_HOME%"
  )
  echo.
  echo Please go to
  echo   http://www.oracle.com/technetwork/java/javase/downloads/index.html
  echo and download a valid Java JDK and install before running joern-cli.
  echo.
  echo If you think this message is in error, please check
  echo your environment variables to see if "java.exe" and "javac.exe" are
  echo available via JAVA_HOME or PATH.
  echo.
  if defined DOUBLECLICKED pause
  exit /B 1
)

rem if configuration files exist, prepend their contents to the script arguments so it can be processed by this runner
call :parse_config "%SCRIPT_CONF_FILE%" SCRIPT_CONF_ARGS

call :process_args %SCRIPT_CONF_ARGS% %%*

set _JAVA_OPTS=!_JAVA_OPTS! !_JAVA_PARAMS!

if defined CUSTOM_MAIN_CLASS (
    set MAIN_CLASS=!CUSTOM_MAIN_CLASS!
) else (
    set MAIN_CLASS=!APP_MAIN_CLASS!
)

rem Call the application and pass all arguments unchanged.
"%_JAVACMD%" !_JAVA_OPTS! !JOERN_CLI_OPTS! -cp "%APP_CLASSPATH%" %MAIN_CLASS% !_APP_ARGS!

@endlocal

exit /B %ERRORLEVEL%


rem Loads a configuration file full of default command line options for this script.
rem First argument is the path to the config file.
rem Second argument is the name of the environment variable to write to.
:parse_config
  set _PARSE_FILE=%~1
  set _PARSE_OUT=
  if exist "%_PARSE_FILE%" (
    FOR /F "tokens=* eol=# usebackq delims=" %%i IN ("%_PARSE_FILE%") DO (
      set _PARSE_OUT=!_PARSE_OUT! %%i
    )
  )
  set %2=!_PARSE_OUT!
exit /B 0


:add_java
  set _JAVA_PARAMS=!_JAVA_PARAMS! %*
exit /B 0


:add_app
  set _APP_ARGS=!_APP_ARGS! %*
exit /B 0


rem Processes incoming arguments and places them in appropriate global variables
:process_args
  :param_loop
  call set _PARAM1=%%1
  set "_TEST_PARAM=%~1"

  if ["!_PARAM1!"]==[""] goto param_afterloop


  rem ignore arguments that do not start with '-'
  if "%_TEST_PARAM:~0,1%"=="-" goto param_java_check
  set _APP_ARGS=!_APP_ARGS! !_PARAM1!
  shift
  goto param_loop

  :param_java_check
  if "!_TEST_PARAM:~0,2!"=="-J" (
    rem strip -J prefix
    set _JAVA_PARAMS=!_JAVA_PARAMS! !_TEST_PARAM:~2!
    shift
    goto param_loop
  )

  if "!_TEST_PARAM:~0,2!"=="-D" (
    rem test if this was double-quoted property "-Dprop=42"
    for /F "delims== tokens=1,*" %%G in ("!_TEST_PARAM!") DO (
      if not ["%%H"] == [""] (
        set _JAVA_PARAMS=!_JAVA_PARAMS! !_PARAM1!
      ) else if [%2] neq [] (
        rem it was a normal property: -Dprop=42 or -Drop="42"
        call set _PARAM1=%%1=%%2
        set _JAVA_PARAMS=!_JAVA_PARAMS! !_PARAM1!
        shift
      )
    )
  ) else (
    if "!_TEST_PARAM!"=="-main" (
      call set CUSTOM_MAIN_CLASS=%%2
      shift
    ) else (
      set _APP_ARGS=!_APP_ARGS! !_PARAM1!
    )
  )
  shift
  goto param_loop
  :param_afterloop

exit /B 0
