package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01SearchKeyFieldRedefined01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01SearchKeyFieldRedefined01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01SearchKeyFieldRedefined01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_SEARCH_KEY_FIELD_REDEFINED_01_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01SearchKeyEis;
            protected  int beginBdms01SearchKeyEisCntry;
	
	/**
	* Constructor for Bdms01SearchKeyFieldRedefined01Serialized
	**/
    public Bdms01SearchKeyFieldRedefined01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01SearchKeyFieldRedefined01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SearchKeyFieldRedefined01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01SearchKeyFieldRedefined01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this Bdms01SearchKeyFieldRedefined01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in Bdms01SearchKeyFieldRedefined01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_SEARCH_KEY_FIELD_REDEFINED_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01SearchKeyEis = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01SearchKeyEisCntry = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01SearchKeyEisCounter = -1;
     public boolean isBdms01SearchKeyEisModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchKeyEisCounter != sharedCounter;
         localBdms01SearchKeyEisCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01SearchKeyEis
	 *	@return bdms01SearchKeyEis
	 */
	public char[]  getBdms01SearchKeyEisString() {
	     return getCharArray(beginBdms01SearchKeyEis,BDMS_01_SEARCH_KEY_EIS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01SearchKeyEisIsNumeric() {
	    return isNumeric(beginBdms01SearchKeyEis
	                    ,beginBdms01SearchKeyEis + BDMS_01_SEARCH_KEY_EIS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_SEARCH_KEY_EIS_LEN = 10;
  	/**
	 * serializeBdms01SearchKeyEis
	 */
	protected void serializeBdms01SearchKeyEis(long bdms01SearchKeyEis) {
		 putNumber(beginBdms01SearchKeyEis,bdms01SearchKeyEis,BDMS_01_SEARCH_KEY_EIS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01SearchKeyEisCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01SearchKeyEis
	 */
   	protected  long serializeBdms01SearchKeyEis(char[] value) {
	    long  bdms01SearchKeyEis;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01SearchKeyEis = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginBdms01SearchKeyEis
		       ,10
		      );
		 localBdms01SearchKeyEisCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01SearchKeyEis;
    }

   protected long checkBdms01SearchKeyEisMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01SearchKeyEis is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBdms01SearchKeyEis() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBdms01SearchKeyEis
			                 ,BDMS_01_SEARCH_KEY_EIS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01SearchKeyEis", beginBdms01SearchKeyEis,BDMS_01_SEARCH_KEY_EIS_LEN);
    }
   	}
     int localBdms01SearchKeyEisCntryCounter = -1;
     public boolean isBdms01SearchKeyEisCntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchKeyEisCntryCounter != sharedCounter;
         localBdms01SearchKeyEisCntryCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_KEY_EIS_CNTRY_LEN = 2;
	/**
	 * 	serialize this Bdms01SearchKeyEisCntry
	 */
   protected void serializeBdms01SearchKeyEisCntry(char[] bdms01SearchKeyEisCntry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchKeyEisCntry,0,getStringValue(),beginBdms01SearchKeyEisCntry,BDMS_01_SEARCH_KEY_EIS_CNTRY_LEN);
       localBdms01SearchKeyEisCntryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchKeyEisCntryConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SearchKeyEisCntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchKeyEisCntry() {	 
   		return (substring(getStringValue(),beginBdms01SearchKeyEisCntry,beginBdms01SearchKeyEisCntry + BDMS_01_SEARCH_KEY_EIS_CNTRY_LEN));
   	}




}
  
