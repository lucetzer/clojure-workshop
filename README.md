# clojure-workshop

Let's get started in clojure!

The project uses [Midje](https://github.com/marick/Midje/) for testing.


### Setup

* Make sure you have [java](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed

* Install clojure using [Homebrew](https://brew.sh) and use it to install clojure

    ``brew install clojure``
    
* Install Leiningen - a build tool for clojure projects

    ``brew install leiningen``

* Add this to your ``~/.lein/profiles.clj`` file:

    ``{:user {:plugins [[lein-midje "3.1.3"]]}}``

* If you use IntelliJ IDE download [Cursive](https://cursive-ide.com/) and set the keymap bindings. 

* If you are using Atom, check out these helpful packages to help set up a clojure work environment:
    * [Parinfer](https://atom.io/packages/parinfer)
    * [Photo REPL](https://atom.io/packages/proto-repl)
    * [Lisp-paredit](https://atom.io/packages/lisp-paredit)

## How to run tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.
