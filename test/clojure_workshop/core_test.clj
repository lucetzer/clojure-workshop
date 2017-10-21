(ns clojure-workshop.core-test
  (:use midje.sweet)
  (:use [clojure-workshop.core]))

(println "An example passing test")

(fact "returns the nth element of a string"
      (string-element "hello" 4) => \l)

