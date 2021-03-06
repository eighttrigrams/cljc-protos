(ns middleware.figwheel-middleware
  (:require [ring.middleware.resource :refer (wrap-resource)]))

(defn handler [request]
  {:status  404
   :headers {"Content-Type" "text/html"}
   :body    (str "Cannot find:" (:uri request))})

(def app
  ;; static resources in resources/public
  (wrap-resource handler "public"))
