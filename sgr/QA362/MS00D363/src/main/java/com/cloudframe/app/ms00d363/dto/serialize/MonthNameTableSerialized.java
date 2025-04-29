package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class MonthNameTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MonthNameTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonthNameTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MONTH_NAME_TABLE_LENGTH = 134;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMntMaxOccurs;
            protected  int beginMntLiterals;
	
	/**
	* Constructor for MonthNameTableSerialized
	**/
    public MonthNameTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MonthNameTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MONTH_NAME_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMntMaxOccurs = getStartOffset() + 0;	// set offset for serialization
  
             beginMntLiterals = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMntMaxOccursCounter = -1;
     public boolean isMntMaxOccursModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMntMaxOccursCounter != sharedCounter;
         localMntMaxOccursCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mntMaxOccurs
	 *	@return mntMaxOccurs
	 */
	public char[]  getMntMaxOccursString() {
	     return getCharArray(beginMntMaxOccurs,MNT_MAX_OCCURS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mntMaxOccursIsNumeric() {
	    return isNumeric(beginMntMaxOccurs
	                    ,beginMntMaxOccurs + MNT_MAX_OCCURS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MNT_MAX_OCCURS_LEN = 2;
  	/**
	 * serializeMntMaxOccurs
	 */
	protected void serializeMntMaxOccurs(int mntMaxOccurs) {
		 putNumber(beginMntMaxOccurs,mntMaxOccurs,MNT_MAX_OCCURS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMntMaxOccursCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMntMaxOccurs
	 */
   	protected  int serializeMntMaxOccurs(char[] value) {
	    int  mntMaxOccurs;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mntMaxOccurs = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMntMaxOccurs
		       ,2
		      );
		 localMntMaxOccursCounter = shareString.getSerializedField().getModifiedCounter();
		return  mntMaxOccurs;
    }

   protected int checkMntMaxOccursMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMntMaxOccurs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMntMaxOccurs() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMntMaxOccurs
			                 ,MNT_MAX_OCCURS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mntMaxOccurs", beginMntMaxOccurs,MNT_MAX_OCCURS_LEN);
    }
   	}
     int localMntLiteralsCounter = -1;
     public boolean isMntLiteralsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMntLiteralsCounter != sharedCounter;
         localMntLiteralsCounter = sharedCounter; return hasModified;
     }
	protected static final int MNT_LITERALS_LEN = 132;
	/**
	 * 	serialize this MntLiterals
	 */
   protected void serializeMntLiterals(char[] mntLiterals) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mntLiterals,0,getStringValue(),beginMntLiterals,MNT_LITERALS_LEN);
       localMntLiteralsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMntLiteralsConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
    /**
	 *	refreshMntLiterals is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMntLiterals() {	 
   		return (substring(getStringValue(),beginMntLiterals,beginMntLiterals + MNT_LITERALS_LEN));
   	}




}
  
