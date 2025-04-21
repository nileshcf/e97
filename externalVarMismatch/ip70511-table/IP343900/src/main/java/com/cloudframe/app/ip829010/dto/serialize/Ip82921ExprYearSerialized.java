package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Ip82921ExprYearSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip82921ExprYearSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip82921ExprYearSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_82921_EXPR_YEAR_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp82921ExprCc;
            protected  int beginIp82921ExprYy;
	
	/**
	* Constructor for Ip82921ExprYearSerialized
	**/
    public Ip82921ExprYearSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip82921ExprYearSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ExprYearSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip82921ExprYearSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,89); // serialize this field at offset 89 by default 
    }
    
	/**
	* sets parent for this Ip82921ExprYearSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 89 by default
    }    
	/**
	* initializes the field in Ip82921ExprYearSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_82921_EXPR_YEAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp82921ExprCc = getStartOffset() + 0;	// set offset for serialization
  
             beginIp82921ExprYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp82921ExprCcCounter = -1;
     public boolean isIp82921ExprCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ExprCcCounter != sharedCounter;
         localIp82921ExprCcCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_EXPR_CC_LEN = 2;
	/**
	 * 	serialize this Ip82921ExprCc
	 */
   protected void serializeIp82921ExprCc(char[] ip82921ExprCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ExprCc,0,getStringValue(),beginIp82921ExprCc,IP_82921_EXPR_CC_LEN);
       localIp82921ExprCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ExprCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp82921ExprCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ExprCc() {	 
   		return (substring(getStringValue(),beginIp82921ExprCc,beginIp82921ExprCc + IP_82921_EXPR_CC_LEN));
   	}
     int localIp82921ExprYyCounter = -1;
     public boolean isIp82921ExprYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ExprYyCounter != sharedCounter;
         localIp82921ExprYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_EXPR_YY_LEN = 2;
	/**
	 * 	serialize this Ip82921ExprYy
	 */
   protected void serializeIp82921ExprYy(char[] ip82921ExprYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ExprYy,0,getStringValue(),beginIp82921ExprYy,IP_82921_EXPR_YY_LEN);
       localIp82921ExprYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ExprYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp82921ExprYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ExprYy() {	 
   		return (substring(getStringValue(),beginIp82921ExprYy,beginIp82921ExprYy + IP_82921_EXPR_YY_LEN));
   	}




}
  
