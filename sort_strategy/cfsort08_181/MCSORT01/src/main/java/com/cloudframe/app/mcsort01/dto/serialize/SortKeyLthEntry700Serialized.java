package com.cloudframe.app.mcsort01.dto.serialize;

/**
*  The class SortKeyLthEntry700Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortKeyLthEntry700Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortKeyLthEntry700Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_KEY_LTH_ENTRY_700_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableLt700;
	
	/**
	* Constructor for SortKeyLthEntry700Serialized
	**/
    public SortKeyLthEntry700Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SortKeyLthEntry700Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortKeyLthEntry700Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SortKeyLthEntry700Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SortKeyLthEntry700Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SortKeyLthEntry700Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_KEY_LTH_ENTRY_700_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTableLt700 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTableLt700Counter = -1;
     public boolean isTableLt700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableLt700Counter != sharedCounter;
         localTableLt700Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tableLt700
	 *	@return tableLt700
	 */
	public char[]  getTableLt700String() {
	     return getCharArray(beginTableLt700,TABLE_LT_700_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tableLt700IsNumeric() {
	    return isNumeric(beginTableLt700
	                    ,beginTableLt700 + TABLE_LT_700_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TABLE_LT_700_LEN = 5;
  	/**
	 * serializeTableLt700
	 */
	protected void serializeTableLt700(long tableLt700) {
		 putNumber(beginTableLt700,tableLt700,TABLE_LT_700_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTableLt700Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTableLt700
	 */
   	protected  long serializeTableLt700(char[] value) {
	    long  tableLt700;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tableLt700 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginTableLt700
		       ,5
		      );
		 localTableLt700Counter = shareString.getSerializedField().getModifiedCounter();
		return  tableLt700;
    }

   protected long checkTableLt700MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTableLt700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTableLt700() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTableLt700
			                 ,TABLE_LT_700_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tableLt700", beginTableLt700,TABLE_LT_700_LEN);
    }
   	}




}
  
