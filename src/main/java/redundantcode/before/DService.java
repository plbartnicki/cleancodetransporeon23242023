package redundantcode.before;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DService
{
	public static Set<String> fun1( List<String> list, List<String> words) {
		Set<String> res = list.stream().filter( s -> s.startsWith( "A" ) ||  s.startsWith( "B" ))
			.map( String::toUpperCase )
			.collect( Collectors.toSet());

		words.forEach( res::remove );
		return res;
	}

	public static Set<String> fun2(List<String> list, List<String> words) {
		Set<String> res = list.stream().filter( s -> s.startsWith( "A" ) ||  s.startsWith( "B" ))
			.map( String::toUpperCase )
			.collect( Collectors.toSet());

		words.forEach( res::add );
		return res;
	}


}
