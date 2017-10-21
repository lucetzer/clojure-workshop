(ns clojure-workshop.core)

(defn string-element [some-string number]
  (nth some-string (dec number)))
