package com.iluwatar.foundation.util;

import static org.junit.Assert.*;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.parser.XmlTag;
import org.junit.Test;

public class AttributeTest {

	@Test
	public void testSetClass() {
		
        final ComponentTag tag = new ComponentTag("div", XmlTag.TagType.OPEN_CLOSE);
        assertEquals(null, tag.getAttribute("class"));
        Attribute.setClass(tag, "pink");
        assertEquals("pink", tag.getAttribute("class"));
        Attribute.setClass(tag, "blue");
        assertEquals("blue", tag.getAttribute("class"));
		
	}
	
	@Test
	public void testAddClass() {
		
        final ComponentTag tag = new ComponentTag("div", XmlTag.TagType.OPEN_CLOSE);
        assertEquals(null, tag.getAttribute("class"));
        Attribute.addClass(tag, "pink");
        assertEquals("pink", tag.getAttribute("class"));
        Attribute.addClass(tag, "blue");
        assertEquals("pink blue", tag.getAttribute("class"));
        Attribute.addClass(tag, "blue");
        assertEquals("pink blue", tag.getAttribute("class"));
		
	}

	@Test
	public void testHasClass() {
		
        final ComponentTag tag = new ComponentTag("div", XmlTag.TagType.OPEN_CLOSE);
        Attribute.setClass(tag, "pink green blue");
        assertTrue(Attribute.hasClass(tag, "pink"));
        assertTrue(Attribute.hasClass(tag, "green"));
        assertTrue(Attribute.hasClass(tag, "blue"));
        assertFalse(Attribute.hasClass(tag, "black"));
		
	}

	@Test
	public void testRemoveClass() {
		
        final ComponentTag tag = new ComponentTag("div", XmlTag.TagType.OPEN_CLOSE);
        Attribute.setClass(tag, "pink blue red");
        assertTrue(Attribute.hasClass(tag, "pink"));
        assertTrue(Attribute.hasClass(tag, "blue"));
        assertTrue(Attribute.hasClass(tag, "red"));
        Attribute.removeClass(tag, "pink");
        assertFalse(Attribute.hasClass(tag, "pink"));
        assertTrue(Attribute.hasClass(tag, "blue"));
        assertTrue(Attribute.hasClass(tag, "red"));
        Attribute.removeClass(tag, "red");
        assertTrue(Attribute.hasClass(tag, "blue"));
        assertFalse(Attribute.hasClass(tag, "red"));
        Attribute.removeClass(tag, "blue");
        assertFalse(Attribute.hasClass(tag, "blue"));
        assertEquals("", tag.getAttribute("class"));
	}
	
}
