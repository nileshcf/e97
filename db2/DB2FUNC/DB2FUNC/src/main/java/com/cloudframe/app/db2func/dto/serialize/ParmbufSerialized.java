package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class ParmbufSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmbufSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmbufSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARMBUF_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginParmarry;
           protected static final int PARMARRY_SIZE = 2;
	
	/**
	* Constructor for ParmbufSerialized
	**/
    public ParmbufSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ParmbufSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParmbufSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ParmbufSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ParmbufSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ParmbufSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARMBUF_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginParmarry = getStartOffset() + 2; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int PARMARRY_LEN = 127;
   /**
	 *	serializeParmarry as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeParmarry(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginParmarry + index*PARMARRY_LEN)
   	          , PARMARRY_LEN 
   	          );
   }

		public int parmarrySize() {
			return PARMARRY_SIZE;
		}



}
  
