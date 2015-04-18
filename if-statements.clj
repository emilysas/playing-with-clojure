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
  [user]
  (let [first-name  (:first user)
        middle-name (:middle user)
        last-name   (:last user)]
    (if middle-name
      (str first-name " " middle-name " " last-name)
      (str first-name " " last-name))))

(format-name {:first "Margaret" :last "Atwood"})
(format-name {:first "Ursula" :last "Le Guin" :middle "K."})