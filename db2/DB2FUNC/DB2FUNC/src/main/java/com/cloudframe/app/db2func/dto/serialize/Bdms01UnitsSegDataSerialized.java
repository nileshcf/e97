package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01UnitsSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01UnitsSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01UnitsSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_UNITS_SEG_DATA_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01UnitsSegSqlcd;
            protected  int beginBdms01TypeUnitsCd;
	
	/**
	* Constructor for Bdms01UnitsSegDataSerialized
	**/
    public Bdms01UnitsSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01UnitsSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01UnitsSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01UnitsSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4428); // serialize this field at offset 4428 by default 
    }
    
	/**
	* sets parent for this Bdms01UnitsSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4428 by default
    }    
	/**
	* initializes the field in Bdms01UnitsSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_UNITS_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01UnitsSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01TypeUnitsCd = getStartOffset() + 4;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01UnitsSegSqlcdCounter = -1;
     public boolean isBdms01UnitsSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UnitsSegSqlcdCounter != sharedCounter;
         localBdms01UnitsSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01UnitsSegSqlcd
	 *	@return bdms01UnitsSegSqlcd
	 */
	public char[]  getBdms01UnitsSegSqlcdString() {
	     return getCharArray(beginBdms01UnitsSegSqlcd,BDMS_01_UNITS_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01UnitsSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01UnitsSegSqlcd
	                    ,beginBdms01UnitsSegSqlcd + BDMS_01_UNITS_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_UNITS_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01UnitsSegSqlcd
	 */
	protected void serializeBdms01UnitsSegSqlcd(int bdms01UnitsSegSqlcd) {
		 putNumber(beginBdms01UnitsSegSqlcd,bdms01UnitsSegSqlcd,BDMS_01_UNITS_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01UnitsSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01UnitsSegSqlcd
	 */
   	protected  int serializeBdms01UnitsSegSqlcd(char[] value) {
	    int  bdms01UnitsSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01UnitsSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01UnitsSegSqlcd
		       ,4
		      );
		 localBdms01UnitsSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01UnitsSegSqlcd;
    }

   protected int checkBdms01UnitsSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01UnitsSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01UnitsSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01UnitsSegSqlcd
			                 ,BDMS_01_UNITS_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01UnitsSegSqlcd", beginBdms01UnitsSegSqlcd,BDMS_01_UNITS_SEG_SQLCD_LEN);
    }
   	}
     int localBdms01TypeUnitsCdCounter = -1;
     public boolean isBdms01TypeUnitsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeUnitsCdCounter != sharedCounter;
         localBdms01TypeUnitsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_UNITS_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01TypeUnitsCd
	 */
   protected void serializeBdms01TypeUnitsCd(char[] bdms01TypeUnitsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeUnitsCd,0,getStringValue(),beginBdms01TypeUnitsCd,BDMS_01_TYPE_UNITS_CD_LEN);
       localBdms01TypeUnitsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeUnitsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01TypeUnitsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeUnitsCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeUnitsCd,beginBdms01TypeUnitsCd + BDMS_01_TYPE_UNITS_CD_LEN));
   	}




}
  
