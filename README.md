# Wantsome - Home Assignments

## About

This is the project for home assignments - just a basic working IntelliJ Idea
project.  
It's configured using _Gradle_, and it includes some common libraries we need
(like JUnit, Selenium drivers).
________________________________________________________________________________

## 1. Initial Setup

- __Setup a SSH key__:

  - needs to be done __only once per machine__ (but it means that you may need
    to do this again if you change your laptop, or if you want to work also
    from a second machine, etc)

  - the trainers should help you with this; if you need to do it yourself, see:
    <https://docs.gitlab.com/ee/gitlab-basics/create-your-ssh-keys.html>
    
  - test the key works correctly with command: `ssh -T git@gitlab.com`
    (will also display the name of gitlab user linked to your local key)
  

- __Clone the project to your machine__:

  - make a local copy of it using the 'git clone' command, for example:    
      `git clone git@gitlab.com:wantsome/testare-manuala/intro_ta/seria11/teme/teme_your_name.git`
    
  - OR: clone it using IntelliJ: _'File \ New \ Project from Version Control'_, 
    then select 'Git', and enter the URL of your repo (similar to above)
    and a local folder where you want your copy placed  


- __Run the setup script__ (to add to your project the extra materials, like /curs)
  - _Windows_: `setup.bat`, then in the new window: `./setup.sh`
  - _Linux/Mac_: `./setup.sh`
 
- ___Optional__: you may give access to your repo to other members -> from GitLab UI, 
  use the __Settings/Members__ menu, select access level __Reporter__ or __Developer___


