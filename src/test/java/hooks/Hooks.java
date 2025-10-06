package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {
    @Before
    public void beforeScenario() {
        System.out.println("Starting scenario...");
        // inicialização, logs, drivers, etc
    }

    @After
    public void afterScenario() {
        System.out.println("Scenario finished.");
        // fechar drivers, limpar dados, etc
    }
}
