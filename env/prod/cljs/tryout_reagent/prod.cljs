(ns tryout-reagent.prod
  (:require [tryout-reagent.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
