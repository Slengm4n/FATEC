package com.example.cliente;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClienteApplicationTests {

	@Autowired
	private DataSource dataSource;     
	@Test
	void contextLoads() throws SQLException {         // Se este comando não lançar erro, a conexão está ativa        
	assertThat(dataSource.getConnection().isValid(1000)).isTrue();         
	System.out.println("Conexão estabelecida com sucesso: " + dataSource.getConnection().getMetaData().getDatabaseProductName());     
}
 

}
