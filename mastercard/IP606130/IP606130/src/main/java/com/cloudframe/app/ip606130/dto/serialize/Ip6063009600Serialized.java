package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip6063009600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip6063009600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip6063009600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_6063009600_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTabSubId6003009;
	
	/**
	* Constructor for Ip6063009600Serialized
	**/
    public Ip6063009600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip6063009600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_6063009600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTabSubId6003009 = getStartOffset() + 14;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTabSubId6003009Counter = -1;
     public boolean isTabSubId6003009Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTabSubId6003009Counter != sharedCounter;
         localTabSubId6003009Counter = sharedCounter; return hasModified;
     }
	protected static final int TAB_SUB_ID_6003009_LEN = 3;
	/**
	 * 	serialize this TabSubId6003009
	 */
   protected void serializeTabSubId6003009(char[] tabSubId6003009) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tabSubId6003009,0,getStringValue(),beginTabSubId6003009,TAB_SUB_ID_6003009_LEN);
       localTabSubId6003009Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTabSubId6003009Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTabSubId6003009 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTabSubId6003009() {	 
   		return (substring(getStringValue(),beginTabSubId6003009,beginTabSubId6003009 + TAB_SUB_ID_6003009_LEN));
   	}




}
  
