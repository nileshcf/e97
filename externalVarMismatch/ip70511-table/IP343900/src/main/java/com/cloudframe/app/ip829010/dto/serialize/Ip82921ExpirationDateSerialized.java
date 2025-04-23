package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Ip82921ExpirationDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip82921ExpirationDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip82921ExpirationDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_82921_EXPIRATION_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp82921ExprMonth;
	
	/**
	* Constructor for Ip82921ExpirationDateSerialized
	**/
    public Ip82921ExpirationDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip82921ExpirationDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ExpirationDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip82921ExpirationDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,87); // serialize this field at offset 87 by default 
    }
    
	/**
	* sets parent for this Ip82921ExpirationDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 87 by default
    }    
	/**
	* initializes the field in Ip82921ExpirationDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_82921_EXPIRATION_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp82921ExprMonth = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp82921ExprMonthCounter = -1;
     public boolean isIp82921ExprMonthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ExprMonthCounter != sharedCounter;
         localIp82921ExprMonthCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_EXPR_MONTH_LEN = 2;
	/**
	 * 	serialize this Ip82921ExprMonth
	 */
   protected void serializeIp82921ExprMonth(char[] ip82921ExprMonth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ExprMonth,0,getStringValue(),beginIp82921ExprMonth,IP_82921_EXPR_MONTH_LEN);
       localIp82921ExprMonthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ExprMonthConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp82921ExprMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ExprMonth() {	 
   		return (substring(getStringValue(),beginIp82921ExprMonth,beginIp82921ExprMonth + IP_82921_EXPR_MONTH_LEN));
   	}




}
  
