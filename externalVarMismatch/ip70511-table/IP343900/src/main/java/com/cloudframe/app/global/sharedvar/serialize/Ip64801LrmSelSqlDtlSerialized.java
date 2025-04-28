package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip64801LrmSelSqlDtlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip64801LrmSelSqlDtlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip64801LrmSelSqlDtlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_64801_LRM_SEL_SQL_DTL_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp64801LrmSelSqlNum;
            protected  int beginIp64801LrmSelSqlMod;
	
	/**
	* Constructor for Ip64801LrmSelSqlDtlSerialized
	**/
    public Ip64801LrmSelSqlDtlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip64801LrmSelSqlDtlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip64801LrmSelSqlDtlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip64801LrmSelSqlDtlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14); // serialize this field at offset 14 by default 
    }
    
	/**
	* sets parent for this Ip64801LrmSelSqlDtlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14 by default
    }    
	/**
	* initializes the field in Ip64801LrmSelSqlDtlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_64801_LRM_SEL_SQL_DTL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp64801LrmSelSqlNum = getStartOffset() + 0;	// set offset for serialization
  
             beginIp64801LrmSelSqlMod = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp64801LrmSelSqlNumCounter = -1;
     public boolean isIp64801LrmSelSqlNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmSelSqlNumCounter != sharedCounter;
         localIp64801LrmSelSqlNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip64801LrmSelSqlNum
	 *	@return ip64801LrmSelSqlNum
	 */
	public char[]  getIp64801LrmSelSqlNumString() {
	     return getCharArray(beginIp64801LrmSelSqlNum,IP_64801_LRM_SEL_SQL_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip64801LrmSelSqlNumIsNumeric() {
	    return isNumeric(beginIp64801LrmSelSqlNum
	                    ,beginIp64801LrmSelSqlNum + IP_64801_LRM_SEL_SQL_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_64801_LRM_SEL_SQL_NUM_LEN = 2;
  	/**
	 * serializeIp64801LrmSelSqlNum
	 */
	protected void serializeIp64801LrmSelSqlNum(int ip64801LrmSelSqlNum) {
		 putNumber(beginIp64801LrmSelSqlNum,ip64801LrmSelSqlNum,IP_64801_LRM_SEL_SQL_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp64801LrmSelSqlNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp64801LrmSelSqlNum
	 */
   	protected  int serializeIp64801LrmSelSqlNum(char[] value) {
	    int  ip64801LrmSelSqlNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip64801LrmSelSqlNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp64801LrmSelSqlNum
		       ,2
		      );
		 localIp64801LrmSelSqlNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip64801LrmSelSqlNum;
    }

   protected int checkIp64801LrmSelSqlNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp64801LrmSelSqlNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp64801LrmSelSqlNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp64801LrmSelSqlNum
			                 ,IP_64801_LRM_SEL_SQL_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip64801LrmSelSqlNum", beginIp64801LrmSelSqlNum,IP_64801_LRM_SEL_SQL_NUM_LEN);
    }
   	}
     int localIp64801LrmSelSqlModCounter = -1;
     public boolean isIp64801LrmSelSqlModModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmSelSqlModCounter != sharedCounter;
         localIp64801LrmSelSqlModCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_64801_LRM_SEL_SQL_MOD_LEN = 8;
	/**
	 * 	serialize this Ip64801LrmSelSqlMod
	 */
   protected void serializeIp64801LrmSelSqlMod(char[] ip64801LrmSelSqlMod) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip64801LrmSelSqlMod,0,getStringValue(),beginIp64801LrmSelSqlMod,IP_64801_LRM_SEL_SQL_MOD_LEN);
       localIp64801LrmSelSqlModCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp64801LrmSelSqlModConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp64801LrmSelSqlMod is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp64801LrmSelSqlMod() {	 
   		return (substring(getStringValue(),beginIp64801LrmSelSqlMod,beginIp64801LrmSelSqlMod + IP_64801_LRM_SEL_SQL_MOD_LEN));
   	}




}
  
