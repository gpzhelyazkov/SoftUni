package app;

import app.contracts.*;
import app.controllers.BattlefieldImpl;
import app.engine.GameEngine;
import app.factory.ActionFactoryImpl;
import app.factory.SpecialFactoryImpl;
import app.factory.TargetableFactoryImpl;
import app.handlers.CommandHandlerImpl;
import app.io.ConsoleReader;
import app.io.ConsoleWriter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IOException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {

        //Reader reader = new ConsoleReader();
        //Writer writer = new ConsoleWriter();

        //ActionFactory actionFactory = new ActionFactoryImpl();
        //TargetableFactory targetableFactory = new TargetableFactoryImpl();
        //SpecialFactory specialFactory = new SpecialFactoryImpl();

        //Battlefield battleField = new BattlefieldImpl(actionFactory, targetableFactory, specialFactory, writer);
        //CommandHandler handler = new CommandHandlerImpl(battleField);

        //Engine engine = new GameEngine(reader, handler);
        //engine.run();

        int[] arr = {1, 1, 1, 2, 2, 5, 5, 3, 3, 4};

        int i = 0;
        int count = 0;
        while (i + 1 < arr.length) {

            if(arr[i] == arr[i + 1]) {
                count++;
                while (arr[i] == arr[i + 1]) {
                    i++;
                }
            } else {
                i++;
        }
    }

        System.out.println(count);
    }
}
