package org.DataStructure;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void givenCallShouldPrintWelcomeMessage() {
        MyNode myFirstNode = new MyNode();
        myFirstNode.printWelcomeMessage();
    }

    @Test
    public void GivenThreeNumbersWhenLinkedShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode));
        Assert.assertTrue(result);
    }

}
