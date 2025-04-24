package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50211ExprYearSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50211ExprYearSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50211ExprYearSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50211_EXPR_YEAR_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50211ExprCc;
            protected  int beginIp50211ExprYy;
	
	/**
	* Constructor for Ip50211ExprYearSerialized
	**/
    public Ip50211ExprYearSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50211ExprYearSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211ExprYearSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50211ExprYearSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,21); // serialize this field at offset 21 by default 
    }
    
	/**
	* sets parent for this Ip50211ExprYearSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 21 by default
    }    
	/**
	* initializes the field in Ip50211ExprYearSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50211_EXPR_YEAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50211ExprCc = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50211ExprYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50211ExprCcCounter = -1;
     public boolean isIp50211ExprCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ExprCcCounter != sharedCounter;
         localIp50211ExprCcCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_EXPR_CC_LEN = 2;
	/**
	 * 	serialize this Ip50211ExprCc
	 */
   protected void serializeIp50211ExprCc(char[] ip50211ExprCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211ExprCc,0,getStringValue(),beginIp50211ExprCc,IP_50211_EXPR_CC_LEN);
       localIp50211ExprCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211ExprCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50211ExprCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211ExprCc() {	 
   		return (substring(getStringValue(),beginIp50211ExprCc,beginIp50211ExprCc + IP_50211_EXPR_CC_LEN));
   	}
     int localIp50211ExprYyCounter = -1;
     public boolean isIp50211ExprYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ExprYyCounter != sharedCounter;
         localIp50211ExprYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_EXPR_YY_LEN = 2;
	/**
	 * 	serialize this Ip50211ExprYy
	 */
   protected void serializeIp50211ExprYy(char[] ip50211ExprYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211ExprYy,0,getStringValue(),beginIp50211ExprYy,IP_50211_EXPR_YY_LEN);
       localIp50211ExprYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211ExprYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50211ExprYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211ExprYy() {	 
   		return (substring(getStringValue(),beginIp50211ExprYy,beginIp50211ExprYy + IP_50211_EXPR_YY_LEN));
   	}




}
  
