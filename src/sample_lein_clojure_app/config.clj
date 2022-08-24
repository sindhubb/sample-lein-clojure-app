(ns sample-lein-clojure-app.config
  (:require [aero.core :refer [read-config]]
            [clojure.java.io :as io]))

(defn read-config-io-resource [filename] (read-config (io/resource filename)))

(def config
  (read-config-io-resource "config.edn"))
