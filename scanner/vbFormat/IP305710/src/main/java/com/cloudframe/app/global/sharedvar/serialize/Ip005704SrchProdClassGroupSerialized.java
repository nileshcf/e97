package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip005704SrchProdClassGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip005704SrchProdClassGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip005704SrchProdClassGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_005704_SRCH_PROD_CLASS_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp005704SrchProdClass;
	
	/**
	* Constructor for Ip005704SrchProdClassGroupSerialized
	**/
    public Ip005704SrchProdClassGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip005704SrchProdClassGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_005704_SRCH_PROD_CLASS_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp005704SrchProdClass = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp005704SrchProdClassCounter = -1;
     public boolean isIp005704SrchProdClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005704SrchProdClassCounter != sharedCounter;
         localIp005704SrchProdClassCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_005704_SRCH_PROD_CLASS_LEN = 1;
	/**
	 * 	serialize this Ip005704SrchProdClass
	 */
   protected void serializeIp005704SrchProdClass(char[] ip005704SrchProdClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip005704SrchProdClass,0,getStringValue(),beginIp005704SrchProdClass,IP_005704_SRCH_PROD_CLASS_LEN);
       localIp005704SrchProdClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp005704SrchProdClassConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp005704SrchProdClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp005704SrchProdClass() {	 
   		return (substring(getStringValue(),beginIp005704SrchProdClass,beginIp005704SrchProdClass + IP_005704_SRCH_PROD_CLASS_LEN));
   	}




}
  
