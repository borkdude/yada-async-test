(ns external.endpoint.example
  (:require [compojure.core :refer :all]))

(defn example-endpoint [config]
  (context "/example" []
           (GET "/" []
                (Thread/sleep 5000)
                "This is an example endpoint")))
