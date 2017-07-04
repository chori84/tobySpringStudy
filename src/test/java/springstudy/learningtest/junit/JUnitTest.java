package springstudy.learningtest.junit;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

/**
 * Created by chori on 2017. 7. 5..
 */
public class JUnitTest {
    static JUnitTest testObject;
    static Set<JUnitTest> testObjects = new HashSet<JUnitTest>();

    @Test
    public void test1() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject = this;
    }

    @Test
    public void test2() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject = this;
    }

    @Test
    public void test3() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject = this;
    }

    @Test
    public void test4() {
        assertThat(testObjects, not(hasItem(this)));
        testObjects.add(this);
    }
    @Test
    public void test5() {
        assertThat(testObjects, not(hasItem(this)));
        testObjects.add(this);
    }
    @Test
    public void test6() {
        assertThat(testObjects, not(hasItem(this)));
        testObjects.add(this);
    }


}
