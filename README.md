
http://localhost:8080/api/FhirSentReceivedFirst/0
http://localhost:8080/api/test

Query Methods
The query parser will match the following:

findBy.. :  
	returns a list
			findBy..Is, 
			findBy..Equals, 
			findBy..Not, 
			findBy..Like, 
			findBy..NotLike, 
			findBy..StartingWith, 
			findBy..EndingWith, 
			findBy..ContainingFor 
	number data types: 
			findBy..LessThan, 
			findBy..LessThanEquals, 
			findBy..GreaterThan, 
			findBy..GreaterThanEqual
	Date comparison: 
			findBy..Before, 
			findBy..After, 
			findBy..Between
	For boolean comparison: 
			findBy..True, 
			findBy..False
	Null checks: 
			findBy..IsNull, 
			findBy..IsNotNull
	For collection comparison, In, notIn: 
			findBy..In(Collection str), 
			findBy..NotIn(Collection str)
	Ignore case: 
			findBy..IgnoreCase, 
			findBy..StartingWith
	IgnoreCaseOrder : 
			findBy..OrderByCountryAsc, 
			findBy..OrderByCountryDesc
	To limit the results:
			findFirstBy.., 
			findTop5By.., 
			findDistinct..By..s

queryBy..
readBy..
countBy..
getBy..

'And' and 'Or':
This criterion uses the JPA entity attributes names. 
And, this includes multiple criteria combined with 'And' and 'Or' 
	EX: findByStateAndCount(String state, String countrys).


@Query("select u from User u where u.age > :age1 and u.age < :age2")
List<User> queryByAgeRange(@Param("age1") int age1, @Param("age2") int age2);


[Named Query]




