(ns clojure-workshop.core-test
  (:use midje.sweet)
  (:use [clojure-workshop.core]))

(println "You should expect to see three failures below.")

(facts "about `first-element`"
  (fact "it normally returns the first element"
    (first-element [1 2 3] :default) => 1
    (first-element '(1 2 3) :default) => 1)

  (fact "default value is returned for empty sequences"
    (first-element [] :default) => :default
    (first-element '() :default) => :default
    (first-element nil :default) => :default
    (first-element (filter even? [1 3 5]) :default) => :default))