(ns scramblies.core
  (:require [clojure.set :as set]))

(defn scramble? [str1 str2]
  (println "set")
  (set/subset? (set str2) (set str1)))
