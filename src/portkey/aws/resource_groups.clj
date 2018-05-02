(ns portkey.aws.resource-groups (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.resource-groups.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.internal-server-error-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/method-not-allowed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.method-not-allowed-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.unauthorized-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups/Group] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/list-groups-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups/MaxResults :portkey.aws.resource-groups/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-query-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.bad-request-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.resource-query/type (clojure.spec.alpha/and :portkey.aws.resource-groups/query-type))
(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-query (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.resource-query/Type :portkey.aws.resource-groups/Query] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-identifier-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/resource-identifier) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/forbidden-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.forbidden-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/group) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-query-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups/GroupQuery] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-output/keys (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/untag-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.untag-output/Arn :portkey.aws.resource-groups.untag-output/Keys] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-group-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-group-resources-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.list-group-resources-output/ResourceIdentifiers :portkey.aws.resource-groups/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tags (clojure.spec.alpha/map-of :portkey.aws.resource-groups/tag-key :portkey.aws.resource-groups/tag-value))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-query (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/GroupName :portkey.aws.resource-groups/ResourceQuery] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 128)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\.-]+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.update-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/GroupName] :opt-un [:portkey.aws.resource-groups.update-group-input/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.create-group-input/name (clojure.spec.alpha/and :portkey.aws.resource-groups/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.create-group-input/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/create-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.create-group-input/Name :portkey.aws.resource-groups/ResourceQuery] :opt-un [:portkey.aws.resource-groups.create-group-input/Description :portkey.aws.resource-groups/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.list-groups-output/groups (clojure.spec.alpha/and :portkey.aws.resource-groups/group-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/list-groups-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.list-groups-output/Groups :portkey.aws.resource-groups/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.resource-groups/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 1 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.too-many-requests-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.tag-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.tag-output/Arn :portkey.aws.resource-groups/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.get-tags-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/get-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.get-tags-input/Arn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.resource-groups/tag-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/search-resources-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/ResourceQuery] :opt-un [:portkey.aws.resource-groups/MaxResults :portkey.aws.resource-groups/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13961__auto__] (clojure.core/<= 0 (clojure.core/count s__13961__auto__))) (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 256)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.search-resources-output/resource-identifiers (clojure.spec.alpha/and :portkey.aws.resource-groups/resource-identifier-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/search-resources-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.search-resources-output/ResourceIdentifiers :portkey.aws.resource-groups/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups/Group] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.resource-groups/error-message))
(clojure.spec.alpha/def :portkey.aws.resource-groups/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/delete-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/update-group-query-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/GroupName :portkey.aws.resource-groups/ResourceQuery] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"AWS::[a-zA-Z0-9]+::\w+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-identifier (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups/ResourceArn :portkey.aws.resource-groups/ResourceType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.tag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/tag-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.tag-input/Arn :portkey.aws.resource-groups/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/create-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups/Group :portkey.aws.resource-groups/ResourceQuery :portkey.aws.resource-groups/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/list-group-resources-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/GroupName] :opt-un [:portkey.aws.resource-groups/MaxResults :portkey.aws.resource-groups/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/query-type (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"TAG_FILTERS_1_0" "TAG_FILTERS_1_0", :tag-filters-1-0 "TAG_FILTERS_1_0"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.resource-groups/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"arn:aws:[a-z0-9]*:([a-z]{2}-[a-z]+-\d{1})?:([0-9]{12})?:.+" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"arn:aws:resource-groups:[a-z]{2}-[a-z]+-\d{1}:[0-9]{12}:group/[a-zA-Z0-9_\.-]{1,128}" s__13963__auto__))))

(clojure.spec.alpha/def :portkey.aws.resource-groups/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__14021__14022__auto__] (clojure.core/<= 1 p1__14021__14022__auto__)) (fn* [p1__14023__14024__auto__] (clojure.core/<= p1__14023__14024__auto__ 50))))

