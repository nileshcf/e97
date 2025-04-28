package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip31021SummaryControlCardSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip31021SummaryControlCardSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip31021SummaryControlCardSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_31021_SUMMARY_CONTROL_CARD_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp31021InputSource;
            protected  int beginIp31021SummarySif;
            protected  int beginIp31021SummaryCycle;
	
	/**
	* Constructor for Ip31021SummaryControlCardSerialized
	**/
    public Ip31021SummaryControlCardSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip31021SummaryControlCardSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_31021_SUMMARY_CONTROL_CARD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp31021InputSource = getStartOffset() + 0;	// set offset for serialization
  
             beginIp31021SummarySif = getStartOffset() + 10;	// set offset for serialization
  
             beginIp31021SummaryCycle = getStartOffset() + 11;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp31021InputSourceCounter = -1;
     public boolean isIp31021InputSourceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp31021InputSourceCounter != sharedCounter;
         localIp31021InputSourceCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_31021_INPUT_SOURCE_LEN = 10;
	/**
	 * 	serialize this Ip31021InputSource
	 */
   protected void serializeIp31021InputSource(char[] ip31021InputSource) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip31021InputSource,0,getStringValue(),beginIp31021InputSource,IP_31021_INPUT_SOURCE_LEN);
       localIp31021InputSourceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp31021InputSourceConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp31021InputSource is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp31021InputSource() {	 
   		return (substring(getStringValue(),beginIp31021InputSource,beginIp31021InputSource + IP_31021_INPUT_SOURCE_LEN));
   	}
     int localIp31021SummarySifCounter = -1;
     public boolean isIp31021SummarySifModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp31021SummarySifCounter != sharedCounter;
         localIp31021SummarySifCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_31021_SUMMARY_SIF_LEN = 1;
	/**
	 * 	serialize this Ip31021SummarySif
	 */
   protected void serializeIp31021SummarySif(char[] ip31021SummarySif) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip31021SummarySif,0,getStringValue(),beginIp31021SummarySif,IP_31021_SUMMARY_SIF_LEN);
       localIp31021SummarySifCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp31021SummarySifConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp31021SummarySif is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp31021SummarySif() {	 
   		return (substring(getStringValue(),beginIp31021SummarySif,beginIp31021SummarySif + IP_31021_SUMMARY_SIF_LEN));
   	}
     int localIp31021SummaryCycleCounter = -1;
     public boolean isIp31021SummaryCycleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp31021SummaryCycleCounter != sharedCounter;
         localIp31021SummaryCycleCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip31021SummaryCycle
	 *	@return ip31021SummaryCycle
	 */
	public char[]  getIp31021SummaryCycleString() {
	     return getCharArray(beginIp31021SummaryCycle,IP_31021_SUMMARY_CYCLE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip31021SummaryCycleIsNumeric() {
	    return isNumeric(beginIp31021SummaryCycle
	                    ,beginIp31021SummaryCycle + IP_31021_SUMMARY_CYCLE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_31021_SUMMARY_CYCLE_LEN = 1;
  	/**
	 * serializeIp31021SummaryCycle
	 */
	protected void serializeIp31021SummaryCycle(int ip31021SummaryCycle) {
		 putNumber(beginIp31021SummaryCycle,ip31021SummaryCycle,IP_31021_SUMMARY_CYCLE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp31021SummaryCycleCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp31021SummaryCycle
	 */
   	protected  int serializeIp31021SummaryCycle(char[] value) {
	    int  ip31021SummaryCycle;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip31021SummaryCycle = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp31021SummaryCycle
		       ,1
		      );
		 localIp31021SummaryCycleCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip31021SummaryCycle;
    }

   protected int checkIp31021SummaryCycleMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp31021SummaryCycle is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp31021SummaryCycle() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp31021SummaryCycle
			                 ,IP_31021_SUMMARY_CYCLE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip31021SummaryCycle", beginIp31021SummaryCycle,IP_31021_SUMMARY_CYCLE_LEN);
    }
   	}




}
  
