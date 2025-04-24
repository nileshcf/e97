package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50211FacDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50211FacDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50211FacDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50211_FAC_DATA_KEY_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50211PrimaryAcctNbr;
	
	/**
	* Constructor for Ip50211FacDataKeySerialized
	**/
    public Ip50211FacDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50211FacDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211FacDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50211FacDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50211FacDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50211FacDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50211_FAC_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50211PrimaryAcctNbr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp50211PrimaryAcctNbrCounter = -1;
     public boolean isIp50211PrimaryAcctNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211PrimaryAcctNbrCounter != sharedCounter;
         localIp50211PrimaryAcctNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_PRIMARY_ACCT_NBR_LEN = 19;
	/**
	 * 	serialize this Ip50211PrimaryAcctNbr
	 */
   protected void serializeIp50211PrimaryAcctNbr(char[] ip50211PrimaryAcctNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211PrimaryAcctNbr,0,getStringValue(),beginIp50211PrimaryAcctNbr,IP_50211_PRIMARY_ACCT_NBR_LEN);
       localIp50211PrimaryAcctNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211PrimaryAcctNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp50211PrimaryAcctNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211PrimaryAcctNbr() {	 
   		return (substring(getStringValue(),beginIp50211PrimaryAcctNbr,beginIp50211PrimaryAcctNbr + IP_50211_PRIMARY_ACCT_NBR_LEN));
   	}




}
  
