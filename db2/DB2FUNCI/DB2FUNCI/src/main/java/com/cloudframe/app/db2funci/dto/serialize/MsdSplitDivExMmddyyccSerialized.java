package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdSplitDivExMmddyyccSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdSplitDivExMmddyyccSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdSplitDivExMmddyyccSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_SPLIT_DIV_EX_MMDDYYCC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdSplitDivExMmddyy;
            protected  int beginMsdSplitDivExCc;
	
	/**
	* Constructor for MsdSplitDivExMmddyyccSerialized
	**/
    public MsdSplitDivExMmddyyccSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdSplitDivExMmddyyccSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSplitDivExMmddyyccSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdSplitDivExMmddyyccSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1779); // serialize this field at offset 1779 by default 
    }
    
	/**
	* sets parent for this MsdSplitDivExMmddyyccSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1779 by default
    }    
	/**
	* initializes the field in MsdSplitDivExMmddyyccSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_SPLIT_DIV_EX_MMDDYYCC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdSplitDivExMmddyy = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdSplitDivExCc = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdSplitDivExMmddyyCounter = -1;
     public boolean isMsdSplitDivExMmddyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSplitDivExMmddyyCounter != sharedCounter;
         localMsdSplitDivExMmddyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdSplitDivExMmddyy
	 *	@return msdSplitDivExMmddyy
	 */
	public char[]  getMsdSplitDivExMmddyyString() {
	     return getCharArray(beginMsdSplitDivExMmddyy,MSD_SPLIT_DIV_EX_MMDDYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSplitDivExMmddyyIsNumeric() {
	    return isNumeric(beginMsdSplitDivExMmddyy
	                    ,beginMsdSplitDivExMmddyy + MSD_SPLIT_DIV_EX_MMDDYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_SPLIT_DIV_EX_MMDDYY_LEN = 6;
  	/**
	 * serializeMsdSplitDivExMmddyy
	 */
	protected void serializeMsdSplitDivExMmddyy(long msdSplitDivExMmddyy) {
		 putNumber(beginMsdSplitDivExMmddyy,msdSplitDivExMmddyy,MSD_SPLIT_DIV_EX_MMDDYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSplitDivExMmddyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdSplitDivExMmddyy
	 */
   	protected  long serializeMsdSplitDivExMmddyy(char[] value) {
	    long  msdSplitDivExMmddyy;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdSplitDivExMmddyy = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMsdSplitDivExMmddyy
		       ,6
		      );
		 localMsdSplitDivExMmddyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdSplitDivExMmddyy;
    }

   protected long checkMsdSplitDivExMmddyyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdSplitDivExMmddyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdSplitDivExMmddyy() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdSplitDivExMmddyy
			                 ,MSD_SPLIT_DIV_EX_MMDDYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSplitDivExMmddyy", beginMsdSplitDivExMmddyy,MSD_SPLIT_DIV_EX_MMDDYY_LEN);
    }
   	}
     int localMsdSplitDivExCcCounter = -1;
     public boolean isMsdSplitDivExCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSplitDivExCcCounter != sharedCounter;
         localMsdSplitDivExCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdSplitDivExCc
	 *	@return msdSplitDivExCc
	 */
	public char[]  getMsdSplitDivExCcString() {
	     return getCharArray(beginMsdSplitDivExCc,MSD_SPLIT_DIV_EX_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdSplitDivExCcIsNumeric() {
	    return isNumeric(beginMsdSplitDivExCc
	                    ,beginMsdSplitDivExCc + MSD_SPLIT_DIV_EX_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_SPLIT_DIV_EX_CC_LEN = 2;
  	/**
	 * serializeMsdSplitDivExCc
	 */
	protected void serializeMsdSplitDivExCc(int msdSplitDivExCc) {
		 putNumber(beginMsdSplitDivExCc,msdSplitDivExCc,MSD_SPLIT_DIV_EX_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdSplitDivExCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdSplitDivExCc
	 */
   	protected  int serializeMsdSplitDivExCc(char[] value) {
	    int  msdSplitDivExCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdSplitDivExCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMsdSplitDivExCc
		       ,2
		      );
		 localMsdSplitDivExCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdSplitDivExCc;
    }

   protected int checkMsdSplitDivExCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdSplitDivExCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdSplitDivExCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdSplitDivExCc
			                 ,MSD_SPLIT_DIV_EX_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdSplitDivExCc", beginMsdSplitDivExCc,MSD_SPLIT_DIV_EX_CC_LEN);
    }
   	}




}
  
