package se.artcomputer.elmish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelCmd {
    private static final Logger LOG = LoggerFactory.getLogger(ModelCmd.class);

    private final Model model;
    private final Cmd cmd;

    public ModelCmd(Model model, Cmd cmd) {
        this.model = model;
        this.cmd = cmd;
    }

    public Model getModel() {
        return model;
    }

    public Cmd getCmd() {
        return cmd;
    }
}

