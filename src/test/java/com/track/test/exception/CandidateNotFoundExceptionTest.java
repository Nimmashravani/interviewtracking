package com.track.test.exception;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

import com.track.entity.Candidate;
import com.track.exception.CandidateNotFoundException;
import com.track.repository.CandidateRepository;
import com.track.serviceimpl.CandidateServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CandidateNotFoundExceptionTest {

	@Autowired
	public CandidateServiceImpl candidateServiceImpl;

	public CandidateNotFoundException expectException;

	@MockBean
	private CandidateRepository candidateRepo;

	private CrudRepository<Candidate, Integer> defaultQuarterService;

	@Test
	public void throwExceptionWhenQuarterIdNotFound() {
		/*
		 * int id = anyInt();
		 * when(candidateRepo.findById(id)).thenReturn(Optional.empty());
		 * assertThatAnExceptionWasThrown(String.
		 * format("candidate does not exist for id = %s!", id));
		 */
		int id = anyInt();
		assertThatThrownBy(() -> defaultQuarterService.findById(id))
	    .isInstanceOf(CandidateNotFoundException.class)
	    .hasMessageContaining("No such candidate");
		
	}

	/*
	 * public void assertThatAnExceptionWasThrown(String errorMsg) {
	 * 
	 * expectException.expect(RuntimeException.class);
	 * expectException.expectMessage(errorMsg);
	 * 
	 * 
	 * 
	 * expectException.getMessage(); }
	 */

}
