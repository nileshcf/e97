package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01MultAdpNoDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01MultAdpNoDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01MultAdpNoDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_MULT_ADP_NO_DATA_LENGTH = 182;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01MultAdpNoQty;
           protected int beginBdms01MultAdpNo;
           protected static final int BDMS_01_MULT_ADP_NO_SIZE = 20;
           protected int beginBdms01MultCountry;
           protected static final int BDMS_01_MULT_COUNTRY_SIZE = 20;
	
	/**
	* Constructor for Bdms01MultAdpNoDataSerialized
	**/
    public Bdms01MultAdpNoDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01MultAdpNoDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MultAdpNoDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01MultAdpNoDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4246); // serialize this field at offset 4246 by default 
    }
    
	/**
	* sets parent for this Bdms01MultAdpNoDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4246 by default
    }    
	/**
	* initializes the field in Bdms01MultAdpNoDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_MULT_ADP_NO_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01MultAdpNoQty = getStartOffset() + 0;	// set offset for serialization
  
	        beginBdms01MultAdpNo = getStartOffset() + 2; // set offset for serialization
  
	        beginBdms01MultCountry = getStartOffset() + 142; // set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01MultAdpNoQtyCounter = -1;
     public boolean isBdms01MultAdpNoQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MultAdpNoQtyCounter != sharedCounter;
         localBdms01MultAdpNoQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01MultAdpNoQty
	 *	@return bdms01MultAdpNoQty
	 */
	public char[]  getBdms01MultAdpNoQtyString() {
	     return getCharArray(beginBdms01MultAdpNoQty,BDMS_01_MULT_ADP_NO_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01MultAdpNoQtyIsNumeric() {
	    return isNumeric(beginBdms01MultAdpNoQty
	                    ,beginBdms01MultAdpNoQty + BDMS_01_MULT_ADP_NO_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_MULT_ADP_NO_QTY_LEN = 2;
  	/**
	 * serializeBdms01MultAdpNoQty
	 */
	protected void serializeBdms01MultAdpNoQty(int bdms01MultAdpNoQty) {
		 putNumber(beginBdms01MultAdpNoQty,bdms01MultAdpNoQty,BDMS_01_MULT_ADP_NO_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01MultAdpNoQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01MultAdpNoQty
	 */
   	protected  int serializeBdms01MultAdpNoQty(char[] value) {
	    int  bdms01MultAdpNoQty;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01MultAdpNoQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginBdms01MultAdpNoQty
		       ,2
		      );
		 localBdms01MultAdpNoQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01MultAdpNoQty;
    }

   protected int checkBdms01MultAdpNoQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01MultAdpNoQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01MultAdpNoQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01MultAdpNoQty
			                 ,BDMS_01_MULT_ADP_NO_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01MultAdpNoQty", beginBdms01MultAdpNoQty,BDMS_01_MULT_ADP_NO_QTY_LEN);
    }
   	}
 
   
  protected  static final int BDMS_01_MULT_ADP_NO_LEN = 7;
   /**
	 *	serializeBdms01MultAdpNo as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeBdms01MultAdpNo(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginBdms01MultAdpNo + index*BDMS_01_MULT_ADP_NO_LEN)
   	          , BDMS_01_MULT_ADP_NO_LEN 
   	          );
   }
 
   
  protected  static final int BDMS_01_MULT_COUNTRY_LEN = 2;
   /**
	 *	serializeBdms01MultCountry as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeBdms01MultCountry(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginBdms01MultCountry + index*BDMS_01_MULT_COUNTRY_LEN)
   	          , BDMS_01_MULT_COUNTRY_LEN 
   	          );
   }

		public int bdms01MultAdpNoSize() {
			return BDMS_01_MULT_ADP_NO_SIZE;
		}
		public int bdms01MultCountrySize() {
			return BDMS_01_MULT_COUNTRY_SIZE;
		}



}
  
