;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

; (if conditional-expression
; expression-to-evaluate-when-true
; expression-to-evaluate-when-false)

(defn full-name
  [first-name middle-name last-name]
  (str first-name " " middle-name " " last-name))

(defn first-and-last-name
  [first-name last-name]
  (str first-name " " last-name))

(defn format-name
  [user]
  (if (:middle user)
    (full-name (:first user) (:middle user) (:last user))
    (first-and-last-name (:first user) (:last user))
))

(defn format-name
  [user order]
  (let [first-name  (:first user)
        middle-name (:middle user)
        last-name   (:last user)]
    (cond
      (and (= order :last) (not (empty? middle-name))) (str last-name " " middle-name " " first-name)
      (not (empty? middle-name))                       (str first-name " " middle-name " " last-name)
      (= order :last)                                  (str last-name " " first-name)
      :else                                            (str first-name " " last-name))))

(format-name {:first "Margaret" :last "Atwood"} :last)
(format-name {:first "Ursula" :last "Le Guin" :middle "K."} :last)
(format-name {:first "Emily" :middle "Bronwen" :last "Sas"} :first)

; can do method override

(defn return-str
  ([x] (return-str x nil))
  ([x y] (if y
           (str x " " y)
           (str x)))
  ([x y args] ()))


