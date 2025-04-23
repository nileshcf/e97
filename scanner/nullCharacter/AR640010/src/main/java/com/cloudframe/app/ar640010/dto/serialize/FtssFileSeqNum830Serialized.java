package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FtssFileSeqNum830Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FtssFileSeqNum830Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FtssFileSeqNum830Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FTSS_FILE_SEQ_NUM_830_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFtssFileCyclNum830;
	
	/**
	* Constructor for FtssFileSeqNum830Serialized
	**/
    public FtssFileSeqNum830Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FtssFileSeqNum830Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FtssFileSeqNum830Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FtssFileSeqNum830Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12); // serialize this field at offset 12 by default 
    }
    
	/**
	* sets parent for this FtssFileSeqNum830Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12 by default
    }    
	/**
	* initializes the field in FtssFileSeqNum830Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FTSS_FILE_SEQ_NUM_830_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFtssFileCyclNum830 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFtssFileCyclNum830Counter = -1;
     public boolean isFtssFileCyclNum830Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFtssFileCyclNum830Counter != sharedCounter;
         localFtssFileCyclNum830Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ftssFileCyclNum830
	 *	@return ftssFileCyclNum830
	 */
	public char[]  getFtssFileCyclNum830String() {
	     return getCharArray(beginFtssFileCyclNum830,FTSS_FILE_CYCL_NUM_830_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ftssFileCyclNum830IsNumeric() {
	    return isNumeric(beginFtssFileCyclNum830
	                    ,beginFtssFileCyclNum830 + FTSS_FILE_CYCL_NUM_830_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FTSS_FILE_CYCL_NUM_830_LEN = 2;
  	/**
	 * serializeFtssFileCyclNum830
	 */
	protected void serializeFtssFileCyclNum830(int ftssFileCyclNum830) {
		 putNumber(beginFtssFileCyclNum830,ftssFileCyclNum830,FTSS_FILE_CYCL_NUM_830_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFtssFileCyclNum830Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFtssFileCyclNum830
	 */
   	protected  int serializeFtssFileCyclNum830(char[] value) {
	    int  ftssFileCyclNum830;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ftssFileCyclNum830 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginFtssFileCyclNum830
		       ,2
		      );
		 localFtssFileCyclNum830Counter = shareString.getSerializedField().getModifiedCounter();
		return  ftssFileCyclNum830;
    }

   protected int checkFtssFileCyclNum830MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFtssFileCyclNum830 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFtssFileCyclNum830() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFtssFileCyclNum830
			                 ,FTSS_FILE_CYCL_NUM_830_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ftssFileCyclNum830", beginFtssFileCyclNum830,FTSS_FILE_CYCL_NUM_830_LEN);
    }
   	}




}
  
