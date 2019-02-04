package com.fg.instructions;

/**
 * Created by raheela on 01/02/2019.
 */
public class Instructions {

    public static final String ADD_CHARACTER = "How I can create a character!!";
    public static final String STEPS_TO_ADD_CHARACTER = "You can Press 1 from menu and provide the character name.";

    public static final String PLAY_GAME = "How I can Play a GameService!!";
    public static final String STEPS_TO_PLAY_GAME = "You need to Press 3 to Play a GameService.";

    public static final String CHOOSE_CHARACTER = "How I can Choose a character!!";
    public static final String STEPS_TO_CHOOSE_CHARACTER = "When GameService is Loaded You need to Press Key for the character that you want to choose.";

    public static final String SELECT_ACTION = "How I can perform an action!!";
    public static final String STEPS_TO_SELECT_ACTION = "Each Character has a set to Actions so you can choose action from provided actions.";

    public static final String SAVE_GAME = "How I can Save a GameService!!";
    public static final String STEPS_TO_SAVE_GAME = "You need to Press 's' to Save a GameService.";

    public static final String RESUME_GAME = "How I can Resume a GameService!!";
    public static final String STEPS_TO_RESUME_GAME = "You need to Press 4 if resume option is there in menu to Resume a GameService.";

    public static void showInstructions() {
        System.out.println(ADD_CHARACTER);
        System.out.println("\t\t* " + STEPS_TO_ADD_CHARACTER);
        System.out.println(PLAY_GAME);
        System.out.println("\t\t* " + STEPS_TO_PLAY_GAME);

        System.out.println(CHOOSE_CHARACTER);
        System.out.println("\t\t* " + STEPS_TO_CHOOSE_CHARACTER);

        System.out.println(SELECT_ACTION);
        System.out.println("\t\t* " + STEPS_TO_SELECT_ACTION);

        System.out.println(RESUME_GAME);
        System.out.println("\t\t* " + STEPS_TO_RESUME_GAME);

        System.out.println(SAVE_GAME);
        System.out.println("\t\t* " + STEPS_TO_SAVE_GAME);


    }
}
