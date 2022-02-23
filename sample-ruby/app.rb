require 'rubygems'
require 'bundler/setup'
require 'sinatra'

configure do
  set :port, ENV['PORT']
  set :bind, '0.0.0.0'
end

get '/' do
  'hello, world'
end
