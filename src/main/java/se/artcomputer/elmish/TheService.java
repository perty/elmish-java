package se.artcomputer.elmish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheService {
    private static final Logger LOG = LoggerFactory.getLogger(TheService.class);

    ModelCmd update(Model model, Msg msg) {
        return switch (msg) {
            case Increment -> new ModelCmd(model.setCount(model.getCount() + 1), Cmd.none);
            case Decrement -> new ModelCmd(model.setCount(model.getCount() -1), Cmd.none);
        };
    }
}

