package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class MaxDaysOfMonth300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MaxDaysOfMonth300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MaxDaysOfMonth300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MAX_DAYS_OF_MONTH_300_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDaysOfAMonth300;
           protected static final int DAYS_OF_AMONTH_300_SIZE = 12;
	
	/**
	* Constructor for MaxDaysOfMonth300Serialized
	**/
    public MaxDaysOfMonth300Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MaxDaysOfMonth300Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MaxDaysOfMonth300Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MaxDaysOfMonth300Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MaxDaysOfMonth300Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MaxDaysOfMonth300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MAX_DAYS_OF_MONTH_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDaysOfAMonth300 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int DAYS_OF_AMONTH_300_LEN = 2;
   /**
	 *	serializeDaysOfAMonth300 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeDaysOfAMonth300(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginDaysOfAMonth300 + index*DAYS_OF_AMONTH_300_LEN)
   	          , DAYS_OF_AMONTH_300_LEN 
   	          );
   }

		public int daysOfAMonth300Size() {
			return DAYS_OF_AMONTH_300_SIZE;
		}



}
  
