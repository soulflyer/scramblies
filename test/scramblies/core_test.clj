(ns scramblies.core-test
  (:require [midje.sweet :refer :all]
            [scramblies.core :refer :all]))

(println "Midje tests running")

(facts "about scramblies"
       (fact "returns true if second string can be constructed from the first"
             (scramble? "rekqodlw" "world") => true
             (scramble? "cedewaraaossoqqyt" "codewars") => true
             (scramble? "katas"  "steak") => false
             (scramble? "katas" "katas") => true
             (scramble? "ketas" "steak") => true
             (scramble? "ktas" "katas") => false))
