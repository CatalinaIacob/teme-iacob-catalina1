#!/bin/sh
#-------------------------------------------------------------------------------
# Script which completes the setup of this project (cloning extra repos)
#-------------------------------------------------------------------------------

#url of other repos to clone (choose 'git@..' version if you have ssh key configured, https otherwise)
#CURS_REPO="git@gitlab.com:wantsome/testare-manuala/intro_ta/seria24/curs.git"
CURS_REPO="https://gitlab.com/wantsome/testare-manuala/intro_ta/seria24/curs.git"

#-------------------------------------------------------------------------------

ACT=$1
if [ "$ACT" = "clean-all" ]; then
  echo '---- Full cleanup - deleting dirs before clone... ----'
  rm -rf curs
  echo ''
fi

echo '---- Cloning course repos... ----'
if [ ! -d "curs" ]; then
  git clone $CURS_REPO
else
  echo 'curs repo: already cloned'
fi

if [ ! -e curs/.git/hooks/pre-commit ]; then
  echo 'curs repo: adding pre-commit hook...'
  cp gradle/pre-commit curs/.git/hooks
else
  echo 'curs repo: pre-commit hook ok'
fi

if [ "$ACT" = "clean" ] || [ "$ACT" = "clean-all" ]; then
  echo ''
  echo '----- Cleaning up temp files, cache... ----'
  rm -rf build
  rm -rf .gradle
  rm -rf .idea
  rm -rf out
  ./gradlew clean
fi

echo 'All done!'

echo '------------------------------------------------------------------------'
echo 'JAVA version:'
java -version
echo 'JAVA COMPILER version (if JDK installed):'
javac -version
echo '------------------------------------------------------------------------'
git --version
echo 'Git url of current project:'
git remote get-url origin
echo 'Checking GitLab access by SSH key...'
ssh -T git@gitlab.com
echo '------------------------------------------------------------------------'

if [ "$ACT" = "clean" ] || [ "$ACT" = "clean-all" ]; then
  echo 'RECOMMENDED: if you are now in IntelliJ, you should also:'
  echo ' - first: run "Update project" (from Git) - Ctrl+T'
  echo ' - then:  do a clean restart - from menu: File \ Invalidate Caches/Restart... -> Invalidate and Restart'
  echo '          or at least: do a Gradle refresh - from Gradle tab (top-right side), 1st button: "Reimport all gradle projects"'
  echo '------------------------------------------------------------------------'
else
  echo You may also try the cleanup options:
  echo $0 'clean     - cleans just the caches and temp files'
  echo $0 'clean-all - DELETES all extra repos and clones them again'
  echo '------------------------------------------------------------------------'
fi