- __Start working with your project__:

  - _get updates from the server_:
    
    - from IntelliJ: __Update Project__ (Ctrl+T)
      - _if it asks you to choose between 'Merge' and 'Rebase' options, choose
        Rebase (and also check 'Don't show again', if you want)_
        
    - with git commands: `git pull`
    
  - _send your changes to the server_: 
    
    - from IntelliJ: __Commit...__ (Ctrl+K), don't forget to also select
      __Push__ when committing (or else just Push separately later, with Ctrl+Shift+K)
      
    - with git commands: `git commit`, `git push`
________________________________________________________________________________

## 2. Working with Git

To be able to work with this locally you need first to __install git__ - see:
<https://git-scm.com>

After this you can run git operations (clone, commit, push..), using various tools:
- _from command line_ (tutorial: <http://rogerdudler.github.io/git-guide>)
- _using IntelliJ Idea_ directly (video guide: <https://www.youtube.com/watch?v=uUzRMOCBorg>)
- _using a separate UI client_, like _TortoiseGit_ or others 
  (see: <https://git-scm.com/download/gui/windows>)

________________________________________________________________________________

## 3. Working on assignments

- __Package organization__: 
  
  - under `teme` package you should have a separate package for each week (named
    like `w01_intro`), with a template (some incomplete classes)
    - _if it's not provided for the current week, you should create it_
    
  - you should work starting from the given template, editing existing classes
    and adding new classes (and even sub-packages) as needed.
  
- __Hints__:
 
  - you may commit & push your work in progress __at any time__ - as soon as you
    wrote a bigger chunk of code which looks ok, you should commit it, even if
    it's not yet perfect :) this ensures that you have a good backup (so you
    don't loose any work), and also that you can 'go back in time' to a previous
    version of a class (to revert some mistake..)
    
  - remember to also ___push_ the changes to remote repo__ (gitlab), not only
    ___commit___ them (as this will just save them locally on your machine)
    
  - you can also __work from multiple machines__ (or just have multiple local
    copies of this repo) just remember in this case to update from remote repo
    (`git pull` / Ctrl+T from Idea) more often (before working in a new copy) 
________________________________________________________________________________

## 4. Troubleshooting

If you have problems with your project, you may try to fix it by attempting 
these manual operations (checking after each if the problem was solved):

#### 1. __Invalidate IntelliJ cache__: 
  
  - from menu: _'File \ Invalidate Caches\Restart...'_, then _'Invalidate and Restart'_
  
  - after restart: if you get a message that _'Gradle projects need to be imported'_, 
    choose the option ___'Enable Auto-Import'___ (or at least _'Import Changes'_)
  
  - check that project compiles without errors (menu: _'Build \ Rebuild project'_)


#### 2. __Update the tools (IntelliJ, Java)__:  

  - Check and ensure you have __the latest version of IntelliJ Idea__:
    
    - menu: 'Help\ Check for updates...', then update Idea and any plugins
      detected as old. If this is a small update, it will work with just a
      restart of Idea; otherwise, for really old versions, it may require
      a full manual uninstall and reinstall;
    
    - note that having the latest version is __really important__, as some
      older versions had problems with the gradle version/scripts used by this
      project! (so for example the tests could not be run at all, etc)
  
  - Check the __version of Java__ you have installed:
    
    - recommended to have _a single Java version installed_, of type __JDK__ 
      (not just JRE), preferably __the latest update for major version 8__ 
      (like: `8u231`)
      - having multiple versions of Java adds some possible complications;
      - having just a JRE installed (instead of full JDK) will probably prevent
        your project from working correctly;
      - having a more recent major version (like 11, latest update) is probably
        ok and should work (but it's not tested by us);
        
    - you may check the version from Control Panel, or from a terminal (opened
      with 'cmd' or in Terminal tab in Idea), with command: `java -version`

  - Check the __version of git__ you have installed, with command: `git --version`
    - _a recent version (at least newer than 2.17.1) is probably ok.._


#### 3. __Try the automatic cleanup__:
  
  - Open a __new terminal window__, for running bash scripts:
    - __Windows__: run in IntelliJ's Terminal tab (or in OS terminal): `setup.bat`
      A new GitBash terminal window should open (text mode, title like 'MINGW..').
    - __Linux/Mac__: just open a separate terminal window (don't use IntelliJ's Terminal tab)
  
  - __Close ALL IntelliJ windows!__
  
  - In the terminal window, run one of these cleanup commands:
    
    - `./setup.sh clean` - __light cleanup__, will delete temporary folders and caches;
    
    - `./setup.sh clean-all` - __heavier cleanup__, will delete some extra folders 
      (like \curs, \clasa) and clone them clean again; but it will not affect
      your unsaved work (from \src folder).
      
  - _Note: the commands above will also print some info at the end (about java
    and git), check if all seems ok there (right versions, etc); should also
    follow any recommendations given there._


#### 4. __Perform a full manual cleanup__:
  
  _Note: this basically performs the same steps as the automatic cleanup, 
         but in a manual way, in case that one didn't work._
  
  - __Identify your project's location, on disk__:
    - displayed by IntelliJ in the title of its window (when opening files from it)
    - by default something like: _C:\\Users\\{user-name}\\IdeaProjects\\{project-name}_ 
  
  - __Close ALL IntelliJ windows!__
  
  - Go to your project folder on disk and __manually delete these folders__
    (if present): `.idea`, `.gradle`, `build`, `clasa`, `curs`  
    - _Note: pay attention to the exact names, including the "." prefix! make sure
      you don't delete by mistake other important folders! (like: `gradle`, `.git`)_

  - __Run the setup script__ (`setup.bat`, then `./setup.sh`), check that it
    restored the `\curs` folder


#### 5. __Restart IntelliJ__:

   - __Gradle__: if you get a message that _'Gradle projects need to be imported'_, 
     choose the option __'Enable Auto-Import'__ (or at least 'Import Changes')
     
   - perform an __update from git (Ctrl+T)__, it should work without errors
   - perform a __rebuild of your project__ sources: (menu: Build\ Rebuild project),
     check that it works without errors
   - check that __folder '\curs' exists__ (and has up-to-date content)


#### 6. __Make a separate clone__:

   If all previous steps didn't solve your problem, you could:

   - __make a new local clone__ of your gitlab repo, in a separate local folder;
     then open it in IntelliJ, complete the initial setup for it (see below), 
     make sure it works correctly, without compile errors or git problems;
     
   - ___if you had uncommitted work in your old project___: open the old project 
     in IntelliJ, and __copy from it all your latest work to your new project__;
     make sure the new project compiles and works correctly, and that you can
     push your new changes to gitlab; after this, you may close and delete your
     old project, and continue with just the new one.   
________________________________________________________________________________