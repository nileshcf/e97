package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040CardHldrBlngCurSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040CardHldrBlngCurSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040CardHldrBlngCurSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_CARD_HLDR_BLNG_CUR_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040CardMastDfltCur;
            protected  int beginIp0040CardMastDfltExp;
           protected int beginIp0040PrimaryCrncyTbl;
           protected static final int IP_0040_PRIMARY_CRNCY_TBL_SIZE = 4;
	
	/**
	* Constructor for Ip0040CardHldrBlngCurSerialized
	**/
    public Ip0040CardHldrBlngCurSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040CardHldrBlngCurSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040CardHldrBlngCurSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040CardHldrBlngCurSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,109); // serialize this field at offset 109 by default 
    }
    
	/**
	* sets parent for this Ip0040CardHldrBlngCurSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 109 by default
    }    
	/**
	* initializes the field in Ip0040CardHldrBlngCurSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_CARD_HLDR_BLNG_CUR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040CardMastDfltCur = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040CardMastDfltExp = getStartOffset() + 3;	// set offset for serialization
  
	        beginIp0040PrimaryCrncyTbl = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040CardMastDfltCurCounter = -1;
     public boolean isIp0040CardMastDfltCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CardMastDfltCurCounter != sharedCounter;
         localIp0040CardMastDfltCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040CardMastDfltCur
	 *	@return ip0040CardMastDfltCur
	 */
	public char[]  getIp0040CardMastDfltCurString() {
	     return getCharArray(beginIp0040CardMastDfltCur,IP_0040_CARD_MAST_DFLT_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040CardMastDfltCurIsNumeric() {
	    return isNumeric(beginIp0040CardMastDfltCur
	                    ,beginIp0040CardMastDfltCur + IP_0040_CARD_MAST_DFLT_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_CARD_MAST_DFLT_CUR_LEN = 3;
  	/**
	 * serializeIp0040CardMastDfltCur
	 */
	protected void serializeIp0040CardMastDfltCur(int ip0040CardMastDfltCur) {
		 putNumber(beginIp0040CardMastDfltCur,ip0040CardMastDfltCur,IP_0040_CARD_MAST_DFLT_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040CardMastDfltCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040CardMastDfltCur
	 */
   	protected  int serializeIp0040CardMastDfltCur(char[] value) {
	    int  ip0040CardMastDfltCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040CardMastDfltCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0040CardMastDfltCur
		       ,3
		      );
		 localIp0040CardMastDfltCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040CardMastDfltCur;
    }

   protected int checkIp0040CardMastDfltCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040CardMastDfltCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040CardMastDfltCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040CardMastDfltCur
			                 ,IP_0040_CARD_MAST_DFLT_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040CardMastDfltCur", beginIp0040CardMastDfltCur,IP_0040_CARD_MAST_DFLT_CUR_LEN);
    }
   	}
     int localIp0040CardMastDfltExpCounter = -1;
     public boolean isIp0040CardMastDfltExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CardMastDfltExpCounter != sharedCounter;
         localIp0040CardMastDfltExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040CardMastDfltExp
	 *	@return ip0040CardMastDfltExp
	 */
	public char[]  getIp0040CardMastDfltExpString() {
	     return getCharArray(beginIp0040CardMastDfltExp,IP_0040_CARD_MAST_DFLT_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040CardMastDfltExpIsNumeric() {
	    return isNumeric(beginIp0040CardMastDfltExp
	                    ,beginIp0040CardMastDfltExp + IP_0040_CARD_MAST_DFLT_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_CARD_MAST_DFLT_EXP_LEN = 1;
  	/**
	 * serializeIp0040CardMastDfltExp
	 */
	protected void serializeIp0040CardMastDfltExp(int ip0040CardMastDfltExp) {
		 putNumber(beginIp0040CardMastDfltExp,ip0040CardMastDfltExp,IP_0040_CARD_MAST_DFLT_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040CardMastDfltExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040CardMastDfltExp
	 */
   	protected  int serializeIp0040CardMastDfltExp(char[] value) {
	    int  ip0040CardMastDfltExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040CardMastDfltExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp0040CardMastDfltExp
		       ,1
		      );
		 localIp0040CardMastDfltExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040CardMastDfltExp;
    }

   protected int checkIp0040CardMastDfltExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040CardMastDfltExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040CardMastDfltExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040CardMastDfltExp
			                 ,IP_0040_CARD_MAST_DFLT_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040CardMastDfltExp", beginIp0040CardMastDfltExp,IP_0040_CARD_MAST_DFLT_EXP_LEN);
    }
   	}

		public int ip0040PrimaryCrncyTblSize() {
			return IP_0040_PRIMARY_CRNCY_TBL_SIZE;
		}



}
  
