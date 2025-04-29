package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404CardHldrBlngCurSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404CardHldrBlngCurSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404CardHldrBlngCurSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_CARD_HLDR_BLNG_CUR_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404CardMastDfltCur;
            protected  int beginIp00404CardMastDfltExp;
           protected int beginIp00404PrimaryCrncyTbl;
           protected static final int IP_00404_PRIMARY_CRNCY_TBL_SIZE = 4;
	
	/**
	* Constructor for Ip00404CardHldrBlngCurSerialized
	**/
    public Ip00404CardHldrBlngCurSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404CardHldrBlngCurSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404CardHldrBlngCurSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404CardHldrBlngCurSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,100); // serialize this field at offset 100 by default 
    }
    
	/**
	* sets parent for this Ip00404CardHldrBlngCurSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 100 by default
    }    
	/**
	* initializes the field in Ip00404CardHldrBlngCurSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_CARD_HLDR_BLNG_CUR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00404CardMastDfltCur = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00404CardMastDfltExp = getStartOffset() + 3;	// set offset for serialization
  
	        beginIp00404PrimaryCrncyTbl = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00404CardMastDfltCurCounter = -1;
     public boolean isIp00404CardMastDfltCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CardMastDfltCurCounter != sharedCounter;
         localIp00404CardMastDfltCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404CardMastDfltCur
	 *	@return ip00404CardMastDfltCur
	 */
	public char[]  getIp00404CardMastDfltCurString() {
	     return getCharArray(beginIp00404CardMastDfltCur,IP_00404_CARD_MAST_DFLT_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404CardMastDfltCurIsNumeric() {
	    return isNumeric(beginIp00404CardMastDfltCur
	                    ,beginIp00404CardMastDfltCur + IP_00404_CARD_MAST_DFLT_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_CARD_MAST_DFLT_CUR_LEN = 3;
  	/**
	 * serializeIp00404CardMastDfltCur
	 */
	protected void serializeIp00404CardMastDfltCur(int ip00404CardMastDfltCur) {
		 putNumber(beginIp00404CardMastDfltCur,ip00404CardMastDfltCur,IP_00404_CARD_MAST_DFLT_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404CardMastDfltCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404CardMastDfltCur
	 */
   	protected  int serializeIp00404CardMastDfltCur(char[] value) {
	    int  ip00404CardMastDfltCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404CardMastDfltCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00404CardMastDfltCur
		       ,3
		      );
		 localIp00404CardMastDfltCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404CardMastDfltCur;
    }

   protected int checkIp00404CardMastDfltCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404CardMastDfltCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404CardMastDfltCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404CardMastDfltCur
			                 ,IP_00404_CARD_MAST_DFLT_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404CardMastDfltCur", beginIp00404CardMastDfltCur,IP_00404_CARD_MAST_DFLT_CUR_LEN);
    }
   	}
     int localIp00404CardMastDfltExpCounter = -1;
     public boolean isIp00404CardMastDfltExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CardMastDfltExpCounter != sharedCounter;
         localIp00404CardMastDfltExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404CardMastDfltExp
	 *	@return ip00404CardMastDfltExp
	 */
	public char[]  getIp00404CardMastDfltExpString() {
	     return getCharArray(beginIp00404CardMastDfltExp,IP_00404_CARD_MAST_DFLT_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404CardMastDfltExpIsNumeric() {
	    return isNumeric(beginIp00404CardMastDfltExp
	                    ,beginIp00404CardMastDfltExp + IP_00404_CARD_MAST_DFLT_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_CARD_MAST_DFLT_EXP_LEN = 1;
  	/**
	 * serializeIp00404CardMastDfltExp
	 */
	protected void serializeIp00404CardMastDfltExp(int ip00404CardMastDfltExp) {
		 putNumber(beginIp00404CardMastDfltExp,ip00404CardMastDfltExp,IP_00404_CARD_MAST_DFLT_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404CardMastDfltExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404CardMastDfltExp
	 */
   	protected  int serializeIp00404CardMastDfltExp(char[] value) {
	    int  ip00404CardMastDfltExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404CardMastDfltExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00404CardMastDfltExp
		       ,1
		      );
		 localIp00404CardMastDfltExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404CardMastDfltExp;
    }

   protected int checkIp00404CardMastDfltExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404CardMastDfltExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404CardMastDfltExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404CardMastDfltExp
			                 ,IP_00404_CARD_MAST_DFLT_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404CardMastDfltExp", beginIp00404CardMastDfltExp,IP_00404_CARD_MAST_DFLT_EXP_LEN);
    }
   	}

		public int ip00404PrimaryCrncyTblSize() {
			return IP_00404_PRIMARY_CRNCY_TBL_SIZE;
		}



}
  
