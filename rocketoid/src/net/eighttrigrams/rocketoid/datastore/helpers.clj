(ns net.eighttrigrams.rocketoid.datastore.helpers)

(defn namespace-keys
  [ns-str m]
  (into {} (map (fn [[k v]]
                  [(keyword (str ns-str "/" (name k))) v]) m)))

(defn un-namespace-keys
  [m]
  (into {}
        (map (fn [[k v]]
               [(keyword (name k)) v])
             m)))