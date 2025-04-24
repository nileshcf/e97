package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404ArRangeGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404ArRangeGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404ArRangeGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_AR_RANGE_GRP_LENGTH = 38;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404Tbl40ArH;
            protected  int beginIp00404Tbl40ArL;
	
	/**
	* Constructor for Ip00404ArRangeGrpSerialized
	**/
    public Ip00404ArRangeGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404ArRangeGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404ArRangeGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404ArRangeGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip00404ArRangeGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip00404ArRangeGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_AR_RANGE_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00404Tbl40ArH = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00404Tbl40ArL = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00404Tbl40ArHCounter = -1;
     public boolean isIp00404Tbl40ArHModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404Tbl40ArHCounter != sharedCounter;
         localIp00404Tbl40ArHCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_TBL_40_AR_H_LEN = 19;
	/**
	 * 	serialize this Ip00404Tbl40ArH
	 */
   protected void serializeIp00404Tbl40ArH(char[] ip00404Tbl40ArH) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404Tbl40ArH,0,getStringValue(),beginIp00404Tbl40ArH,IP_00404_TBL_40_AR_H_LEN);
       localIp00404Tbl40ArHCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404Tbl40ArHConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp00404Tbl40ArH is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404Tbl40ArH() {	 
   		return (substring(getStringValue(),beginIp00404Tbl40ArH,beginIp00404Tbl40ArH + IP_00404_TBL_40_AR_H_LEN));
   	}
     int localIp00404Tbl40ArLCounter = -1;
     public boolean isIp00404Tbl40ArLModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404Tbl40ArLCounter != sharedCounter;
         localIp00404Tbl40ArLCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_TBL_40_AR_L_LEN = 19;
	/**
	 * 	serialize this Ip00404Tbl40ArL
	 */
   protected void serializeIp00404Tbl40ArL(char[] ip00404Tbl40ArL) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404Tbl40ArL,0,getStringValue(),beginIp00404Tbl40ArL,IP_00404_TBL_40_AR_L_LEN);
       localIp00404Tbl40ArLCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404Tbl40ArLConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp00404Tbl40ArL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404Tbl40ArL() {	 
   		return (substring(getStringValue(),beginIp00404Tbl40ArL,beginIp00404Tbl40ArL + IP_00404_TBL_40_AR_L_LEN));
   	}




}
  
