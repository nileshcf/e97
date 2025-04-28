package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class X86Int32Group800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X86Int32Group800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X86Int32Group800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_86_INT_32_GROUP_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX86Int32800;
	
	/**
	* Constructor for X86Int32Group800Serialized
	**/
    public X86Int32Group800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in X86Int32Group800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_86_INT_32_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX86Int32800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localX86Int32800Counter = -1;
         public boolean isX86Int32800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localX86Int32800Counter != sharedCounter;
            localX86Int32800Counter = sharedCounter; return hasModified; 
         }
   protected static final int X_86_INT_32800_LEN = 4;
  	/**
	 * serializeX86Int32800
	 */
	protected void serializeX86Int32800(int x86Int32800) {
           replaceValue( //  save the value as string
                   getBinaryString( x86Int32800,X_86_INT_32800_LEN)
                  ,beginX86Int32800
                  ,X_86_INT_32800_LEN
                 );
            localX86Int32800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkX86Int32800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshX86Int32800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX86Int32800() {	 
			return (getInt(beginX86Int32800));
   	}




}
  
