package com.coffeemachine.display_errors;

import junit.framework.TestCase;
import com.coffeemachine.Actionwords;

public class DescalingTest extends TestCase {

    public Actionwords actionwords = new Actionwords();
    protected void setUp() throws Exception {
        super.setUp();

        // Given I handle coffee grounds
        actionwords.iHandleCoffeeGrounds();
        // And I handle beans
        actionwords.iHandleBeans();
        // And I handle water tank
        actionwords.iHandleWaterTank();
    }


    public void testDescalingIsNeededAfter500Coffees() {
        // Given the coffee machine is started
        actionwords.theCoffeeMachineIsStarted();
        // When I take "500" coffees
        actionwords.iTakeCoffeeNumberCoffees(500);
        // Then A notification about descaling is required
        actionwords.aNotificationAboutDescalingIsRequired();
    }
}