package net.toregard.customer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CustomerApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun testRenameCommit(){
		assertThat(true).isTrue();
	}

}
