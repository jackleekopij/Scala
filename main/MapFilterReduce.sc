val fruit_list: List[String] = List("Jack", "and", "the", "beanstalk.")

// Filter by the length of the string
val story_cut_short: List[String] = fruit_list.filter(_.length > 3)

// Map a numeric list to a cube
val numeric_list: List[Int] = List(1,2,3,5,7,9)

val cubed_list: List[Int] =   numeric_list.map( x => x*x*x)

//
