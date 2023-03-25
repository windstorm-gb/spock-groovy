package com.snk

import groovyx.net.http.RESTClient
import spock.lang.Specification

class SpockTest extends Specification {
	def url='https://jsonplaceholder.typicode.com/todos/1'
	def client = new RESTClient(url)
	
	def "getting data" (){
		def response = client.get(
			requestContentType: "application/json",
			)
			println response.getData()
	}
}
