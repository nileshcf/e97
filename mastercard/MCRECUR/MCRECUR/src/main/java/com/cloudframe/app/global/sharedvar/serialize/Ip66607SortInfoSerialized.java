package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66607SortInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66607SortInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66607SortInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66607_SORT_INFO_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66607Start;
            protected  int beginIp66607End;
	
	/**
	* Constructor for Ip66607SortInfoSerialized
	**/
    public Ip66607SortInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip66607SortInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66607_SORT_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66607Start = getStartOffset() + 0;	// set offset for serialization
  
             beginIp66607End = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp66607StartCounter = -1;
         public boolean isIp66607StartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66607StartCounter != sharedCounter;
            localIp66607StartCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66607_START_LEN = 4;
  	/**
	 * serializeIp66607Start
	 */
	protected void serializeIp66607Start(int ip66607Start) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66607Start,IP_66607_START_LEN)
                  ,beginIp66607Start
                  ,IP_66607_START_LEN
                 );
            localIp66607StartCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp66607StartMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp66607Start is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp66607Start() {	 
			return (getInt(beginIp66607Start));
   	}
         int localIp66607EndCounter = -1;
         public boolean isIp66607EndModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66607EndCounter != sharedCounter;
            localIp66607EndCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66607_END_LEN = 4;
  	/**
	 * serializeIp66607End
	 */
	protected void serializeIp66607End(int ip66607End) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66607End,IP_66607_END_LEN)
                  ,beginIp66607End
                  ,IP_66607_END_LEN
                 );
            localIp66607EndCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp66607EndMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp66607End is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp66607End() {	 
			return (getInt(beginIp66607End));
   	}




}
  
