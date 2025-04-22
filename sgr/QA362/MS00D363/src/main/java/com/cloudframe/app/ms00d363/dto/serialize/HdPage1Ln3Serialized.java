package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_3_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd13Cc;
            protected  int beginHd13AcqIss;
            protected  int beginHd13Proc;
            protected  int beginHd13Page;
	
	/**
	* Constructor for HdPage1Ln3Serialized
	**/
    public HdPage1Ln3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd13Cc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginHd13AcqIss = getStartOffset() + 59;	// set offset for serialization
  
             beginHd13Proc = getStartOffset() + 68;	// set offset for serialization
  
  
  
  
             beginHd13Page = getStartOffset() + 126;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHd13CcCounter = -1;
     public boolean isHd13CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd13CcCounter != sharedCounter;
         localHd13CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_13_CC_LEN = 1;
	/**
	 * 	serialize this Hd13Cc
	 */
   protected void serializeHd13Cc(char[] hd13Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd13Cc,0,getStringValue(),beginHd13Cc,HD_13_CC_LEN);
       localHd13CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd13CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd13Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd13Cc() {	 
   		return (substring(getStringValue(),beginHd13Cc,beginHd13Cc + HD_13_CC_LEN));
   	}
     int localHd13AcqIssCounter = -1;
     public boolean isHd13AcqIssModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd13AcqIssCounter != sharedCounter;
         localHd13AcqIssCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_13_ACQ_ISS_LEN = 9;
	/**
	 * 	serialize this Hd13AcqIss
	 */
   protected void serializeHd13AcqIss(char[] hd13AcqIss) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd13AcqIss,0,getStringValue(),beginHd13AcqIss,HD_13_ACQ_ISS_LEN);
       localHd13AcqIssCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd13AcqIssConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshHd13AcqIss is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd13AcqIss() {	 
   		return (substring(getStringValue(),beginHd13AcqIss,beginHd13AcqIss + HD_13_ACQ_ISS_LEN));
   	}
     int localHd13ProcCounter = -1;
     public boolean isHd13ProcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd13ProcCounter != sharedCounter;
         localHd13ProcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_13_PROC_LEN = 13;
	/**
	 * 	serialize this Hd13Proc
	 */
   protected void serializeHd13Proc(char[] hd13Proc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd13Proc,0,getStringValue(),beginHd13Proc,HD_13_PROC_LEN);
       localHd13ProcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd13ProcConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshHd13Proc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd13Proc() {	 
   		return (substring(getStringValue(),beginHd13Proc,beginHd13Proc + HD_13_PROC_LEN));
   	}
     int localHd13PageCounter = -1;
     public boolean isHd13PageModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd13PageCounter != sharedCounter;
         localHd13PageCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_13_PAGE_LEN = 5;
	/**
	 * 	serialize this Hd13Page
	 */
   protected void serializeHd13Page(char[] hd13Page) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd13Page,0,getStringValue(),beginHd13Page,HD_13_PAGE_LEN);
       localHd13PageCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd13PageConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshHd13Page is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd13Page() {	 
   		return (substring(getStringValue(),beginHd13Page,beginHd13Page + HD_13_PAGE_LEN));
   	}




}
  
