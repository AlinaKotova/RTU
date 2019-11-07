

(use 'clojure.string)

(def atzimes [5 6 7 8 9 6] )
(def vardi ["Alina" "Andrejs" "Aleksejs" "Pavels" "Marina" "Olga"] )
(def list (map vector vardi atzimes))
(def n(num 0))
(def m(num 0))

(dotimes [x (count list)]  
    (if (= (ends-with? (first (nth list x)) "a") true) 
        (and(def n(+ n (second (nth list x))))(def m(+ m 1)))))
        
(float(/ n m))