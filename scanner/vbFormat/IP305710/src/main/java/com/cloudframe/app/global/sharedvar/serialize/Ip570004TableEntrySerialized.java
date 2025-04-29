package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip570004TableEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip570004TableEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip570004TableEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_570004_TABLE_ENTRY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp570004Tbl57PcCabGrpPtr;
	
	/**
	* Constructor for Ip570004TableEntrySerialized
	**/
    public Ip570004TableEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip570004TableEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004TableEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip570004TableEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,18); // serialize this field at offset 18 by default 
    }
    
	/**
	* sets parent for this Ip570004TableEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 18 by default
    }    
	/**
	* initializes the field in Ip570004TableEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_570004_TABLE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp570004Tbl57PcCabGrpPtr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
        int localIp570004Tbl57PcCabGrpPtrCounter = -1;
        public boolean isIp570004Tbl57PcCabGrpPtrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp570004Tbl57PcCabGrpPtrCounter != sharedCounter;
           localIp570004Tbl57PcCabGrpPtrCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip570004Tbl57PcCabGrpPtrIsNumeric() {
	      return decimalIsNumeric(beginIp570004Tbl57PcCabGrpPtr,IP_570004_TBL_57_PC_CAB_GRP_PTR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_570004_TBL_57_PC_CAB_GRP_PTR_LEN = 6;
  	/**
	 * 	serializeIp570004Tbl57PcCabGrpPtr
	 */
	protected void serializeIp570004Tbl57PcCabGrpPtr(long ip570004Tbl57PcCabGrpPtr) {
		   putDecimal(beginIp570004Tbl57PcCabGrpPtr,ip570004Tbl57PcCabGrpPtr,IP_570004_TBL_57_PC_CAB_GRP_PTR_LEN,false);
   }
   

   protected long checkIp570004Tbl57PcCabGrpPtrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshIp570004Tbl57PcCabGrpPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp570004Tbl57PcCabGrpPtr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginIp570004Tbl57PcCabGrpPtr,IP_570004_TBL_57_PC_CAB_GRP_PTR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip570004Tbl57PcCabGrpPtr", beginIp570004Tbl57PcCabGrpPtr,IP_570004_TBL_57_PC_CAB_GRP_PTR_LEN);
     }
   	}




}
  
