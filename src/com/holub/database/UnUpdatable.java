package com.holub.database;

public class UnUpdatable extends GrantDecorator{

    private final void illegal()    {
        throw new UnsupportedOperationException();
    }

    @Override
    public int update(Selector where) {
        illegal();
        return 0;
    }
}