(ns portkey.aws.sqs.-2012-11-05 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "sqs", :region "ap-northeast-1"},
    :ssl-common-name "ap-northeast-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sqs", :region "eu-west-1"},
    :ssl-common-name "eu-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sqs", :region "us-east-2"},
    :ssl-common-name "us-east-2.queue.amazonaws.com",
    :endpoint "https://sqs.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "sqs", :region "ap-southeast-2"},
    :ssl-common-name "ap-southeast-2.queue.amazonaws.com",
    :endpoint "https://sqs.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "sqs", :region "cn-north-1"},
    :ssl-common-name "cn-north-1.queue.amazonaws.com.cn",
    :endpoint "https://sqs.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "sqs", :region "sa-east-1"},
    :ssl-common-name "sa-east-1.queue.amazonaws.com",
    :endpoint "https://sqs.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "sqs", :region "ap-southeast-1"},
    :ssl-common-name "ap-southeast-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "sqs", :region "cn-northwest-1"},
    :ssl-common-name "cn-northwest-1.queue.amazonaws.com.cn",
    :endpoint "https://sqs.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "sqs", :region "ap-northeast-2"},
    :ssl-common-name "ap-northeast-2.queue.amazonaws.com",
    :endpoint "https://sqs.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "sqs", :region "eu-west-3"},
    :ssl-common-name "eu-west-3.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "sqs", :region "ca-central-1"},
    :ssl-common-name "ca-central-1.queue.amazonaws.com",
    :endpoint "https://sqs.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "sqs", :region "eu-central-1"},
    :ssl-common-name "eu-central-1.queue.amazonaws.com",
    :endpoint "https://sqs.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "sqs", :region "eu-west-2"},
    :ssl-common-name "eu-west-2.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "sqs", :region "us-gov-west-1"},
    :ssl-common-name "us-gov-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sqs", :region "us-west-2"},
    :ssl-common-name "us-west-2.queue.amazonaws.com",
    :endpoint "https://sqs.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sqs", :region "us-east-1"},
    :ssl-common-name "queue.amazonaws.com",
    :endpoint "https://sqs.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "sqs", :region "us-west-1"},
    :ssl-common-name "us-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "sqs", :region "ap-south-1"},
    :ssl-common-name "ap-south-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "query")
