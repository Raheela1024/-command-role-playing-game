package com.fg.character.services;

import com.fg.actions.entities.*;
import com.fg.actions.services.ActionService;
import com.fg.character.Character;
import com.fg.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by raheela on 01/02/2019.
 */
public class CharacterService {

    public ArrayList<Character> characters = new ArrayList<>();
    public ActionService actionService = new ActionService();

    public CharacterService() {
        characters.add(new Character(1, "Bat Man",
                Arrays.asList(
                        new KickAction(1, "Kick"),
                        new PunchAction(2, "Punch"),
                        new KickBlockAction(3, "Kick Block"),
                        new PushBackAction(4, "Push Back"))));

        characters.add(new Character(2, "Iron Man",
                Arrays.asList(
                        new PunchBlockAction(1, "Punch Block"),
                        new KickAction(2, "Kick"),
                        new PunchBlockAction(3, "Kick Block"),
                        new PushBackAction(4, "Push Back"))));

        characters.add(new Character(3, "Spider Man",
                Arrays.asList(
                        new KickBlockAction(1, "Kick Block"),
                        new MoveAction(2, "Move"),
                        new PunchBlockAction(3, "Punch Block"),
                        new PushBackAction(4, "Push Back"))));
    }

    public void addCharacter() {
        System.out.println("Please Enter Character Name :");
        String characterName = ScannerUtils.getNextString();
        characters.add(new Character(characters.size() + 1, characterName, actionService.getActions()));
        System.out.println("Your Character " + characterName + " has been save Successfully!!");

    }

    public Character getCharacter(int id) {
        return characters.stream()
                .filter(character -> character.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    public void showCharacters() {
        characters.forEach(character ->
                System.out.println(character.getId() + ". " + character.getName()));
    }

    public Character chooseCharacter() {
        System.out.println("Choose the Character :");
        showCharacters();
        System.out.print("Please Enter Your Selected Character Number : ");
        return getCharacter(ScannerUtils.getNextInt());
    }

}
