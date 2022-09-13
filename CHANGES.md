* [](http://github.com/rohitsngh27/blueflood/commit/e1bc9aba506fd3cbdcbfafa3d08d7f9a5fd2009a) - Adding changelogs
* [](http://github.com/rohitsngh27/blueflood/commit/ff01300de3f46912e0ada5cc2a10aaa0ade0dd45) - [maven-release-plugin] prepare release blueflood-3.7.4
* [](http://github.com/rohitsngh27/blueflood/commit/1213c693662bb3346dc21d7b2afb5951bbf73993) - Update release.yml

# CHANGES

## IN PROGRESS
* Added configuration option ENABLE_DTX_INGEST_BATCH to enable using unlogged BatchStatement for 
  Ingest nodes with Datastax driver. Note: this option is only in effect if CASSANDRA_DRIVER 
  is set to 'datastax'.
* Upgraded datastax driver to 3.2.0
* Upgraded netty to 4.0.44.FINAL
* Added configuration option ENABLE_PER_TENANT_METRICS to enable recording per-tenant ingest metrics:
  ** number of datapoints each tenant ingests
  ** number of delayed datapoints each tenant ingests
* Updated to using cassandra-maven-plugin v2.1.7-1
* Removed String and Boolean support
* Removed caching of metrics Type in metrics_metadata Column Family and MetadataCache
* Closed idle connection with no inbound traffic after HTTP_CONNECTION_READ_IDLE_TIME_SECONDS  
* Integrated docker build into maven
* Added new configuration option DELAYED_METRICS_REROLL_GRANULARITY
* Removed Enums metrics support

## blueflood-2.0.0
* Switched to officially building with JDK 8. **NOTE**: after this release, JDK 7 will no longer be supported.
* Added response body for 207 errors listing the rejected metrics and the reasons
* Fixed Issue #748, avoided missing rollups due to metrics_locator not updated because
  metrics never expired from cache
* Improved handling of delayed metrics by re-rolling only those metrics (not the whole shard)

## rax-release-v1.0.2981
* Added a more robust API input validation
* Upgraded to Datastax driver version 3.0.3
* Added validations on Content-Type and Accept headers, return 415 if invalid

## rax-release-v1.0.2915
* Added a more robust API input validation
* Upgraded to Netty 4.0.40.FINAL
* Changed to batch statements for Rollup using Datastax 
* Added support for CORS
* Improved performance of token search query for Grafana
* Added Zookeeper support back
* Added sum metrics calculation for Basic numeric metrics

## rax-release-v1.0.2768
* Added 2 groups of delayed metrics, short delay vs long delay. The rollups for
  long delayed metrics will be postponed to later time, compared to short delayed
  metrics
* Added support for Datastax driver 3.0.0 which can be enabled via configuration
* Added validation on timestamps during Ingestion
* Fixed Blueflood Finder (Grafana) performance issues
* Added the getNextToken API for searching next metric slug from Grafana
* Removed Zookeeper based ShardLockManager
* Improved rollup on read performance

## rax-release-v1.0.2123
* Fixed issue with binding only to loopback/localhost port
* Added Enum validation to limit enumeration values to manageable number
* Added Enum as a new metric type
* Added support for JDK 1.8

## rax-release-v1.0.1956
* Added a new API for aggregated multi-tenants Ingestion
* Added Annotations
* Added glob support for metrics search API
* Added graphite finder support
* Added metrics search API
* Added suport for Kafka Ingestion
* Added support for sending metrics to Riemann
* Added multi-tenant Ingest API
* Implemented rollup on read repair
* Supported compression for Ingestion
* Added cache for Metadata
* Added a command line tool to export to Rackspace Cloud Files
* Added a command line tool to rollup metrics
* Added support for configurable TTLs
* Added support for batch queries
* Added rollup event emitter
* Added support for fetching multiple metrics in a single HTTP call
* Switched to using org.apache.curator instead of com.netflix.curator
* Added support for statsD style preaggregated metrics (Counters, Gauges, Sets, Timers)
* Assigned TTLs for each Column Family, instead of Granularity
* Added batch Metadata reads
* Added batch rollup writes
  * Configuration value "MAX_ROLLUP_THREADS" has been replaced with "MAX_ROLLUP_READ_THREADS" and "MAX_ROLLUP_WRITE_THREADS"
* Added more instrumentation
* Added ElasticSearch as discovery backend
* Added Histogram as first class metric type
* Added support for typed Points
* Added support for UDP Ingestion

## blueflood-1.0.3
* Added support for UDP ShardStateServices

## blueflood-1.0.2
* Added support for arbitrary rollups

## blueflood-1.0.1
* Added release profile to maven build

## blueflood-1.0.0
Initial release
