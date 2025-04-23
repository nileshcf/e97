package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66605IpmFileInformationSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66605IpmFileInformationSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66605IpmFileInformationSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66605_IPM_FILE_INFORMATION_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66605IsIpmFileFinished;
            protected  int beginIp66605IsIpmFileTagged;
            protected  int beginIp66605WriteToFileSw;
            protected  int beginIp66605DoIWrite800Pdses;
	
	/**
	* Constructor for Ip66605IpmFileInformationSerialized
	**/
    public Ip66605IpmFileInformationSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip66605IpmFileInformationSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66605IpmFileInformationSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip66605IpmFileInformationSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip66605IpmFileInformationSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip66605IpmFileInformationSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66605_IPM_FILE_INFORMATION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66605IsIpmFileFinished = getStartOffset() + 0;	// set offset for serialization
  
             beginIp66605IsIpmFileTagged = getStartOffset() + 1;	// set offset for serialization
  
             beginIp66605WriteToFileSw = getStartOffset() + 2;	// set offset for serialization
  
             beginIp66605DoIWrite800Pdses = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp66605IsIpmFileFinishedCounter = -1;
     public boolean isIp66605IsIpmFileFinishedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66605IsIpmFileFinishedCounter != sharedCounter;
         localIp66605IsIpmFileFinishedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66605_IS_IPM_FILE_FINISHED_LEN = 1;
	/**
	 * 	serialize this Ip66605IsIpmFileFinished
	 */
   protected void serializeIp66605IsIpmFileFinished(char[] ip66605IsIpmFileFinished) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66605IsIpmFileFinished,0,getStringValue(),beginIp66605IsIpmFileFinished,IP_66605_IS_IPM_FILE_FINISHED_LEN);
       localIp66605IsIpmFileFinishedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66605IsIpmFileFinishedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66605IsIpmFileFinished is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66605IsIpmFileFinished() {	 
   		return (substring(getStringValue(),beginIp66605IsIpmFileFinished,beginIp66605IsIpmFileFinished + IP_66605_IS_IPM_FILE_FINISHED_LEN));
   	}
     int localIp66605IsIpmFileTaggedCounter = -1;
     public boolean isIp66605IsIpmFileTaggedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66605IsIpmFileTaggedCounter != sharedCounter;
         localIp66605IsIpmFileTaggedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66605_IS_IPM_FILE_TAGGED_LEN = 1;
	/**
	 * 	serialize this Ip66605IsIpmFileTagged
	 */
   protected void serializeIp66605IsIpmFileTagged(char[] ip66605IsIpmFileTagged) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66605IsIpmFileTagged,0,getStringValue(),beginIp66605IsIpmFileTagged,IP_66605_IS_IPM_FILE_TAGGED_LEN);
       localIp66605IsIpmFileTaggedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66605IsIpmFileTaggedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66605IsIpmFileTagged is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66605IsIpmFileTagged() {	 
   		return (substring(getStringValue(),beginIp66605IsIpmFileTagged,beginIp66605IsIpmFileTagged + IP_66605_IS_IPM_FILE_TAGGED_LEN));
   	}
     int localIp66605WriteToFileSwCounter = -1;
     public boolean isIp66605WriteToFileSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66605WriteToFileSwCounter != sharedCounter;
         localIp66605WriteToFileSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66605_WRITE_TO_FILE_SW_LEN = 1;
	/**
	 * 	serialize this Ip66605WriteToFileSw
	 */
   protected void serializeIp66605WriteToFileSw(char[] ip66605WriteToFileSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66605WriteToFileSw,0,getStringValue(),beginIp66605WriteToFileSw,IP_66605_WRITE_TO_FILE_SW_LEN);
       localIp66605WriteToFileSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66605WriteToFileSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66605WriteToFileSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66605WriteToFileSw() {	 
   		return (substring(getStringValue(),beginIp66605WriteToFileSw,beginIp66605WriteToFileSw + IP_66605_WRITE_TO_FILE_SW_LEN));
   	}
     int localIp66605DoIWrite800PdsesCounter = -1;
     public boolean isIp66605DoIWrite800PdsesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66605DoIWrite800PdsesCounter != sharedCounter;
         localIp66605DoIWrite800PdsesCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66605_DO_IWRITE_800_PDSES_LEN = 1;
	/**
	 * 	serialize this Ip66605DoIWrite800Pdses
	 */
   protected void serializeIp66605DoIWrite800Pdses(char[] ip66605DoIWrite800Pdses) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66605DoIWrite800Pdses,0,getStringValue(),beginIp66605DoIWrite800Pdses,IP_66605_DO_IWRITE_800_PDSES_LEN);
       localIp66605DoIWrite800PdsesCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66605DoIWrite800PdsesConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66605DoIWrite800Pdses is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66605DoIWrite800Pdses() {	 
   		return (substring(getStringValue(),beginIp66605DoIWrite800Pdses,beginIp66605DoIWrite800Pdses + IP_66605_DO_IWRITE_800_PDSES_LEN));
   	}




}
  
