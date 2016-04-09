/*
++++++++++++++++++++++++++++++++++++++++++++++++
title     Northem Light Enumeration JUnit Test +
project   northem-light-java                   +
file      NorthemLightTest.java                +
version                                        +
author    Arctic Ice Studio                    +
email     development@arcticicestudio.com      +
website   http://arcticicestudio.com           +
copyright Copyright (C) 2016                   +
created   2016-01-24 19:59 UTC+0100            +
modified  2016-04-09 10:27 UTC+0200            +
++++++++++++++++++++++++++++++++++++++++++++++++

[Description]
JUnit test class for the 'NorthemLight' class of the "Northem Light - Java" API.

[Copyright]
Copyright (C) 2016 Arctic Ice Studio <development@arcticicestudio.com>

[References]
Northem Light
  (https://github.com/arcticicestudio/northem-light)
Java 8 API Documentation
  (https://docs.oracle.com/javase/8/docs/api/)
JavaFX 2.2 API Documentation
  (https://docs.oracle.com/javafx/2/api/)
JavaFX 2.2 Oracle Project Website
  (http://docs.oracle.com/javase/8/javase-clienttechnologies.htm)
Arctic Versioning Specification
  (http://specs.arcticicestudio.com/arcver) (ArcVer)
*/

package com.arcticicestudio.northem.light;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * JUnit test class for the {@link NorthemLight} class of the
 * <a href="https://github.com/arcticicestudio/northem-light-java">Northem Light - Java</a> API.
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @see NorthemLight
 * @see <a href="http://junit.org/">http://junit.org/</a>
 * @see <a href="https://github.com/arcticicestudio/northem-light-java">Northem Light - Java</a>
 * @since 0.1.0
 */
public class NorthemLightTest {
  @Test
  public void shouldReturnTheCorrectHEXColorCode() {
    assertEquals(NorthemLight.hex(NorthemLight.DARK_GRAY.get()), "#454546");
    assertEquals(NorthemLight.hex(NorthemLight.GRAY.get()), "#6D6D6F");
    assertEquals(NorthemLight.hex(NorthemLight.LIGHT_GRAY.get()), "#C6C6C8");
    assertEquals(NorthemLight.hex(NorthemLight.DARK_SNOW.get()), "#F2F2F7");
    assertEquals(NorthemLight.hex(NorthemLight.DIRTY_SNOW.get()), "#F9F9FC");
    assertEquals(NorthemLight.hex(NorthemLight.SNOW.get()), "#FFFFFF");
    assertEquals(NorthemLight.hex(NorthemLight.AQUA.get()), "#7ACAC2");
    assertEquals(NorthemLight.hex(NorthemLight.LIGHT_BLUE.get()), "#6FBAD0");
    assertEquals(NorthemLight.hex(NorthemLight.BLUE.get()), "#71A7CA");
    assertEquals(NorthemLight.hex(NorthemLight.DARK_BLUE.get()), "#5781B3");
    assertEquals(NorthemLight.hex(NorthemLight.RED.get()), "#DF5C5A");
    assertEquals(NorthemLight.hex(NorthemLight.YELLOW.get()), "#FFC568");
    assertEquals(NorthemLight.hex(NorthemLight.ORANGE.get()), "#F19054");
    assertEquals(NorthemLight.hex(NorthemLight.LIME.get()), "#C5C961");
    assertEquals(NorthemLight.hex(NorthemLight.PURPLE.get()), "#BA8EC4");
  }
}
