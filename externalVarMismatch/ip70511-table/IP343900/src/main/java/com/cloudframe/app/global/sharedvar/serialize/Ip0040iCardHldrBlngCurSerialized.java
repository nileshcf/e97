package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0040iCardHldrBlngCurSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040iCardHldrBlngCurSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040iCardHldrBlngCurSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040I_CARD_HLDR_BLNG_CUR_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040iCardMastDfltCur;
            protected  int beginIp0040iCardMastDfltExp;
           protected int beginIp0040iPrimaryCrncyTbl;
           protected static final int IP_0040I_PRIMARY_CRNCY_TBL_SIZE = 4;
	
	/**
	* Constructor for Ip0040iCardHldrBlngCurSerialized
	**/
    public Ip0040iCardHldrBlngCurSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040iCardHldrBlngCurSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iCardHldrBlngCurSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040iCardHldrBlngCurSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,58); // serialize this field at offset 58 by default 
    }
    
	/**
	* sets parent for this Ip0040iCardHldrBlngCurSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 58 by default
    }    
	/**
	* initializes the field in Ip0040iCardHldrBlngCurSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040I_CARD_HLDR_BLNG_CUR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040iCardMastDfltCur = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040iCardMastDfltExp = getStartOffset() + 3;	// set offset for serialization
  
	        beginIp0040iPrimaryCrncyTbl = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040iCardMastDfltCurCounter = -1;
     public boolean isIp0040iCardMastDfltCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCardMastDfltCurCounter != sharedCounter;
         localIp0040iCardMastDfltCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iCardMastDfltCur
	 *	@return ip0040iCardMastDfltCur
	 */
	public char[]  getIp0040iCardMastDfltCurString() {
	     return getCharArray(beginIp0040iCardMastDfltCur,IP_0040I_CARD_MAST_DFLT_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iCardMastDfltCurIsNumeric() {
	    return isNumeric(beginIp0040iCardMastDfltCur
	                    ,beginIp0040iCardMastDfltCur + IP_0040I_CARD_MAST_DFLT_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_CARD_MAST_DFLT_CUR_LEN = 3;
  	/**
	 * serializeIp0040iCardMastDfltCur
	 */
	protected void serializeIp0040iCardMastDfltCur(int ip0040iCardMastDfltCur) {
		 putNumber(beginIp0040iCardMastDfltCur,ip0040iCardMastDfltCur,IP_0040I_CARD_MAST_DFLT_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iCardMastDfltCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iCardMastDfltCur
	 */
   	protected  int serializeIp0040iCardMastDfltCur(char[] value) {
	    int  ip0040iCardMastDfltCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iCardMastDfltCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0040iCardMastDfltCur
		       ,3
		      );
		 localIp0040iCardMastDfltCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iCardMastDfltCur;
    }

   protected int checkIp0040iCardMastDfltCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iCardMastDfltCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iCardMastDfltCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iCardMastDfltCur
			                 ,IP_0040I_CARD_MAST_DFLT_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iCardMastDfltCur", beginIp0040iCardMastDfltCur,IP_0040I_CARD_MAST_DFLT_CUR_LEN);
    }
   	}
     int localIp0040iCardMastDfltExpCounter = -1;
     public boolean isIp0040iCardMastDfltExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCardMastDfltExpCounter != sharedCounter;
         localIp0040iCardMastDfltExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iCardMastDfltExp
	 *	@return ip0040iCardMastDfltExp
	 */
	public char[]  getIp0040iCardMastDfltExpString() {
	     return getCharArray(beginIp0040iCardMastDfltExp,IP_0040I_CARD_MAST_DFLT_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iCardMastDfltExpIsNumeric() {
	    return isNumeric(beginIp0040iCardMastDfltExp
	                    ,beginIp0040iCardMastDfltExp + IP_0040I_CARD_MAST_DFLT_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_CARD_MAST_DFLT_EXP_LEN = 1;
  	/**
	 * serializeIp0040iCardMastDfltExp
	 */
	protected void serializeIp0040iCardMastDfltExp(int ip0040iCardMastDfltExp) {
		 putNumber(beginIp0040iCardMastDfltExp,ip0040iCardMastDfltExp,IP_0040I_CARD_MAST_DFLT_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iCardMastDfltExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iCardMastDfltExp
	 */
   	protected  int serializeIp0040iCardMastDfltExp(char[] value) {
	    int  ip0040iCardMastDfltExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iCardMastDfltExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp0040iCardMastDfltExp
		       ,1
		      );
		 localIp0040iCardMastDfltExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iCardMastDfltExp;
    }

   protected int checkIp0040iCardMastDfltExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iCardMastDfltExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iCardMastDfltExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iCardMastDfltExp
			                 ,IP_0040I_CARD_MAST_DFLT_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iCardMastDfltExp", beginIp0040iCardMastDfltExp,IP_0040I_CARD_MAST_DFLT_EXP_LEN);
    }
   	}

		public int ip0040iPrimaryCrncyTblSize() {
			return IP_0040I_PRIMARY_CRNCY_TBL_SIZE;
		}



}
  
