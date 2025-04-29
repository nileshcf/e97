package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtCustAcctNoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtCustAcctNoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtCustAcctNoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_CUST_ACCT_NO_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExtCustIdNo;
            protected  int beginExtAcctNo;
	
	/**
	* Constructor for ExtCustAcctNoSerialized
	**/
    public ExtCustAcctNoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExtCustAcctNoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtCustAcctNoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExtCustAcctNoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,298); // serialize this field at offset 298 by default 
    }
    
	/**
	* sets parent for this ExtCustAcctNoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 298 by default
    }    
	/**
	* initializes the field in ExtCustAcctNoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_CUST_ACCT_NO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExtCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginExtAcctNo = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExtCustIdNoCounter = -1;
     public boolean isExtCustIdNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtCustIdNoCounter != sharedCounter;
         localExtCustIdNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of extCustIdNo
	 *	@return extCustIdNo
	 */
	public char[]  getExtCustIdNoString() {
	     return getCharArray(beginExtCustIdNo,EXT_CUST_ID_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extCustIdNoIsNumeric() {
	    return isNumeric(beginExtCustIdNo
	                    ,beginExtCustIdNo + EXT_CUST_ID_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXT_CUST_ID_NO_LEN = 10;
  	/**
	 * serializeExtCustIdNo
	 */
	protected void serializeExtCustIdNo(long extCustIdNo) {
		 putNumber(beginExtCustIdNo,extCustIdNo,EXT_CUST_ID_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExtCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExtCustIdNo
	 */
   	protected  long serializeExtCustIdNo(char[] value) {
	    long  extCustIdNo;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    extCustIdNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginExtCustIdNo
		       ,10
		      );
		 localExtCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  extCustIdNo;
    }

   protected long checkExtCustIdNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExtCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExtCustIdNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExtCustIdNo
			                 ,EXT_CUST_ID_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("extCustIdNo", beginExtCustIdNo,EXT_CUST_ID_NO_LEN);
    }
   	}
     int localExtAcctNoCounter = -1;
     public boolean isExtAcctNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtAcctNoCounter != sharedCounter;
         localExtAcctNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of extAcctNo
	 *	@return extAcctNo
	 */
	public char[]  getExtAcctNoString() {
	     return getCharArray(beginExtAcctNo,EXT_ACCT_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extAcctNoIsNumeric() {
	    return isNumeric(beginExtAcctNo
	                    ,beginExtAcctNo + EXT_ACCT_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXT_ACCT_NO_LEN = 5;
  	/**
	 * serializeExtAcctNo
	 */
	protected void serializeExtAcctNo(long extAcctNo) {
		 putNumber(beginExtAcctNo,extAcctNo,EXT_ACCT_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExtAcctNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExtAcctNo
	 */
   	protected  long serializeExtAcctNo(char[] value) {
	    long  extAcctNo;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    extAcctNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginExtAcctNo
		       ,5
		      );
		 localExtAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  extAcctNo;
    }

   protected long checkExtAcctNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExtAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExtAcctNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExtAcctNo
			                 ,EXT_ACCT_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("extAcctNo", beginExtAcctNo,EXT_ACCT_NO_LEN);
    }
   	}




}
  
