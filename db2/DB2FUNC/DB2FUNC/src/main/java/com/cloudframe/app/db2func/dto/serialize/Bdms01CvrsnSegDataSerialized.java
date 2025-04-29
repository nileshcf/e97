package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01CvrsnSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01CvrsnSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01CvrsnSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_CVRSN_SEG_DATA_LENGTH = 389;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01CvrsnSegSqlcd;
           protected int beginBdms01CvrsnTable;
           protected static final int BDMS_01_CVRSN_TABLE_SIZE = 5;
	
	/**
	* Constructor for Bdms01CvrsnSegDataSerialized
	**/
    public Bdms01CvrsnSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01CvrsnSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CvrsnSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01CvrsnSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4844); // serialize this field at offset 4844 by default 
    }
    
	/**
	* sets parent for this Bdms01CvrsnSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4844 by default
    }    
	/**
	* initializes the field in Bdms01CvrsnSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_CVRSN_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01CvrsnSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
	        beginBdms01CvrsnTable = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01CvrsnSegSqlcdCounter = -1;
     public boolean isBdms01CvrsnSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnSegSqlcdCounter != sharedCounter;
         localBdms01CvrsnSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01CvrsnSegSqlcd
	 *	@return bdms01CvrsnSegSqlcd
	 */
	public char[]  getBdms01CvrsnSegSqlcdString() {
	     return getCharArray(beginBdms01CvrsnSegSqlcd,BDMS_01_CVRSN_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CvrsnSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01CvrsnSegSqlcd
	                    ,beginBdms01CvrsnSegSqlcd + BDMS_01_CVRSN_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_CVRSN_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01CvrsnSegSqlcd
	 */
	protected void serializeBdms01CvrsnSegSqlcd(int bdms01CvrsnSegSqlcd) {
		 putNumber(beginBdms01CvrsnSegSqlcd,bdms01CvrsnSegSqlcd,BDMS_01_CVRSN_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CvrsnSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01CvrsnSegSqlcd
	 */
   	protected  int serializeBdms01CvrsnSegSqlcd(char[] value) {
	    int  bdms01CvrsnSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01CvrsnSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01CvrsnSegSqlcd
		       ,4
		      );
		 localBdms01CvrsnSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01CvrsnSegSqlcd;
    }

   protected int checkBdms01CvrsnSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01CvrsnSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01CvrsnSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01CvrsnSegSqlcd
			                 ,BDMS_01_CVRSN_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CvrsnSegSqlcd", beginBdms01CvrsnSegSqlcd,BDMS_01_CVRSN_SEG_SQLCD_LEN);
    }
   	}

		public int bdms01CvrsnTableSize() {
			return BDMS_01_CVRSN_TABLE_SIZE;
		}



}
  
