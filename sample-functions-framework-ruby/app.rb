require "functions_framework"

FunctionsFramework.http("hello") do |request|
  "hello, world"
end