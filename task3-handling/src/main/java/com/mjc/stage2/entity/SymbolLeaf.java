package com.mjc.stage2.entity;

import java.util.List;
import java.util.ArrayList;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    public SymbolLeaf(TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(this.value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TextComponentType getComponentType(){
        return super.componentType;
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException();
    }


}
