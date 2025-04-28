package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Ip82921FacDataKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip82921FacDataKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip82921FacDataKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_82921_FAC_DATA_KEY_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp82921PrimaryAcctNbr;
	
	/**
	* Constructor for Ip82921FacDataKeySerialized
	**/
    public Ip82921FacDataKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip82921FacDataKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FacDataKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip82921FacDataKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,68); // serialize this field at offset 68 by default 
    }
    
	/**
	* sets parent for this Ip82921FacDataKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 68 by default
    }    
	/**
	* initializes the field in Ip82921FacDataKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_82921_FAC_DATA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp82921PrimaryAcctNbr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp82921PrimaryAcctNbrCounter = -1;
     public boolean isIp82921PrimaryAcctNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921PrimaryAcctNbrCounter != sharedCounter;
         localIp82921PrimaryAcctNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_PRIMARY_ACCT_NBR_LEN = 19;
	/**
	 * 	serialize this Ip82921PrimaryAcctNbr
	 */
   protected void serializeIp82921PrimaryAcctNbr(char[] ip82921PrimaryAcctNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921PrimaryAcctNbr,0,getStringValue(),beginIp82921PrimaryAcctNbr,IP_82921_PRIMARY_ACCT_NBR_LEN);
       localIp82921PrimaryAcctNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921PrimaryAcctNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp82921PrimaryAcctNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921PrimaryAcctNbr() {	 
   		return (substring(getStringValue(),beginIp82921PrimaryAcctNbr,beginIp82921PrimaryAcctNbr + IP_82921_PRIMARY_ACCT_NBR_LEN));
   	}




}
  
