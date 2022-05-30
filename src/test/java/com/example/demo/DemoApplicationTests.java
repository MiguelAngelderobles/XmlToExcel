package com.example.demo;

import com.example.demo.service.EmpresaService;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DemoApplicationTests  extends TestCase {

	@Mock
	EmpresaService empresaService;

	@Test
	void contextLoads() {
	}

}
