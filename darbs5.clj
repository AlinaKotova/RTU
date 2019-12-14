;;НЕ БЕЙТЕ ПОЖАЛУЙСТА, ЭТО ВЫГЛЯДИТ, ВЕРОЯТНО КРИВО И НЕ ОПТИМАЛЬНО:)

(use 'clojure.core)
(use 'clojure.string)

(defn translate [str] (replace str #" " {" " "_"}))  ;;STRING SPACE CHANGE FUNCTION

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;ENCRYPT STRING;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def string "aatln_ooaikv")                      ;;INPUT STRING
(def key 3)                                      ;;INPUT KEY
(def newstring (into-array [""""""""""""]))      ;;DEFINE OUTPUT CHAR ARRAY
(def len (count string))                         ;;DEFINE STRING LENGTH
(def down false)                                 ;;DEFINE CIPHER DIRECTION
(def row 0)                                      ;;DEFINE CHAR ARRAY ROWS

(defn encrypt [string key]                           
  (dotimes [n len] 
    (aset newstring row (str (get newstring row ) (subs (translate string) n (+ n 1))))   
    (if (= row (- key 1)) (def down false))
    (if (= row 0) (def down true))
    (if (= down true)(def row(inc row))(def row(dec row)))
  )
  (join newstring)     
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;DECRYPT STRING;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;



(def new (into-array [""""""""""""]))            ;;DEFINE TEMPORARY ARRAY
(def pos 0)                                      ;;DEFINE POSITION COUNTER FOR CHAR SUBSTRINGS

(defn decrypt [string key]
  
  (encrypt string key)   ;;TO GET AN OUTPUT STRING FROM AN ARRAY, WE NEED TO FIND OUT, HOW MUCH CHARS WILL BE IN EACH ROW

  (dotimes [n key]       ;;INSERT ENCRYPT CHAR SUBSTRINGS INTO ARRAY BY ROWS             
    (aset new n (subs (translate string) pos (+ pos (count (get newstring n)))))
    (def pos (+ pos (count (get newstring n))))
  )
  
  (def down false)           ;;DEFINE CIPHER DIRECTION
  (def row 0) 

  (dotimes [n len]            ;;GET OUT AN OUTPUT SEQUENCE OF CHARS FROM AN ARRAY, USING A CIPHER DIRECTION
    (print(subs (get new row ) 0 1))
    (aset new row (replace-first (get new row) (subs (get new row) 0 1) "")) 
    (if (= row (- key 1)) (def down false))
    (if (= row 0) (def down true))
    (if (= down true)(def row(inc row))(def row(dec row)))  
  ) 
) 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 
;;(encrypt string key)
(decrypt string key)
