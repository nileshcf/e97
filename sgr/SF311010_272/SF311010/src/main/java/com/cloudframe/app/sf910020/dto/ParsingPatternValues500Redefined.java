package com.cloudframe.app.sf910020.dto;

/**
*  The class ParsingPatternValues500Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.sf910020.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class ParsingPatternValues500Redefined extends ParsingPatternValues500RedefinedSerialized { 
   
      private List<char[]> parsingPattern500; 

	
	/**
	* Constructor for ParsingPatternValues500Redefined
	**/
    public ParsingPatternValues500Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ParsingPatternValues500Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParsingPatternValues500Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of parsingPattern500
	 *  Corresponding COBOL Variable is 500-PARSING-PATTERN
	 *	@return parsingPattern500
	 */
	public List<char[]> getParsingPattern500() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < PARSING_PATTERN_500_SIZE;index++) {
        	list.add( getParsingPattern500( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return parsingPattern500
	 */
	public char[] getParsingPattern500(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getParsingPattern500(), resetting it to 0",index);
		    index = 0;
        } else if (index >= PARSING_PATTERN_500_SIZE) {
             	index = PARSING_PATTERN_500_SIZE -1; // can't exceed max array size
             	logger.trace("parsingPattern500 - Array index exceeded max Size {}, resetting it to max allowed",PARSING_PATTERN_500_SIZE); 
	    }
   	      return getCharArray( (beginParsingPattern500 + index*PARSING_PATTERN_500_LEN) , PARSING_PATTERN_500_LEN );
    }
    
    
   public int  parsingPattern500FieldLength() {
   	return PARSING_PATTERN_500_LEN;
   }
   
	

  
  	/**
	 *	Update ParsingPattern500 with the passed value at a given index
	 *  Corresponding COBOL Variable is 500-PARSING-PATTERN
	 *  @param index
	 *	@param value
	 */
  public void setParsingPattern500(int index,char[] value) {
   	setParsingPattern500(index,value,true);
   }
   
   
   /**
	 *	Update ParsingPattern500 with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setParsingPattern500(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setParsingPattern500(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 8)  {     
		       value = substring(value,0,8);
           }  else if (value.length < 8) {
		       value = pad(8, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(8).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeParsingPattern500(index,value);		
       }
   }
   

	
	
	

		public static int getParsingPatternValues500RedefinedFieldLength() {
			return PARSING_PATTERN_VALUES_500_REDEFINED_LENGTH;
		}

}
  
