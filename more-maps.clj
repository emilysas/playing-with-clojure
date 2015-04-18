;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(defn get-name
  [person]
  (str (:first person) " " (:last person)))


(defn get-names
  [people]
  (comment (into [] (map get-name people)))
  (->> people
       (map get-name)
       (into [])))


(get-names [{:first "Margaret" :last "Atwood"}
            {:first "Doris" :last "Lessing"}
            {:first "Ursula" :last "Le Guin"}
            {:first "Alice" :last "Munro"}])

(get-name {:first "Margaret" :last "Atwood"})




(def classmates [{:name "Natalia" :hometown "Madrid"} {:name "Rosa" :hometown "Barcelona"}])

(def me {:name "Emily" :hometown "Northampton"})

(defn join-class
  [class-to-join new-member]
  (conj class-to-join new-member))

(join-class classmates me)

