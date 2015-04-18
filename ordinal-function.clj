;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(defn ordinal
  [number]
  (let
    [remainder (rem number 10)]
    (cond
      (= remainder 1)   (str number "st")
      (= remainder 2)   (str number "nd")
      (= remainder 3)   (str number "rd")
      :else             (str number "th")
  )))

(ordinal 1)
(ordinal 2)
(ordinal 3)
(ordinal 4)
(ordinal 5)
(ordinal 21)
(ordinal 22)