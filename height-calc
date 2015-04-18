;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

; take your height in feet and inches and convert into inches

(def feet 5)
(def inches 7)

(def feet-in-inches (* feet 12))
(def height-in-inches (+ feet-in-inches inches))

; then convert that to centimeters

(def centimeters (* height-in-inches 2.54))

; find average height

(def kush-height 173)

(def average-height (/ (+ centimeters kush-height) 2))

; convert average back to inches

(def average-height-in-inches (/ average-height 2.54))

(def number-of-feet (quot average-height-in-inches 12))

(def number-of-inches (/(mod average-height-in-inches 12) 10))

(def average-height-in-feet-and-inches (+ number-of-feet number-of-inches))
