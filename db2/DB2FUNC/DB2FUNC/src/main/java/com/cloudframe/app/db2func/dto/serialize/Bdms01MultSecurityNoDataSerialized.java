package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01MultSecurityNoDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01MultSecurityNoDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01MultSecurityNoDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_MULT_SECURITY_NO_DATA_LENGTH = 37;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01MultSecNoQty;
           protected int beginBdms01MultSecNo;
           protected static final int BDMS_01_MULT_SEC_NO_SIZE = 4;
           protected int beginBdms01MultSecType;
           protected static final int BDMS_01_MULT_SEC_TYPE_SIZE = 4;
	
	/**
	* Constructor for Bdms01MultSecurityNoDataSerialized
	**/
    public Bdms01MultSecurityNoDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01MultSecurityNoDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MultSecurityNoDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01MultSecurityNoDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3768); // serialize this field at offset 3768 by default 
    }
    
	/**
	* sets parent for this Bdms01MultSecurityNoDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3768 by default
    }    
	/**
	* initializes the field in Bdms01MultSecurityNoDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_MULT_SECURITY_NO_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01MultSecNoQty = getStartOffset() + 0;	// set offset for serialization
  
	        beginBdms01MultSecNo = getStartOffset() + 1; // set offset for serialization
  
	        beginBdms01MultSecType = getStartOffset() + 29; // set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01MultSecNoQtyCounter = -1;
     public boolean isBdms01MultSecNoQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MultSecNoQtyCounter != sharedCounter;
         localBdms01MultSecNoQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01MultSecNoQty
	 *	@return bdms01MultSecNoQty
	 */
	public char[]  getBdms01MultSecNoQtyString() {
	     return getCharArray(beginBdms01MultSecNoQty,BDMS_01_MULT_SEC_NO_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01MultSecNoQtyIsNumeric() {
	    return isNumeric(beginBdms01MultSecNoQty
	                    ,beginBdms01MultSecNoQty + BDMS_01_MULT_SEC_NO_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_MULT_SEC_NO_QTY_LEN = 1;
  	/**
	 * serializeBdms01MultSecNoQty
	 */
	protected void serializeBdms01MultSecNoQty(int bdms01MultSecNoQty) {
		 putNumber(beginBdms01MultSecNoQty,bdms01MultSecNoQty,BDMS_01_MULT_SEC_NO_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01MultSecNoQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01MultSecNoQty
	 */
   	protected  int serializeBdms01MultSecNoQty(char[] value) {
	    int  bdms01MultSecNoQty;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01MultSecNoQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBdms01MultSecNoQty
		       ,1
		      );
		 localBdms01MultSecNoQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01MultSecNoQty;
    }

   protected int checkBdms01MultSecNoQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01MultSecNoQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01MultSecNoQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01MultSecNoQty
			                 ,BDMS_01_MULT_SEC_NO_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01MultSecNoQty", beginBdms01MultSecNoQty,BDMS_01_MULT_SEC_NO_QTY_LEN);
    }
   	}
 
   
  protected  static final int BDMS_01_MULT_SEC_NO_LEN = 7;
   /**
	 *	serializeBdms01MultSecNo as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeBdms01MultSecNo(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginBdms01MultSecNo + index*BDMS_01_MULT_SEC_NO_LEN)
   	          , BDMS_01_MULT_SEC_NO_LEN 
   	          );
   }
 
   
  protected  static final int BDMS_01_MULT_SEC_TYPE_LEN = 2;
   /**
	 *	serializeBdms01MultSecType as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeBdms01MultSecType(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginBdms01MultSecType + index*BDMS_01_MULT_SEC_TYPE_LEN)
   	          , BDMS_01_MULT_SEC_TYPE_LEN 
   	          );
   }

		public int bdms01MultSecNoSize() {
			return BDMS_01_MULT_SEC_NO_SIZE;
		}
		public int bdms01MultSecTypeSize() {
			return BDMS_01_MULT_SEC_TYPE_SIZE;
		}



}
  
