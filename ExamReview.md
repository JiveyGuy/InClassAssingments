**Autboxing**{
  >Wrapper
  >Only happens when we deal with a wrapper class 
  -A wrapper is a object that shadows primitive datatype
  
  -Explain it deals with wrappers that have a 1-> relation with primitives
  -Is used for using primitives in generics
  -Also when you need to reffernce instead of value  
}

`Don''t assume I know everything, explain everything, the more the better.`

**O()**{
  Categorize algorithms that have those values
  ```
  1
  log n
  n^2
  2^n
  ```
  and explain behavior when they grow by a factor of 10
  * Categorize means describe all 
  * 1 is of no preformance conern, may have a buvg in logic, input makes no difference, may be charactorized of the wrong code
  * Logarithmatically looped, eachloop will reduce the number of required iterations during each iterations Run time may be n - logn but it is always less than n, all you can say is less than n and more than 1. 
  * nlogn is bewteen n^2 and log n
  * n^2 is quadratic, increases exponentially, often two nested loops although can show up without loops.
  * 2^n is not usefull, runtime is far too long, not worth the time, just find a better alrgoithm
  
}

**Interfaces**{
 * Comparable
 * Iterator
 * Iteratorable
 
 know them and understand thier requirements
 
 Comparable needs `compareTo()` Itorator needs `hasNext()`, `next`, `remove`
 
 Iterator needs a `itorator` object
 
 >public boolean hasNext(){
 > return true;
 >}
 
Be able to explain that this means that this object always has next, very unusual.
  
Know how to make a compare too, returns 0 if equal, -n if less or +n if greater than. 

}

**Modify**{
>Class Node {
>private Node next;
>private int value;
>public Node( int value ){
>  this.value = value;
>}

>class Node <Generic>
>{
>  private Node next;
>  private Generic value;
>  private Node( Generic value ){
>    this.value = value;
>  }
}
**You cannot instanciate generics, & you cannot create arrays of generics**
}

**Word problem** {
  Consider current computer technology with cache we use int int data ttpes is 4 bytes and we us 4kb page size we find an optimnization in our O() = n^2 n square algorith, that allowed us ot move a memeory access outside of the inner loop in the inner loop the lagorith accusses the data sequenriallu and esperimnce a cjacje ,iss ebeur ti,es we cross a page boundray otheOutside of the inner loop it exspericmnes a cache ,miss every other time we miss. What n value will the amotipixaTION MATCH MISS MTCH BENEFIT OF THE OPTIMIZQATION. 
}

>>Get a better understanding of cache and cacheline

**Describe reflexivity, describe symetry, and transitivity**{
  * used to describe connectivity inside of a network
  * Networks not only internet but also driving and connecting abstract poirnt
  
  Reflexivity = p -> p || when a node is connected to itself,  
  
  Symetry = P<-->P || Both nodes are connected to eachother, but nodes may not connected to themselves. 
  
  Transitivty = P->Q->R->P || Gendered network, connections are one way 
}

>>>>>>>>PRIMITAVE ARE INTILIZED TO 0 or NULL

function algrotim(3)
if length(a) < 3
  return a(length(a+1) / 2)
integer middle = length(a) / 2
return algorithm(a[middle+1..length(a)])
  algorithm(a[1..middle]) +
end
