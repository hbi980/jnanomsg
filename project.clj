(defproject jnanomsg "0.1.0"
  :description "Nanomsg clojure/java wrapper/"
  :url "https://github.com/niwibe/jnanomsg"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [net.java.dev.jna/jna "4.0.0"]]
  :jvm-opts ["-server" "-Xmx1g" "-XX:+TieredCompilation" "-XX:TieredStopAtLevel=1"]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :plugins [[lein-javadoc "0.1.1"]]
  :javadoc-opts {:output-dir "docs/_build/javadoc"
                 :package-names ["nanomsg" "nanomsg.jna" "nanomsg.pubsub"
                                 "nanomsg.reqrep" "nanomsg.bus" "nanomsg.pair"]}
  :main nanomsg.benchmark
  :profiles {:uberjar {:aot :all}})