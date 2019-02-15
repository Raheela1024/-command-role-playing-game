package com.fg.character.services;

import com.fg.character.Character;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class CharacterServiceTest {

    @InjectMocks
    private CharacterService characterService;

    @Test
    public void testAddCharacter() {
        int characterSize = characterService.characters.size();
        String inputData = "Test Character";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));
        characterService.addCharacter();
        Assert.assertEquals(characterSize + 1, characterService.characters.size());
    }

    @Test
    public void testGetCharacter() {
        Character character = characterService.getCharacter(1);
        Assert.assertNotNull(character);
    }

    @Test
    public void testShowCharacters() {
        characterService.showCharacters();
    }


    @Test
    public void testChooseCharacter() {
        String inputData = "2\n 2\n Test Character";
        System.setIn(new java.io.ByteArrayInputStream(inputData.getBytes()));

        Character character = characterService.chooseCharacter();
        Assert.assertNotNull(character);
    }
}
