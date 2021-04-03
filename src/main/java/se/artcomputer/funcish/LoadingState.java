package se.artcomputer.funcish;

// Java 16 pattern matching

public interface LoadingState {

}

class NotAsked implements LoadingState {

}

class Loading implements LoadingState {

}

class Test {
    public String whatIsTheState(LoadingState state) {
        if (state instanceof NotAsked notAsked) {
            return "Not asked";
        }
        return "";
    }
}