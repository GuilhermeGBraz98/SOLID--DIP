
public class Testes {

    public static void main(String[] args) {

        WeatherTracker clima = new WeatherTracker();

        System.out.println("Teste 1, esperamos que a mensagem seja exibida\n");
        testeMobileDeviceRainy();
        System.out.println("\n\nteste 2, não é esperado nenhuma mensagem");
        testeMobileDeviceSunny();
        System.out.println("\nteste 3, não é esperado nenhuma mensagem");
        testeEmailClientRainy();
        System.out.println("\nTeste 4, esperamos que a mensagem seja exibida\n");
        testeEmailClientSunny();
    }

    public static void testeMobileDeviceRainy() {
        WeatherTracker clima = new WeatherTracker();
        clima.setCurrentConditions("rainy");
        clima.notify(new MobileDevice());
    }


    public static void testeMobileDeviceSunny() {
        WeatherTracker clima = new WeatherTracker();
        clima.setCurrentConditions("sunny");
        clima.notify(new MobileDevice());
    }

    public static void testeEmailClientRainy() {
        WeatherTracker clima = new WeatherTracker();
        clima.setCurrentConditions("rainy");
        clima.notify(new EmailClient());
    }

    public static void testeEmailClientSunny() {
        WeatherTracker clima = new WeatherTracker();
        clima.setCurrentConditions("sunny");
        clima.notify(new EmailClient());
    }
}
