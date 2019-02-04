package com.fg.menu.services;

import com.fg.Application;
import com.fg.character.services.CharacterService;
import com.fg.game.services.entities.Game;
import com.fg.game.services.entities.Player;
import com.fg.game.services.services.GameService;
import com.fg.game.services.services.IGame;
import com.fg.instructions.Instructions;
import com.fg.menu.MenuEnum;
import com.fg.utils.FileUtils;
import com.fg.utils.ScannerUtils;

/**
 * Created by raheela on 01/02/2019.
 */
public class MenuService implements IMenu {

    private CharacterService characterService = new CharacterService();
    private IGame gameService = new GameService();

    @Override
    public void buildMenu() {
        showWelcomeMessage();
        showMenu();
    }

    private MenuEnum menuInput() {
        System.out.println("1. Add A Character ");
        System.out.println("2. Explore ");
        System.out.println("3. Play GameService ");
        System.out.println("4. Resume GameService ");
        System.out.println("5. Exit ");
        System.out.print("Please Enter Menu option : ");
        return MenuEnum.valueOf(ScannerUtils.getNextInt());
    }

    private void showWelcomeMessage() {
        System.out.println("************Welcome to the Taken 7 ************");
        System.out.println("************ MenuService ************");
    }

    private void showMenu() {
        MenuEnum menuEnum = menuInput();
        if (menuEnum == null) {
            System.out.println("You've selected an invalid option.");
        } else {

            switch (menuEnum) {
                case ADD_CHARACTER:
                    characterService.addCharacter();
                    break;
                case EXPLORE:
                    Instructions.showInstructions();
                    break;
                case PLAY:
                    Player player = new Player(characterService.chooseCharacter());
                    Game game = new Game(player);
                    gameService.init(game);
                    gameService.play(game);
                    break;
                case RESUME:
                    Game gameObject = FileUtils.fileToObject();
                    if (gameObject != null) {
                        gameService.resume(gameObject);
                    }
                    break;
                case EXIT:
                    Application.exitApplication();
                default:
                    System.out.println(" Please Enter Press from 1 , 2 or 3 buttons");
                    break;
            }
        }
        showMenu();
    }

}
