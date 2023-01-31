/*
@author kmodelewski.com
*/

//List declaration
val list = List(1,2,3)
val list_1: List[String] = List("Hey", "Hello")

/*
LIST METHODS

head: This method returns the first element of the scala list.
tail: This method returns all the elements except the first.
isEmpty: This method checks if the list is empty in which case it returns True else False.
fill(): This method creates a uniform list consisting of zero or more copies of the specified element.
reverse: This method reverses the element of the list.
$:::$ or $.:::$ or .concat(): Concatenates two or more lists.

tabulate(): This method can tabulate a list.
 */

list::: list_1 //adding two lists
List.concat(list, list_1) //good way to add more lists

val l1 = List(0)
List.fill(5)(l1) //five time List(0)
/*
docs method fill, two parameter method with the return type
collection CC[A]
override def fill[A](n:int)(elem =>A): CC[A]
*/