package com.shecodes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RecursionTest {

    @Test
    void pairStar() {
        Assert.assertEquals("a*a*a*a",new Recursion().pairStar("aaaa"));
        Assert.assertEquals("hel*lo",new Recursion().pairStar("hello"));
        Assert.assertEquals("x*xy*y",new Recursion().pairStar("xxyy"));
    }

    @Test
    void strCount() {
        Assert.assertEquals(2,new Recursion().strCount("catcowcat","cat"));
        Assert.assertEquals(1,new Recursion().strCount("catcowcat","cow"));
        Assert.assertEquals(0,new Recursion().strCount("catcowcat","dog"));
    }

    @Test
    void numberOfLowerX() {
        Assert.assertEquals(4,new Recursion().numberOfLowerX("xxhixx"));
        Assert.assertEquals(3,new Recursion().numberOfLowerX("xhixhix"));
        Assert.assertEquals(0,new Recursion().numberOfLowerX("hi"));
    }

    @Test
    void triangle() {
        Assert.assertEquals(0,new Recursion().triangle(0));
        Assert.assertEquals(1,new Recursion().triangle(1));
        Assert.assertEquals(3,new Recursion().triangle(2));
    }

    @Test
    void parenBit() {
        Assert.assertEquals("(abc)",new Recursion().parenBit("xyz(abc)123"));
        Assert.assertEquals("(hello)",new Recursion().parenBit("x(hello)"));
        Assert.assertEquals("(xy)",new Recursion().parenBit("(xy)1"));

    }
}