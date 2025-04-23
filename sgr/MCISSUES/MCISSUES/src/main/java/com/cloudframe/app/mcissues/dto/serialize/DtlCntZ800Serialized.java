package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class DtlCntZ800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtlCntZ800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtlCntZ800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DTL_CNT_Z_800_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDtlCntZo800;
	
	/**
	* Constructor for DtlCntZ800Serialized
	**/
    public DtlCntZ800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DtlCntZ800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DtlCntZ800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DtlCntZ800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this DtlCntZ800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in DtlCntZ800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DTL_CNT_Z_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDtlCntZo800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDtlCntZo800Counter = -1;
     public boolean isDtlCntZo800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDtlCntZo800Counter != sharedCounter;
         localDtlCntZo800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dtlCntZo800
	 *	@return dtlCntZo800
	 */
	public char[]  getDtlCntZo800String() {
	     return getCharArray(beginDtlCntZo800,DTL_CNT_ZO_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dtlCntZo800IsNumeric() {
	    return isNumeric(beginDtlCntZo800
	                    ,beginDtlCntZo800 + DTL_CNT_ZO_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DTL_CNT_ZO_800_LEN = 10;
  	/**
	 * serializeDtlCntZo800
	 */
	protected void serializeDtlCntZo800(long dtlCntZo800) {
		 putNumber(beginDtlCntZo800,dtlCntZo800,DTL_CNT_ZO_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDtlCntZo800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDtlCntZo800
	 */
   	protected  long serializeDtlCntZo800(char[] value) {
	    long  dtlCntZo800;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dtlCntZo800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginDtlCntZo800
		       ,10
		      );
		 localDtlCntZo800Counter = shareString.getSerializedField().getModifiedCounter();
		return  dtlCntZo800;
    }

   protected long checkDtlCntZo800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDtlCntZo800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDtlCntZo800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDtlCntZo800
			                 ,DTL_CNT_ZO_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dtlCntZo800", beginDtlCntZo800,DTL_CNT_ZO_800_LEN);
    }
   	}




}
  
