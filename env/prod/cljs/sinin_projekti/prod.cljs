(ns sinin-projekti.prod
  (:require [sinin-projekti.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
