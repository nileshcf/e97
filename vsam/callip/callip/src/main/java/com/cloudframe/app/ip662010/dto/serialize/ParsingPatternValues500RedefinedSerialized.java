package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class ParsingPatternValues500RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParsingPatternValues500RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParsingPatternValues500RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARSING_PATTERN_VALUES_500_REDEFINED_LENGTH = 2048;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginParsingPattern500;
           protected static final int PARSING_PATTERN_500_SIZE = 256;
	
	/**
	* Constructor for ParsingPatternValues500RedefinedSerialized
	**/
    public ParsingPatternValues500RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ParsingPatternValues500RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParsingPatternValues500RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ParsingPatternValues500RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ParsingPatternValues500RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ParsingPatternValues500RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARSING_PATTERN_VALUES_500_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginParsingPattern500 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int PARSING_PATTERN_500_LEN = 8;
   /**
	 *	serializeParsingPattern500 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeParsingPattern500(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginParsingPattern500 + index*PARSING_PATTERN_500_LEN)
   	          , PARSING_PATTERN_500_LEN 
   	          );
   }

		public int parsingPattern500Size() {
			return PARSING_PATTERN_500_SIZE;
		}



}
  
