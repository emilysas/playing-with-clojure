;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(defn average
  [bill-amount]
  (let
    [total (reduce + bill-amount)
    number (count bill-amount)]
  (/ total number))
)



(average [12.50 15.00 17.99 21.30])
