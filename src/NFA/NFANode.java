package NFA;

import java.util.ArrayList;
import java.util.List;

public class NFANode {
    private int stateNumber;
    private boolean endState;
    private List<NFATrans> transitions;

    /**
     * @param stateNumber State's number
     * @param endState    Whether is end state
     */
    public NFANode(int stateNumber, boolean endState) {
        this.stateNumber = stateNumber;
        this.endState = endState;
        this.transitions = new ArrayList<>();
    }

    public NFANode() {
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public boolean getEndState() {
        return endState;
    }

    public void setEndState(boolean endState) {
        this.endState = endState;
    }

    public List<NFATrans> getTransitions() {
        return transitions;
    }

    public void addTransitions(NFATrans nfaTrans) {
        this.transitions.add(nfaTrans);
    }
}