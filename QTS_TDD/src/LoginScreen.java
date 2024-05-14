import java.util.HashMap; // Importa a classe HashMap para utilizar um mapa chave-valor
import java.util.Map; // Importa a interface Map para trabalhar com mapas

public class LoginScreen { // Declaração da classe LoginScreen
	private Map<String, String> userDatabase; // Declaração de um mapa para armazenar usuários e senhas
	
public LoginScreen() { // Construtor da classe LoginScreen
	userDatabase = new HashMap<>(); // Inicializa o mapa como um HashMap vazio
	userDatabase.put("john", "password123"); // Adiciona um usuário e senha ao mapa
	userDatabase.put("alice", "securepass"); // Adiciona outro usuário e senha ao mapa
}
	

	public boolean login(String username, String password) { // Método para fazer login
	if(userDatabase.containsKey(username)) { // Verifica se o usuário existe no mapa
		String storedPassword = userDatabase.get(username); // Obtém a senha armazenada para o usuário
		if(storedPassword.equals(password)) { // Verifica se a senha fornecida corresponde à senha armazenada
			return true; // Retorna verdadeiro se o login for bem-sucedido
		}
	}
		return false; // Retorna falso se o login falhar
	}

	public void addUser(String username, String password) { // Método para adicionar um novo usuário
		userDatabase.put(username, password); // Adiciona o novo usuário e senha ao mapa
	}
}
