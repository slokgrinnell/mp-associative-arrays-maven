package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Slok Rajbhandari
 */
public class TestsFromStudent {
  // +----------------------------+----------------------------------
  // | Tests by Rajbhandari, Slok |
  // +----------------------------+
  
      // Slok Rajbhandari - Basic functionality of set and get methods
      @Test
      public void rajbhandariSlokTest1() throws Exception {
          AssociativeArray<String, Integer> arr = new AssociativeArray<>();
          arr.set("one", 1);
          arr.set("two", 2);
  
          assertEquals(1, arr.get("one"), "The value for 'one' should be 1.");
          assertEquals(2, arr.get("two"), "The value for 'two' should be 2.");
      }
  
      // Slok Rajbhandari - Test for updating the same key
      @Test
      public void rajbhandariSlokTest2() throws Exception {
          AssociativeArray<String, String> arr = new AssociativeArray<>();
          arr.set("fruit", "apple");
          arr.set("fruit", "orange");
  
          assertEquals("orange", arr.get("fruit"), "The value for 'fruit' should be updated to 'orange'.");
      }
  
      // Slok Rajbhandari - Edge case: Removing a key that doesn't exist
      @Test
      public void rajbhandariSlokEdge1() throws Exception{
          AssociativeArray<String, String> arr = new AssociativeArray<>();
          arr.set("key", "value");
  
          arr.remove("nonexistent");
          assertEquals(1, arr.size(), "Removing a non-existent key should not change the size.");
          assertEquals("value", arr.get("key"), "The original key-value pair should still exist.");
      }
} // class TestsFromSam
