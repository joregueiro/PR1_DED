package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

import java.awt.*;

public class PR1Stack {
    public int CAPACITY = 10;

    private Stack<Point> stack;

    public PR1Stack(int capacidad) {
        this.CAPACITY = capacidad;
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Point>(CAPACITY);
    }

    public Stack<Point> getStack() {
        return this.stack;
    }

    public void push(Point c) {
        this.stack.push(c);
    }

    public Point pop() {
        return this.stack.pop();
    }
}
