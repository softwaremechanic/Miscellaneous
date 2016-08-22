; -- program to a, find decidability of a collatz seq.
; --            b, find length of a collatz seq
; --        given: an integer

; -- Insights/key shortcuts:
;               a, each of the element in a sequence will have had it's collatz seq length already
;calculated
;               b, Any number that is a power of 2 will have seq. length of power + 1. for ex: 2^2 = 4
;will have seq length 3.  So once we hit a 2^n form we can stop and find log 2 + 1, instead of
;generating sequence

(defn power_of_2 [n] (and (not= n 0) (== (bit-and n (- n 1) ) 0) ) )
(defn collatz [ln] (defn n1 [ln] first ln) (defn n2 [[_ second]] second)
  )
