package pe.qsystem.prueba.domain.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateUtil {

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

	public static <T> Predicate<T> distinctByKeys(Function<? super T, Object>... keyExtractors) {
		Map<List<Object>, Boolean> map = new ConcurrentHashMap<>();

		return t -> {
			final List<Object> keys = Arrays.stream(keyExtractors)
					.map(ke -> ke.apply(t))
					.collect(Collectors.toList());

			return map.putIfAbsent(keys, Boolean.TRUE) == null;
		};
	}

}
