package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0041CountryTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0041CountryTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0041CountryTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0041_COUNTRY_TABLE_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp0041Country;
           protected static final int IP_0041_COUNTRY_SIZE = 20;
	
	/**
	* Constructor for Ip0041CountryTableSerialized
	**/
    public Ip0041CountryTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0041CountryTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041CountryTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0041CountryTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,56); // serialize this field at offset 56 by default 
    }
    
	/**
	* sets parent for this Ip0041CountryTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 56 by default
    }    
	/**
	* initializes the field in Ip0041CountryTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0041_COUNTRY_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp0041Country = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int IP_0041_COUNTRY_LEN = 3;
   /**
	 *	serializeIp0041Country as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp0041Country(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp0041Country + index*IP_0041_COUNTRY_LEN)
   	          , IP_0041_COUNTRY_LEN 
   	          );
   }

		public int ip0041CountrySize() {
			return IP_0041_COUNTRY_SIZE;
		}



}
  
