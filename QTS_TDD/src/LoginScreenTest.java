import static org.junit.Assert.*; // Importa métodos estáticos da classe Assert do JUnit
import org.junit.Test; // Importa a classe de teste do JUnit

public class LoginScreenTest { // Declaração da classe LoginScreenTest

	@Test // Anotação indicando que o método é um caso de teste
	public void testSuccessfulLogin() { // Método para testar login bem-sucedido
		LoginScreen loginScreen = new LoginScreen(); // Cria uma instância de LoginScreen
		assertTrue(loginScreen.login("john", "password123")); // Verifica se o login com credenciais corretas é bem-sucedido
	}
	
	@Test // Anotação indicando que o método é um caso de teste
	public void testFailedLogin() { // Método para testar login malsucedido
		LoginScreen loginScreen = new LoginScreen(); // Cria uma instância de LoginScreen
		assertFalse(loginScreen.login("john", "wrongpassword")); // Verifica se o login com credenciais incorretas falha
	}
	
	@Test // Anotação indicando que o método é um caso de teste
	public void testAddUser() { // Método para testar adição de um novo usuário
		LoginScreen loginScreen = new LoginScreen(); // Cria uma instância de LoginScreen
		loginScreen.addUser("testuser", "testpassword"); // Adiciona um novo usuário
		assertTrue(loginScreen.login("testuser", "testpassword")); // Verifica se o login com o novo usuário adicionado é bem-sucedido
	}

}
