(defproject lunch-bot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-slack-client "0.1.0-SNAPSHOT"]
                 [clj-time "0.9.0"]
                 [org.clojure/math.combinatorics "0.0.8"]]
  :main ^:skip-aot lunch-bot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
