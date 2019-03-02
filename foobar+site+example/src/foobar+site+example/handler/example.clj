(ns foobar+site+example.handler.example
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :foobar+site+example.handler/example [_ options]
  (context "/example" []
    (GET "/" []
      (io/resource "foobar+site+example/handler/example/example.html"))))
