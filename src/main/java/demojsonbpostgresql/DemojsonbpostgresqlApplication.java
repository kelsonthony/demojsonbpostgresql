package demojsonbpostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DemojsonbpostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojsonbpostgresqlApplication.class, args);
	}
	
	/*
	 * @Configuration static class OktaOAuth2WebSecurityConfigurerAdapter extends
	 * WebSecurityConfigurerAdapter {
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception { http
	 * .authorizeRequests().anyRequest().authenticated() .and()
	 * .oauth2ResourceServer().jwt(); } }
	 */

}
