###Streaming Algorithms for XPath

> The objective of this programming assignment is to be able to implement and analyze efficient algorithms for fragments of XPath queries. 

1. Preliminaries
	
	```
	0|1 <whitespace> element1
  	```
  	where 0|1 is a bit indicating a startElement or endElement event respectively, and element is the name of the element.
	
	Implement a streaming algorithm for XPath queries of the form 

	<p style="text-align: center;">//e<sub>1</sub>/e<sub>2</sub>/.../e<sub>n</sub></p>
		
	where e<sub>i</sub> are element names.
	* Assignment 2 - LazyDFA

	Implement a streaming algorithm using the lazy DFA method explained in 
	<p style="text-align: center;">//p<sub>1</sub>//p<sub>2</sub>//...//p<sub>n</sub></p>
	<p style="text-align: center;">e<sub>i1</sub>/e<sub>i2</sub>/.../e<sub>im</sub></p>
	and e<sub>ij</sub> are element names.
	
3. Execution
	* Compile 
	
	```
	ant compile
	```
	
	* Create file jar

	```
	ant jar
	```
	
	* Execute file jar

	```
	ant run -Darg0=<path of xml file> -Darg1=<xpath query>
	```
	
	eg:
	
	```
	ant run -Darg0=test/input.txt -Darg1=//a
	```
	
	* Delete files
	
	```
	ant clean
	```