package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip33701TargetCurExp9GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip33701TargetCurExp9GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip33701TargetCurExp9GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_33701_TARGET_CUR_EXP_9_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp33701TargetCurExp9;
            protected  int beginIp33701TargetCurExp;
	
	/**
	* Constructor for Ip33701TargetCurExp9GroupSerialized
	**/
    public Ip33701TargetCurExp9GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip33701TargetCurExp9GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_33701_TARGET_CUR_EXP_9_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp33701TargetCurExp9 = getStartOffset() + 0;	// set offset for serialization
  
             beginIp33701TargetCurExp = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp33701TargetCurExp9Counter = -1;
     public boolean isIp33701TargetCurExp9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetCurExp9Counter != sharedCounter;
         localIp33701TargetCurExp9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip33701TargetCurExp9
	 *	@return ip33701TargetCurExp9
	 */
	public char[]  getIp33701TargetCurExp9String() {
	     return getCharArray(beginIp33701TargetCurExp9,IP_33701_TARGET_CUR_EXP_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurExp9IsNumeric() {
	    return isNumeric(beginIp33701TargetCurExp9
	                    ,beginIp33701TargetCurExp9 + IP_33701_TARGET_CUR_EXP_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_33701_TARGET_CUR_EXP_9_LEN = 1;
  	/**
	 * serializeIp33701TargetCurExp9
	 */
	protected void serializeIp33701TargetCurExp9(int ip33701TargetCurExp9) {
		 putNumber(beginIp33701TargetCurExp9,ip33701TargetCurExp9,IP_33701_TARGET_CUR_EXP_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp33701TargetCurExp9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp33701TargetCurExp9
	 */
   	protected  int serializeIp33701TargetCurExp9(char[] value) {
	    int  ip33701TargetCurExp9;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip33701TargetCurExp9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp33701TargetCurExp9
		       ,1
		      );
		 localIp33701TargetCurExp9Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip33701TargetCurExp9;
    }

   protected int checkIp33701TargetCurExp9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp33701TargetCurExp9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp33701TargetCurExp9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp33701TargetCurExp9
			                 ,IP_33701_TARGET_CUR_EXP_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip33701TargetCurExp9", beginIp33701TargetCurExp9,IP_33701_TARGET_CUR_EXP_9_LEN);
    }
   	}
     int localIp33701TargetCurExpCounter = -1;
     public boolean isIp33701TargetCurExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp33701TargetCurExpCounter != sharedCounter;
         localIp33701TargetCurExpCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_33701_TARGET_CUR_EXP_LEN = 1;
	/**
	 * 	serialize this Ip33701TargetCurExp
	 */
   protected void serializeIp33701TargetCurExp(char[] ip33701TargetCurExp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip33701TargetCurExp,0,getStringValue(),beginIp33701TargetCurExp,IP_33701_TARGET_CUR_EXP_LEN);
       localIp33701TargetCurExpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp33701TargetCurExpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp33701TargetCurExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp33701TargetCurExp() {	 
   		return (substring(getStringValue(),beginIp33701TargetCurExp,beginIp33701TargetCurExp + IP_33701_TARGET_CUR_EXP_LEN));
   	}




}
  
