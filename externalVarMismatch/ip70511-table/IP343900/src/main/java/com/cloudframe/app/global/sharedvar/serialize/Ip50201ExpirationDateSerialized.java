package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50201ExpirationDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50201ExpirationDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50201ExpirationDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50201_EXPIRATION_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50201ExprMonth;
	
	/**
	* Constructor for Ip50201ExpirationDateSerialized
	**/
    public Ip50201ExpirationDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50201ExpirationDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ExpirationDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50201ExpirationDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip50201ExpirationDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip50201ExpirationDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50201_EXPIRATION_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50201ExprMonth = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp50201ExprMonthCounter = -1;
     public boolean isIp50201ExprMonthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201ExprMonthCounter != sharedCounter;
         localIp50201ExprMonthCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_EXPR_MONTH_LEN = 2;
	/**
	 * 	serialize this Ip50201ExprMonth
	 */
   protected void serializeIp50201ExprMonth(char[] ip50201ExprMonth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201ExprMonth,0,getStringValue(),beginIp50201ExprMonth,IP_50201_EXPR_MONTH_LEN);
       localIp50201ExprMonthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201ExprMonthConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50201ExprMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201ExprMonth() {	 
   		return (substring(getStringValue(),beginIp50201ExprMonth,beginIp50201ExprMonth + IP_50201_EXPR_MONTH_LEN));
   	}




}
  
