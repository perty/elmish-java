package se.artcomputer.funcish;

/*
type RemoteData e a
        = NotAsked
        | Loading
        | Failure e
        | Success a
 */

public interface RemoteData {

}

interface NotAsked extends RemoteData {

}

class Loading implements RemoteData {

}

record Failure<E>(E error) implements RemoteData {
}

record Success<A>(A payload) implements RemoteData {
}

class Test {
    public String whatIsTheState(RemoteData state) {
        String result;
        switch (state) {
            case NotAsked ignored -> result = "Not asked";
            case Loading ignored -> result = "Loading";
            case Failure f -> result = "Failure " + f.error();
            case Success s -> result = "Success " + s.payload();
            case RemoteData ignored -> result = "cursed";
        }
        return result;
    }
}