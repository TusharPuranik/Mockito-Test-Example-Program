package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		//dataServiceMock.retrieveAllData() => new int[] {25,10,5};
		when(dataServiceMock.retrieveAllData())
			.thenReturn(new int[] {25,10,5});
		assertEquals(25,businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllData_OneValScenario() {
		
		//dataServiceMock.retrieveAllData() => new int[] {25,10,5};
		when(dataServiceMock.retrieveAllData())
			.thenReturn(new int[] {55});
		assertEquals(55,businessImpl.findTheGreatestFromAllData());
	}
	
	
}