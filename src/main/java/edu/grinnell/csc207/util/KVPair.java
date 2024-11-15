package edu.grinnell.csc207.util;

/**
 * 
 * * @author Slok Rajbhandari
 * 
 * An easy way to store key/value pairs.  We assume that other
 * classes will access fields directly.
 *
 * @param <K>
 *   The type of the keys.
 * @param <V>
 *   The type of the values.
 */
class KVPair<K, V> {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The key.
   */
  K key;

  /**
   * The value.
   */
  V val;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create an empty key/value pair.
   */
  KVPair() {
    this(null, null);
  } // KVPair()

  /**
   * Create a new key/value pair.
   *
   * @param pairKey
   *   The key of the new pair.
   * @param pairValue
   *   The value of the new pair.
   */
  KVPair(K pairKey, V pairValue) {
    this.key = pairKey;
    this.val = pairValue;
  } // KVPair(K,V)

  // +------------------+--------------------------------------------
  // | Standard methods |
  // +------------------+

  /**
   * Make a copy of this key/value pair.
   *
   * @return the copy.
   */
  public KVPair<K, V> clone() {
    return new KVPair<K, V>(this.key, this.val);
  } // clone()

  /**
   * Convert the key/value pair to a string (e.g., for printing).
   *
   * @return a string of the form "key:value".
   */
  public String toString() {
    if (null == this.val) {
      return this.key.toString() + ":" + "<null>";
    } else {
      return this.key.toString() + ":" + this.val.toString();
    } // if
  } // toString()

  // +----------------+----------------------------------------------
  // | Getter methods |
  // +----------------+

  /**
   * Retrieves the key of this key-value pair.
   *
   * @return The key of this pair.
   */
  public K getKey() {
    return this.key;
  } // getKey()

  /**
   * Retrieves the value of this key-value pair.
   *
   * @return The value of this pair.
   */
  public V getValue() {
    return this.val;
  } // getValue()

    // +----------------+----------------------------------------------
  // | Setter methods |
  // +----------------+

  /**
   * Updates the value associated with the key.
   *
   * @param value The new value to associate with the key.
   */
  public void setValue(V value) {
    this.val = value;
  } // setValue()
} // class KVPair
