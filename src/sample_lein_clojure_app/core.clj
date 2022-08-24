(ns sample-lein-clojure-app.core
  (:gen-class)
  (:require [ring.adapter.jetty :as jetty]
            [clojure.pprint :refer [pprint]]
            [compojure.core :as compojure]
            [compojure.route :as compojure-route]
            [sample-lein-clojure-app.config :refer [config]]))

 (compojure/defroutes app
   (compojure-route/files "/docs" {:root "docs/ubde"})
   (compojure/GET "/" [] "Hello World")
   (compojure-route/not-found "Page not found"))

(defn -main
  [& args]
  (jetty/run-jetty app {:port (get-in config [:app :port])}))