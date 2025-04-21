package com.cloudframe.app.casecb00.dto.serialize;

/**
*  The class AvailablecolorsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AvailablecolorsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AvailablecolorsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AVAILABLECOLORS_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginColor;
           protected static final int COLOR_SIZE = 5;
	
	/**
	* Constructor for AvailablecolorsSerialized
	**/
    public AvailablecolorsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AvailablecolorsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AvailablecolorsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AvailablecolorsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,199); // serialize this field at offset 199 by default 
    }
    
	/**
	* sets parent for this AvailablecolorsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 199 by default
    }    
	/**
	* initializes the field in AvailablecolorsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AVAILABLECOLORS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginColor = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int COLOR_LEN = 10;
   /**
	 *	serializeColor as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeColor(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginColor + index*COLOR_LEN)
   	          , COLOR_LEN 
   	          );
   }

		public int colorSize() {
			return COLOR_SIZE;
		}



}
  
