
package Modelo;

/**
 *
 * @author Juan Bedoya
 */
public class Ingresar {
      private final int intentosMaximos = 3;
    private int limiteIntentos = 0;
    private String username = "root";
    private String password = "1234";
    

    public Ingresar() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validateCredentials(String enteredUsername, String enteredPassword) {
        System.out.println("Entered Username: " + enteredUsername);
        System.out.println("Entered Password: " + enteredPassword);

        if (limiteIntentos >= intentosMaximos) {
            System.out.println("Has exedido e numero de intentos vuelve mas tarde");
            return false; // Cuenta Bloqueada
        }

        boolean isValid = username.equals(enteredUsername) && password.equals(enteredPassword);

        if (isValid) {
            System.out.println("INGRESASTES CORRECTAMENTE");
            // Credenciales correctas
            resetAttempts();
        } else {
            //maximo de intentos
            System.out.println("Intentos que te quedan:" + (intentosMaximos - limiteIntentos));
            limiteIntentos++;
        }

        return isValid;
    }

    public void resetAttempts() {
        limiteIntentos = 0;
    }

    public int getRemainingAttempts() {
        return intentosMaximos - limiteIntentos;
    }
}