(clojure.spec.alpha/def :portkey.aws.resource-groups.get-tags-output/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups/get-tags-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups.get-tags-output/Arn :portkey.aws.resource-groups/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.group/name (clojure.spec.alpha/and :portkey.aws.resource-groups/group-name))
(clojure.spec.alpha/def :portkey.aws.resource-groups.group/description (clojure.spec.alpha/and :portkey.aws.resource-groups/group-description))
(clojure.spec.alpha/def :portkey.aws.resource-groups/group (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups/GroupArn :portkey.aws.resource-groups.group/Name] :opt-un [:portkey.aws.resource-groups.group/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/get-group-query-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups/GroupQuery] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/delete-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.resource-groups/Group] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-input/arn (clojure.spec.alpha/and :portkey.aws.resource-groups/group-arn))
(clojure.spec.alpha/def :portkey.aws.resource-groups.untag-input/keys (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.resource-groups/untag-input (portkey.aws/json-keys :req-un [:portkey.aws.resource-groups.untag-input/Arn :portkey.aws.resource-groups.untag-input/Keys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.resource-groups/group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13962__auto__] (clojure.core/< (clojure.core/count s__13962__auto__) 512)) (clojure.core/fn [s__13963__auto__] (clojure.core/re-matches #"[\sa-zA-Z0-9_\.-]+" s__13963__auto__))))

(clojure.core/defn delete-group ([delete-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "DELETE" "/groups/{GroupName}" delete-group-input :portkey.aws.resource-groups/delete-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups/delete-group-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/delete-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/delete-group-output))

(clojure.core/defn get-tags ([get-tags-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "GET" "/resources/{Arn}/tags" get-tags-input :portkey.aws.resource-groups/get-tags-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups/get-tags-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-tags :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-tags-output))

(clojure.core/defn list-groups ([] (list-groups {})) ([list-groups-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "GET" "/groups" list-groups-input :portkey.aws.resource-groups/list-groups-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} nil :portkey.aws.resource-groups/list-groups-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.resource-groups/list-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/list-groups-output))

(clojure.core/defn untag ([untag-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "PATCH" "/resources/{Arn}/tags" untag-input :portkey.aws.resource-groups/untag-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups/untag-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef untag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/untag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/untag-output))

(clojure.core/defn update-group-query ([update-group-query-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "PUT" "/groups/{GroupName}/query" update-group-query-input :portkey.aws.resource-groups/update-group-query-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups/update-group-query-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/update-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/update-group-query-output))

(clojure.core/defn get-group ([get-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "GET" "/groups/{GroupName}" get-group-input :portkey.aws.resource-groups/get-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups/get-group-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-group-output))

(clojure.core/defn update-group ([update-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "PUT" "/groups/{GroupName}" update-group-input :portkey.aws.resource-groups/update-group-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups/update-group-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/update-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/update-group-output))

(clojure.core/defn get-group-query ([get-group-query-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "GET" "/groups/{GroupName}/query" get-group-query-input :portkey.aws.resource-groups/get-group-query-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {}} nil :portkey.aws.resource-groups/get-group-query-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-group-query :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/get-group-query-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/get-group-query-output))

(clojure.core/defn search-resources ([search-resources-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "POST" "/resources/search" search-resources-input :portkey.aws.resource-groups/search-resources-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.resource-groups/search-resources-output {"UnauthorizedException" :portkey.aws.resource-groups/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef search-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/search-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/search-resources-output))

(clojure.core/defn tag ([tag-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "PUT" "/resources/{Arn}/tags" tag-input :portkey.aws.resource-groups/tag-input {:payload nil, :move {}, :headers {}, :uri {"Arn" "Arn"}, :querystring {}} nil :portkey.aws.resource-groups/tag-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef tag :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/tag-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/tag-output))

(clojure.core/defn list-group-resources ([list-group-resources-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "GET" "/groups/{GroupName}/resource-identifiers" list-group-resources-input :portkey.aws.resource-groups/list-group-resources-input {:payload nil, :move {}, :headers {}, :uri {"GroupName" "GroupName"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} nil :portkey.aws.resource-groups/list-group-resources-output {"UnauthorizedException" :portkey.aws.resource-groups/unauthorized-exception, "BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "NotFoundException" :portkey.aws.resource-groups/not-found-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-group-resources :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/list-group-resources-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/list-group-resources-output))

(clojure.core/defn create-group ([create-group-input] (portkey.aws/-rest-json-call portkey.aws.resource-groups/endpoints "POST" "/groups" create-group-input :portkey.aws.resource-groups/create-group-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.resource-groups/create-group-output {"BadRequestException" :portkey.aws.resource-groups/bad-request-exception, "ForbiddenException" :portkey.aws.resource-groups/forbidden-exception, "MethodNotAllowedException" :portkey.aws.resource-groups/method-not-allowed-exception, "TooManyRequestsException" :portkey.aws.resource-groups/too-many-requests-exception, "InternalServerErrorException" :portkey.aws.resource-groups/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.resource-groups/create-group-input) :ret (clojure.spec.alpha/and :portkey.aws.resource-groups/create-group-output))
