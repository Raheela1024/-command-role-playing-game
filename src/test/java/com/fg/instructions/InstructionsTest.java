package com.fg.instructions;

import com.fg.instructions.Instructions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class InstructionsTest {

    @Test
    public void testShowInstructions() {
        Instructions.showInstructions();
    }
}
