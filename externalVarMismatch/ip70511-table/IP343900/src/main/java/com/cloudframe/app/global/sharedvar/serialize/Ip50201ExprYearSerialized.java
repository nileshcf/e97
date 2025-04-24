package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50201ExprYearSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50201ExprYearSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50201ExprYearSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50201_EXPR_YEAR_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50201ExprCc;
            protected  int beginIp50201ExprYy;
	
	/**
	* Constructor for Ip50201ExprYearSerialized
	**/
    public Ip50201ExprYearSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50201ExprYearSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ExprYearSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50201ExprYearSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,21); // serialize this field at offset 21 by default 
    }
    
	/**
	* sets parent for this Ip50201ExprYearSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 21 by default
    }    
	/**
	* initializes the field in Ip50201ExprYearSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50201_EXPR_YEAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50201ExprCc = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50201ExprYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50201ExprCcCounter = -1;
     public boolean isIp50201ExprCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201ExprCcCounter != sharedCounter;
         localIp50201ExprCcCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_EXPR_CC_LEN = 2;
	/**
	 * 	serialize this Ip50201ExprCc
	 */
   protected void serializeIp50201ExprCc(char[] ip50201ExprCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201ExprCc,0,getStringValue(),beginIp50201ExprCc,IP_50201_EXPR_CC_LEN);
       localIp50201ExprCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201ExprCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50201ExprCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201ExprCc() {	 
   		return (substring(getStringValue(),beginIp50201ExprCc,beginIp50201ExprCc + IP_50201_EXPR_CC_LEN));
   	}
     int localIp50201ExprYyCounter = -1;
     public boolean isIp50201ExprYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201ExprYyCounter != sharedCounter;
         localIp50201ExprYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_EXPR_YY_LEN = 2;
	/**
	 * 	serialize this Ip50201ExprYy
	 */
   protected void serializeIp50201ExprYy(char[] ip50201ExprYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201ExprYy,0,getStringValue(),beginIp50201ExprYy,IP_50201_EXPR_YY_LEN);
       localIp50201ExprYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201ExprYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50201ExprYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201ExprYy() {	 
   		return (substring(getStringValue(),beginIp50201ExprYy,beginIp50201ExprYy + IP_50201_EXPR_YY_LEN));
   	}




}
  
