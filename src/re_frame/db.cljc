(ns re-frame.db
  (:require [tools.store]
            [re-frame.interop :refer [ratom]]))

;; -- Application State  --------------------------------------------------------------------------
;;
;; Should not be accessed directly by application code.
;; Read access goes through subscriptions.
;; Updates via event handlers.
(def app-db (tools.store/reg-> (ratom {})))

