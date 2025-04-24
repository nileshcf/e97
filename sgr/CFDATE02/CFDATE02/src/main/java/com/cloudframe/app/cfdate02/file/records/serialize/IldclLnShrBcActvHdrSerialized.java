package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class IldclLnShrBcActvHdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IldclLnShrBcActvHdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IldclLnShrBcActvHdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ILDCL_LN_SHR_BC_ACTV_HDR_LENGTH = 350;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIldclCustomerHeaderRec;
	
	/**
	* Constructor for IldclLnShrBcActvHdrSerialized
	**/
    public IldclLnShrBcActvHdrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IldclLnShrBcActvHdrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldclLnShrBcActvHdrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IldclLnShrBcActvHdrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IldclLnShrBcActvHdrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IldclLnShrBcActvHdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ILDCL_LN_SHR_BC_ACTV_HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIldclCustomerHeaderRec = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIldclCustomerHeaderRecCounter = -1;
     public boolean isIldclCustomerHeaderRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIldclCustomerHeaderRecCounter != sharedCounter;
         localIldclCustomerHeaderRecCounter = sharedCounter; return hasModified;
     }
	protected static final int ILDCL_CUSTOMER_HEADER_REC_LEN = 329;
	/**
	 * 	serialize this IldclCustomerHeaderRec
	 */
   protected void serializeIldclCustomerHeaderRec(char[] ildclCustomerHeaderRec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ildclCustomerHeaderRec,0,getStringValue(),beginIldclCustomerHeaderRec,ILDCL_CUSTOMER_HEADER_REC_LEN);
       localIldclCustomerHeaderRecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIldclCustomerHeaderRecConstraints(char[] value) {
   			return super.checkConstraints(value , 329 ,false, false);
   }
    /**
	 *	refreshIldclCustomerHeaderRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIldclCustomerHeaderRec() {	 
   		return (substring(getStringValue(),beginIldclCustomerHeaderRec,beginIldclCustomerHeaderRec + ILDCL_CUSTOMER_HEADER_REC_LEN));
   	}




}
  
