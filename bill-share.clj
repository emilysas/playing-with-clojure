;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

; define a function with defn
; you can add documentation if you put a string after the function name"
; arguments are taken in a vector (array)

; (defn add-five
;   [x]
;   (+ x 5))

; (def add-five
;   (fn [x]
;     (+ x 5))

; find per-person share of bill

(defn total-with-tip
  "Given subtotal, return total after tax and tip."
  [subtotal tip-pct]
  (* 1.08 subtotal (+ 1 tip-pct)))

(def total-tax-tip (total-with-tip 12 0.18))

(defn share-per-person
  "Divide the total by the number of people"
  [total-tax-tip people]
  (/ total-tax-tip people))

(share-per-person total-tax-tip 6)