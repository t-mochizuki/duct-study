(ns foobar+api.handler.example
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :foobar+api.handler/example [_ options]
  (context "/example" []
    (GET "/" []
      (io/resource "foobar+api/handler/example/example.json"))))
