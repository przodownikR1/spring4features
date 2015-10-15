package pl.java.scalatech.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import groovy.transform.ToString;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@ToString
@Data

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Company {
	@Autowired
	private final @NonNull List<Person> people;
 
}
