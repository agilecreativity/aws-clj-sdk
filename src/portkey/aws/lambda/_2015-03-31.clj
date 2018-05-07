(ns portkey.aws.lambda.-2015-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "lambda", :region "ap-northeast-1"},
    :ssl-common-name "lambda.ap-northeast-1.amazonaws.com",
    :endpoint "https://lambda.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "lambda", :region "eu-west-1"},
    :ssl-common-name "lambda.eu-west-1.amazonaws.com",
    :endpoint "https://lambda.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "lambda", :region "us-east-2"},
    :ssl-common-name "lambda.us-east-2.amazonaws.com",
    :endpoint "https://lambda.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "lambda", :region "ap-southeast-2"},
    :ssl-common-name "lambda.ap-southeast-2.amazonaws.com",
    :endpoint "https://lambda.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "lambda", :region "cn-north-1"},
    :ssl-common-name "lambda.cn-north-1.amazonaws.com.cn",
    :endpoint "https://lambda.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "lambda", :region "sa-east-1"},
    :ssl-common-name "lambda.sa-east-1.amazonaws.com",
    :endpoint "https://lambda.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "lambda", :region "ap-southeast-1"},
    :ssl-common-name "lambda.ap-southeast-1.amazonaws.com",
    :endpoint "https://lambda.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "lambda", :region "ap-northeast-2"},
    :ssl-common-name "lambda.ap-northeast-2.amazonaws.com",
    :endpoint "https://lambda.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "lambda", :region "eu-west-3"},
    :ssl-common-name "lambda.eu-west-3.amazonaws.com",
    :endpoint "https://lambda.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "lambda", :region "ca-central-1"},
    :ssl-common-name "lambda.ca-central-1.amazonaws.com",
    :endpoint "https://lambda.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "lambda", :region "eu-central-1"},
    :ssl-common-name "lambda.eu-central-1.amazonaws.com",
    :endpoint "https://lambda.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "lambda", :region "eu-west-2"},
    :ssl-common-name "lambda.eu-west-2.amazonaws.com",
    :endpoint "https://lambda.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "lambda", :region "us-gov-west-1"},
    :ssl-common-name "lambda.us-gov-west-1.amazonaws.com",
    :endpoint "https://lambda.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "lambda", :region "us-west-2"},
    :ssl-common-name "lambda.us-west-2.amazonaws.com",
    :endpoint "https://lambda.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "lambda", :region "us-east-1"},
    :ssl-common-name "lambda.us-east-1.amazonaws.com",
    :endpoint "https://lambda.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "lambda", :region "us-west-1"},
    :ssl-common-name "lambda.us-west-1.amazonaws.com",
    :endpoint "https://lambda.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "lambda", :region "ap-south-1"},
    :ssl-common-name "lambda.ap-south-1.amazonaws.com",
    :endpoint "https://lambda.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/publish (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-code))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31/Runtime :portkey.aws.lambda.-2015-03-31.create-function-request/Role :portkey.aws.lambda.-2015-03-31/Handler :portkey.aws.lambda.-2015-03-31.create-function-request/Code] :opt-un [:portkey.aws.lambda.-2015-03-31/TracingConfig :portkey.aws.lambda.-2015-03-31/Timeout :portkey.aws.lambda.-2015-03-31/DeadLetterConfig :portkey.aws.lambda.-2015-03-31/Tags :portkey.aws.lambda.-2015-03-31/MemorySize :portkey.aws.lambda.-2015-03-31/KMSKeyArn :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31/Environment :portkey.aws.lambda.-2015-03-31/VpcConfig :portkey.aws.lambda.-2015-03-31.create-function-request/Publish] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/reserved-concurrent-executions (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 0 p1__30692__30693__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-mappings-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.update-alias-request/Name] :opt-un [:portkey.aws.lambda.-2015-03-31.update-alias-request/FunctionVersion :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.update-alias-request/RoutingConfig :portkey.aws.lambda.-2015-03-31.update-alias-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/unsupported-media-type-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/Type :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31/ReservedConcurrentExecutions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/EventSourceArn :portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/Marker :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tracing-config/mode (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.tracing-config/Mode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.request-too-large-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.request-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/request-too-large-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.request-too-large-exception/Type :portkey.aws.lambda.-2015-03-31.request-too-large-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-subnetidexception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-subnetidexception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-subnetidexception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-subnetidexception/Type :portkey.aws.lambda.-2015-03-31.invalid-subnetidexception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.subnetipaddress-limit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.subnetipaddress-limit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnetipaddress-limit-reached-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.subnetipaddress-limit-reached-exception/Type :portkey.aws.lambda.-2015-03-31.subnetipaddress-limit-reached-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code/zip-file (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-code (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-code/ZipFile :portkey.aws.lambda.-2015-03-31/S3Bucket :portkey.aws.lambda.-2015-03-31/S3Key :portkey.aws.lambda.-2015-03-31/S3ObjectVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/subnet-id :max-count 16) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/batch-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 1 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 140)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/precondition-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.precondition-failed-exception/Type :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/unreserved-concurrent-executions (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 0 p1__30692__30693__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/security-group-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/security-group-id :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/timeout (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 1 p1__30692__30693__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/versions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/NextMarker :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-usage/total-code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-usage/function-count (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/account-usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.account-usage/TotalCodeSize :portkey.aws.lambda.-2015-03-31.account-usage/FunctionCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/zip-file (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/publish (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/dry-run (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-function-code-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31.update-function-code-request/ZipFile :portkey.aws.lambda.-2015-03-31/S3Bucket :portkey.aws.lambda.-2015-03-31/S3Key :portkey.aws.lambda.-2015-03-31/S3ObjectVersion :portkey.aws.lambda.-2015-03-31.update-function-code-request/Publish :portkey.aws.lambda.-2015-03-31.update-function-code-request/DryRun :portkey.aws.lambda.-2015-03-31.update-function-code-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.delete-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.delete-event-source-mapping-request/UUID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variables (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/environment-variable-name :portkey.aws.lambda.-2015-03-31/environment-variable-value))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-routing-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/AdditionalVersionWeights] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.dead-letter-config/target-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/resource-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/dead-letter-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.dead-letter-config/TargetArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 128)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[^\s]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 170)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/function-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/SubnetIds :portkey.aws.lambda.-2015-03-31/SecurityGroupIds :portkey.aws.lambda.-2015-03-31/VpcId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/runtime (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"go1.x" "go1.x", :nodejs4.3-edge "nodejs4.3-edge", :go1.x "go1.x", "dotnetcore2.0" "dotnetcore2.0", :nodejs6.10 "nodejs6.10", :python3.6 "python3.6", :nodejs "nodejs", "dotnetcore1.0" "dotnetcore1.0", "java8" "java8", :nodejs8.10 "nodejs8.10", :python2.7 "python2.7", "nodejs4.3" "nodejs4.3", "python2.7" "python2.7", :dotnetcore2.0 "dotnetcore2.0", "nodejs4.3-edge" "nodejs4.3-edge", "nodejs8.10" "nodejs8.10", :java8 "java8", :nodejs4.3 "nodejs4.3", "nodejs6.10" "nodejs6.10", "python3.6" "python3.6", :dotnetcore1.0 "dotnetcore1.0", "nodejs" "nodejs"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.service-exception/Type :portkey.aws.lambda.-2015-03-31.service-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/source-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"\d{12}" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/event-source-mappings (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mappings-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/NextMarker :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/EventSourceMappings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_]+)" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/error (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-error))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment-response/Variables :portkey.aws.lambda.-2015-03-31.environment-response/Error] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 128)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(?!^[0-9]+$)([a-zA-Z0-9-_]+)" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsnot-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsnot-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmsnot-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kmsnot-found-exception/Type :portkey.aws.lambda.-2015-03-31.kmsnot-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsinvalid-state-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsinvalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmsinvalid-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kmsinvalid-state-exception/Type :portkey.aws.lambda.-2015-03-31.kmsinvalid-state-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/Type :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tags (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/tag-key :portkey.aws.lambda.-2015-03-31/tag-value))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-functions-response/NextMarker :portkey.aws.lambda.-2015-03-31.list-functions-response/Functions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/additional-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 1024)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[0-9]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/client-context (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/payload (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.invocation-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/InvocationType :portkey.aws.lambda.-2015-03-31/LogType :portkey.aws.lambda.-2015-03-31.invocation-request/ClientContext :portkey.aws.lambda.-2015-03-31.invocation-request/Payload :portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsdisabled-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsdisabled-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmsdisabled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kmsdisabled-exception/Type :portkey.aws.lambda.-2015-03-31.kmsdisabled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-response/configuration (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-response/code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-code-location))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-function-response/Configuration :portkey.aws.lambda.-2015-03-31.get-function-response/Code :portkey.aws.lambda.-2015-03-31/Tags :portkey.aws.lambda.-2015-03-31/Concurrency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-version (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"ALL" "ALL", :all "ALL"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.create-alias-request/Name :portkey.aws.lambda.-2015-03-31.create-alias-request/FunctionVersion] :opt-un [:portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.create-alias-request/RoutingConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/Type :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/sensitive-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/memory-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 128 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 3008))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/reason (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/throttle-reason))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.too-many-requests-exception/retryAfterSeconds :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/Type :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/message :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/Reason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/Type :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.get-event-source-mapping-request/UUID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsaccess-denied-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsaccess-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmsaccess-denied-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kmsaccess-denied-exception/Type :portkey.aws.lambda.-2015-03-31.kmsaccess-denied-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/source-account (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/source-owner))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/add-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31/StatementId :portkey.aws.lambda.-2015-03-31/Action :portkey.aws.lambda.-2015-03-31/Principal] :opt-un [:portkey.aws.lambda.-2015-03-31.add-permission-request/SourceAccount :portkey.aws.lambda.-2015-03-31.add-permission-request/SourceArn :portkey.aws.lambda.-2015-03-31.add-permission-request/RevisionId :portkey.aws.lambda.-2015-03-31/Qualifier :portkey.aws.lambda.-2015-03-31/EventSourceToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-account-settings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/AccountLimit :portkey.aws.lambda.-2015-03-31/AccountUsage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/throttle-reason (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {:concurrent-invocation-limit-exceeded "ConcurrentInvocationLimitExceeded", :function-invocation-rate-limit-exceeded "FunctionInvocationRateLimitExceeded", :reserved-function-invocation-rate-limit-exceeded "ReservedFunctionInvocationRateLimitExceeded", "ReservedFunctionInvocationRateLimitExceeded" "ReservedFunctionInvocationRateLimitExceeded", "ConcurrentInvocationLimitExceeded" "ConcurrentInvocationLimitExceeded", :caller-rate-limit-exceeded "CallerRateLimitExceeded", "CallerRateLimitExceeded" "CallerRateLimitExceeded", "FunctionInvocationRateLimitExceeded" "FunctionInvocationRateLimitExceeded", :reserved-function-concurrent-invocation-limit-exceeded "ReservedFunctionConcurrentInvocationLimitExceeded", "ReservedFunctionConcurrentInvocationLimitExceeded" "ReservedFunctionConcurrentInvocationLimitExceeded"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.tag-resource-request/Resource :portkey.aws.lambda.-2015-03-31/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 100)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_.]+)" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/log-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"None" "None", :none "None", "Tail" "Tail", :tail "Tail"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.get-alias-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/tag-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.enilimit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.enilimit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/enilimit-reached-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.enilimit-reached-exception/Type :portkey.aws.lambda.-2015-03-31.enilimit-reached-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/concurrency (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/ReservedConcurrentExecutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-response/statement (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/add-permission-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.add-permission-response/Statement] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.get-policy-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/weight clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/status-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/function-error (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/log-result (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/payload (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/executed-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invocation-response/StatusCode :portkey.aws.lambda.-2015-03-31.invocation-response/FunctionError :portkey.aws.lambda.-2015-03-31.invocation-response/LogResult :portkey.aws.lambda.-2015-03-31.invocation-response/Payload :portkey.aws.lambda.-2015-03-31.invocation-response/ExecutedVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-not-found-exception/Type :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-request/invoke-args (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob-stream))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invoke-async-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.invoke-async-request/FunctionName :portkey.aws.lambda.-2015-03-31.invoke-async-request/InvokeArgs] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/total-code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/code-size-unzipped (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/code-size-zipped (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/concurrent-executions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/account-limit (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.account-limit/TotalCodeSize :portkey.aws.lambda.-2015-03-31.account-limit/CodeSizeUnzipped :portkey.aws.lambda.-2015-03-31.account-limit/CodeSizeZipped :portkey.aws.lambda.-2015-03-31.account-limit/ConcurrentExecutions :portkey.aws.lambda.-2015-03-31/UnreservedConcurrentExecutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-error/error-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-error/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/sensitive-string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment-error/ErrorCode :portkey.aws.lambda.-2015-03-31.environment-error/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variable-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmskey-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(arn:aws:[a-z0-9-.]+:.*)|()" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 0 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.update-event-source-mapping-request/UUID] :opt-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31/Enabled :portkey.aws.lambda.-2015-03-31/BatchSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/alias-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__30551__30552__auto__] (if (clojure.core/sequential? p1__30551__30552__auto__) p1__30551__30552__auto__ [p1__30551__30552__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-type (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse", "DryRun" "DryRun", :dry-run "DryRun"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-response/policy (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-response/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-policy-response/Policy :portkey.aws.lambda.-2015-03-31.get-policy-response/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/blob-stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/max-list-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__30692__30693__auto__] (clojure.core/<= 1 p1__30692__30693__auto__)) (fn* [p1__30694__30695__auto__] (clojure.core/<= p1__30694__30695__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.delete-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.delete-alias-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-version-request/code-sha256 (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-version-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/publish-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31.publish-version-request/CodeSha256 :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.publish-version-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.remove-permission-request/statement-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-statement-id))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.remove-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/remove-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.remove-permission-request/StatementId] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier :portkey.aws.lambda.-2015-03-31.remove-permission-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-mode (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"Active" "Active", :active "Active", "PassThrough" "PassThrough", :pass-through "PassThrough"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.get-function-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-response/status (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/http-status))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invoke-async-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invoke-async-response/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/TracingConfig :portkey.aws.lambda.-2015-03-31/Timeout :portkey.aws.lambda.-2015-03-31/DeadLetterConfig :portkey.aws.lambda.-2015-03-31/Handler :portkey.aws.lambda.-2015-03-31/Runtime :portkey.aws.lambda.-2015-03-31/MemorySize :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/Role :portkey.aws.lambda.-2015-03-31/KMSKeyArn :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31/Environment :portkey.aws.lambda.-2015-03-31/VpcConfig :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment/Variables] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-conflict-exception/Type :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/Marker :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/master-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"ALL|[a-z]{2}(-gov)?-[a-z]+-\d{1}" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/http-status (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/Type :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/aliases (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-response/NextMarker :portkey.aws.lambda.-2015-03-31.list-aliases-response/Aliases] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variable-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[a-zA-Z]([a-zA-Z0-9_])+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/tracing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/function-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/environment (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/vpc-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/code-sha256 (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/master-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-configuration/TracingConfig :portkey.aws.lambda.-2015-03-31.function-configuration/FunctionArn :portkey.aws.lambda.-2015-03-31.function-configuration/FunctionName :portkey.aws.lambda.-2015-03-31/Timeout :portkey.aws.lambda.-2015-03-31/DeadLetterConfig :portkey.aws.lambda.-2015-03-31/Handler :portkey.aws.lambda.-2015-03-31/Runtime :portkey.aws.lambda.-2015-03-31/MemorySize :portkey.aws.lambda.-2015-03-31.function-configuration/Role :portkey.aws.lambda.-2015-03-31/KMSKeyArn :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.function-configuration/LastModified :portkey.aws.lambda.-2015-03-31.function-configuration/Environment :portkey.aws.lambda.-2015-03-31.function-configuration/CodeSize :portkey.aws.lambda.-2015-03-31.function-configuration/VpcConfig :portkey.aws.lambda.-2015-03-31.function-configuration/RevisionId :portkey.aws.lambda.-2015-03-31/Version :portkey.aws.lambda.-2015-03-31.function-configuration/CodeSha256 :portkey.aws.lambda.-2015-03-31.function-configuration/MasterArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 3 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 63)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"^[0-9A-Za-z\.\-_]*(?<!\.)$" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/SubnetIds :portkey.aws.lambda.-2015-03-31/SecurityGroupIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/qualifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 128)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(|[a-zA-Z0-9$_-]+)" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/Type :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/MasterRegion :portkey.aws.lambda.-2015-03-31/FunctionVersion :portkey.aws.lambda.-2015-03-31.list-functions-request/Marker :portkey.aws.lambda.-2015-03-31.list-functions-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(arn:aws:[a-z0-9-.]+:.*)|()" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 0 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 256)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._\-]+" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30632__auto__] (clojure.core/<= 1 (clojure.core/count s__30632__auto__))) (clojure.core/fn [s__30633__auto__] (clojure.core/< (clojure.core/count s__30633__auto__) 1024)) (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(\$LATEST|[0-9]+)" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tracing-config-response/mode (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-config-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.tracing-config-response/Mode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-configuration-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.get-function-configuration-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #".*" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/additional-version-weights (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/additional-version :portkey.aws.lambda.-2015-03-31/weight))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/alias-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.alias-configuration/AliasArn :portkey.aws.lambda.-2015-03-31.alias-configuration/Name :portkey.aws.lambda.-2015-03-31.alias-configuration/FunctionVersion :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.alias-configuration/RoutingConfig :portkey.aws.lambda.-2015-03-31.alias-configuration/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-throttled-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-throttled-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec2-throttled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec2-throttled-exception/Type :portkey.aws.lambda.-2015-03-31.ec2-throttled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-access-denied-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec2-access-denied-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec2-access-denied-exception/Type :portkey.aws.lambda.-2015-03-31.ec2-access-denied-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/starting-position (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-position))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/starting-position-timestamp (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/date))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/EventSourceArn :portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/StartingPosition] :opt-un [:portkey.aws.lambda.-2015-03-31/Enabled :portkey.aws.lambda.-2015-03-31/BatchSize :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/StartingPositionTimestamp] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/date))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/last-processing-result (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/state (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/state-transition-reason (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/UUID :portkey.aws.lambda.-2015-03-31/BatchSize :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/EventSourceArn :portkey.aws.lambda.-2015-03-31/FunctionArn :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/LastModified :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/LastProcessingResult :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/State :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/StateTransitionReason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"(lambda:[*]|lambda:[a-zA-Z]+|[*])" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/ec2-error-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec2-unexpected-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/Type :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/Message :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/EC2ErrorCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/Type :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code-location/repository-type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code-location/location (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-code-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-code-location/RepositoryType :portkey.aws.lambda.-2015-03-31.function-code-location/Location] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__30634__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__30634__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-account-settings-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-request/FunctionVersion :portkey.aws.lambda.-2015-03-31.list-aliases-request/Marker :portkey.aws.lambda.-2015-03-31.list-aliases-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-security-groupidexception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-security-groupidexception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-security-groupidexception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-security-groupidexception/Type :portkey.aws.lambda.-2015-03-31.invalid-security-groupidexception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/untag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.untag-resource-request/Resource :portkey.aws.lambda.-2015-03-31.untag-resource-request/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-position (clojure.spec.alpha/conformer (clojure.core/let [m__30630__auto__ {"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_TIMESTAMP" "AT_TIMESTAMP", :at-timestamp "AT_TIMESTAMP"}] (clojure.core/fn [s__30631__auto__] (m__30630__auto__ s__30631__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-tags-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.list-tags-request/Resource] :opt-un [] :locations {}))

(clojure.core/defn tag-resource ([tag-resource-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2017-03-31/tags/{ARN}" tag-resource-request :portkey.aws.lambda.-2015-03-31/tag-resource-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn create-alias ([create-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions/{FunctionName}/aliases" create-alias-request :portkey.aws.lambda.-2015-03-31/create-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 201 :portkey.aws.lambda.-2015-03-31/alias-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn delete-function ([delete-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}" delete-function-request :portkey.aws.lambda.-2015-03-31/delete-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception})))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-request) :ret clojure.core/true?)

(clojure.core/defn list-event-source-mappings ([] (list-event-source-mappings {})) ([list-event-source-mappings-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/event-source-mappings/" list-event-source-mappings-request :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"EventSourceArn" "EventSourceArn", "FunctionName" "FunctionName", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-event-source-mappings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response))

(clojure.core/defn delete-function-concurrency ([delete-function-concurrency-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2017-10-31/functions/{FunctionName}/concurrency" delete-function-concurrency-request :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef delete-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request) :ret clojure.core/true?)

(clojure.core/defn delete-event-source-mapping ([delete-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2015-03-31/event-source-mappings/{UUID}" delete-event-source-mapping-request :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 202 :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn invoke ([invocation-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions/{FunctionName}/invocations" invocation-request :portkey.aws.lambda.-2015-03-31/invocation-request {:payload "Payload", :move {}, :headers {"InvocationType" ["X-Amz-Invocation-Type" nil], "LogType" ["X-Amz-Log-Type" nil], "ClientContext" ["X-Amz-Client-Context" nil]}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} nil :portkey.aws.lambda.-2015-03-31/invocation-response {"UnsupportedMediaTypeException" :portkey.aws.lambda.-2015-03-31/unsupported-media-type-exception, "RequestTooLargeException" :portkey.aws.lambda.-2015-03-31/request-too-large-exception, "InvalidSubnetIDException" :portkey.aws.lambda.-2015-03-31/invalid-subnetidexception, "SubnetIPAddressLimitReachedException" :portkey.aws.lambda.-2015-03-31/subnetipaddress-limit-reached-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "KMSNotFoundException" :portkey.aws.lambda.-2015-03-31/kmsnot-found-exception, "KMSInvalidStateException" :portkey.aws.lambda.-2015-03-31/kmsinvalid-state-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception, "KMSDisabledException" :portkey.aws.lambda.-2015-03-31/kmsdisabled-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "KMSAccessDeniedException" :portkey.aws.lambda.-2015-03-31/kmsaccess-denied-exception, "ENILimitReachedException" :portkey.aws.lambda.-2015-03-31/enilimit-reached-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidZipFileException" :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception, "EC2ThrottledException" :portkey.aws.lambda.-2015-03-31/ec2-throttled-exception, "EC2AccessDeniedException" :portkey.aws.lambda.-2015-03-31/ec2-access-denied-exception, "EC2UnexpectedException" :portkey.aws.lambda.-2015-03-31/ec2-unexpected-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "InvalidSecurityGroupIDException" :portkey.aws.lambda.-2015-03-31/invalid-security-groupidexception})))
(clojure.spec.alpha/fdef invoke :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invocation-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invocation-response))

(clojure.core/defn get-account-settings ([] (get-account-settings {})) ([get-account-settings-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2016-08-19/account-settings/" get-account-settings-request :portkey.aws.lambda.-2015-03-31/get-account-settings-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/get-account-settings-response {"TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception})))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-account-settings-response))

(clojure.core/defn invoke-async ([invoke-async-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2014-11-13/functions/{FunctionName}/invoke-async/" invoke-async-request :portkey.aws.lambda.-2015-03-31/invoke-async-request {:payload "InvokeArgs", :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 202 :portkey.aws.lambda.-2015-03-31/invoke-async-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception})))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invoke-async-response))

(clojure.core/defn get-function-configuration ([get-function-configuration-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/configuration" get-function-configuration-request :portkey.aws.lambda.-2015-03-31/get-function-configuration-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn update-function-code ([update-function-code-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/code" update-function-code-request :portkey.aws.lambda.-2015-03-31/update-function-code-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-function-code :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-code-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn list-versions-by-function ([list-versions-by-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/versions" list-versions-by-function-request :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-versions-by-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response))

(clojure.core/defn update-event-source-mapping ([update-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2015-03-31/event-source-mappings/{UUID}" update-event-source-mapping-request :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 202 :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception})))
(clojure.spec.alpha/fdef update-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn list-tags ([list-tags-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2017-03-31/tags/{ARN}" list-tags-request :portkey.aws.lambda.-2015-03-31/list-tags-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {}} nil :portkey.aws.lambda.-2015-03-31/list-tags-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-tags-response))

(clojure.core/defn update-alias ([update-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" update-alias-request :portkey.aws.lambda.-2015-03-31/update-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/alias-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn get-event-source-mapping ([get-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/event-source-mappings/{UUID}" get-event-source-mapping-request :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn get-function ([get-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}" get-function-request :portkey.aws.lambda.-2015-03-31/get-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda.-2015-03-31/get-function-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-function-response))

(clojure.core/defn get-policy ([get-policy-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/policy" get-policy-request :portkey.aws.lambda.-2015-03-31/get-policy-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda.-2015-03-31/get-policy-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-policy-response))

(clojure.core/defn add-permission ([add-permission-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions/{FunctionName}/policy" add-permission-request :portkey.aws.lambda.-2015-03-31/add-permission-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 201 :portkey.aws.lambda.-2015-03-31/add-permission-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "PolicyLengthExceededException" :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/add-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/add-permission-response))

(clojure.core/defn create-event-source-mapping ([create-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/event-source-mappings/" create-event-source-mapping-request :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 202 :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception})))
(clojure.spec.alpha/fdef create-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn get-alias ([get-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" get-alias-request :portkey.aws.lambda.-2015-03-31/get-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/alias-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn list-aliases ([list-aliases-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/aliases" list-aliases-request :portkey.aws.lambda.-2015-03-31/list-aliases-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"FunctionVersion" "FunctionVersion", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2015-03-31/list-aliases-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-aliases-response))

(clojure.core/defn list-functions ([] (list-functions {})) ([list-functions-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/" list-functions-request :portkey.aws.lambda.-2015-03-31/list-functions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MasterRegion" "MasterRegion", "FunctionVersion" "FunctionVersion", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2015-03-31/list-functions-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-functions-response))

(clojure.core/defn remove-permission ([remove-permission-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}/policy/{StatementId}" remove-permission-request :portkey.aws.lambda.-2015-03-31/remove-permission-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "StatementId" "StatementId"}, :querystring {"Qualifier" "Qualifier", "RevisionId" "RevisionId"}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn delete-alias ([delete-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" delete-alias-request :portkey.aws.lambda.-2015-03-31/delete-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-alias-request) :ret clojure.core/true?)

(clojure.core/defn create-function ([create-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions" create-function-request :portkey.aws.lambda.-2015-03-31/create-function-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception})))
(clojure.spec.alpha/fdef create-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn untag-resource ([untag-resource-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2017-03-31/tags/{ARN}" untag-resource-request :portkey.aws.lambda.-2015-03-31/untag-resource-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {"tagKeys" "TagKeys"}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn publish-version ([publish-version-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions/{FunctionName}/versions" publish-version-request :portkey.aws.lambda.-2015-03-31/publish-version-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 201 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef publish-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/publish-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn put-function-concurrency ([put-function-concurrency-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2017-10-31/functions/{FunctionName}/concurrency" put-function-concurrency-request :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/concurrency {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/concurrency))

(clojure.core/defn update-function-configuration ([update-function-configuration-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/configuration" update-function-configuration-request :portkey.aws.lambda.-2015-03-31/update-function-configuration-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))
