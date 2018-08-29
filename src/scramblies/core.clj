(ns scramblies.core
  (:require [clojure.set :as set]))

(defn- char-count [word ch]
  (count (filter #(= ch %) word)))

(defn- count-map [word]
  (let [word-set (set word)]
    (zipmap word-set
            (map #(char-count word %) word-set))))

(defn- occurences
  "returns the number of character ch present in a string-map"
  [str-map ch]
  (if (contains? str-map ch)
    (get str-map ch)
    0))

(defn scramble? [str1 str2]
  (let [str1-map (count-map str1)
        str2-map (count-map str2)]
    (reduce #(and %1 %2)
            (map #(>= (occurences str1-map %) (occurences str2-map %))
                 (keys str2-map)))))
