package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ApplExitWork810Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ApplExitWork810Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ApplExitWork810Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int APPL_EXIT_WORK_810_LENGTH = 102;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginApplExitDsnLen810;
            protected  int beginApplExitMbrLen810;
            protected  int beginApplExitDsnDlm810;
            protected  int beginApplExitMbrDlm810;
            protected  int beginApplExitDsn810;
            protected  int beginApplExitMbr810;
            protected  int beginApplExitWrk810;
	
	/**
	* Constructor for ApplExitWork810Serialized
	**/
    public ApplExitWork810Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ApplExitWork810Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplExitWork810Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ApplExitWork810Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,275); // serialize this field at offset 275 by default 
    }
    
	/**
	* sets parent for this ApplExitWork810Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 275 by default
    }    
	/**
	* initializes the field in ApplExitWork810Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(APPL_EXIT_WORK_810_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginApplExitDsnLen810 = getStartOffset() + 0;	// set offset for serialization
  
             beginApplExitMbrLen810 = getStartOffset() + 2;	// set offset for serialization
  
             beginApplExitDsnDlm810 = getStartOffset() + 4;	// set offset for serialization
  
             beginApplExitMbrDlm810 = getStartOffset() + 5;	// set offset for serialization
  
             beginApplExitDsn810 = getStartOffset() + 6;	// set offset for serialization
  
             beginApplExitMbr810 = getStartOffset() + 50;	// set offset for serialization
  
             beginApplExitWrk810 = getStartOffset() + 58;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localApplExitDsnLen810Counter = -1;
         public boolean isApplExitDsnLen810Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localApplExitDsnLen810Counter != sharedCounter;
            localApplExitDsnLen810Counter = sharedCounter; return hasModified; 
         }
   protected static final int APPL_EXIT_DSN_LEN_810_LEN = 2;
  	/**
	 * serializeApplExitDsnLen810
	 */
	protected void serializeApplExitDsnLen810(short applExitDsnLen810) {
           replaceValue( //  save the value as string
                   getBinaryString( applExitDsnLen810,APPL_EXIT_DSN_LEN_810_LEN)
                  ,beginApplExitDsnLen810
                  ,APPL_EXIT_DSN_LEN_810_LEN
                 );
            localApplExitDsnLen810Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkApplExitDsnLen810MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshApplExitDsnLen810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshApplExitDsnLen810() {	 
			return (getShort(beginApplExitDsnLen810));
   	}
         int localApplExitMbrLen810Counter = -1;
         public boolean isApplExitMbrLen810Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localApplExitMbrLen810Counter != sharedCounter;
            localApplExitMbrLen810Counter = sharedCounter; return hasModified; 
         }
   protected static final int APPL_EXIT_MBR_LEN_810_LEN = 2;
  	/**
	 * serializeApplExitMbrLen810
	 */
	protected void serializeApplExitMbrLen810(short applExitMbrLen810) {
           replaceValue( //  save the value as string
                   getBinaryString( applExitMbrLen810,APPL_EXIT_MBR_LEN_810_LEN)
                  ,beginApplExitMbrLen810
                  ,APPL_EXIT_MBR_LEN_810_LEN
                 );
            localApplExitMbrLen810Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkApplExitMbrLen810MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshApplExitMbrLen810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshApplExitMbrLen810() {	 
			return (getShort(beginApplExitMbrLen810));
   	}
     int localApplExitDsnDlm810Counter = -1;
     public boolean isApplExitDsnDlm810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplExitDsnDlm810Counter != sharedCounter;
         localApplExitDsnDlm810Counter = sharedCounter; return hasModified;
     }
	protected static final int APPL_EXIT_DSN_DLM_810_LEN = 1;
	/**
	 * 	serialize this ApplExitDsnDlm810
	 */
   protected void serializeApplExitDsnDlm810(char[] applExitDsnDlm810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applExitDsnDlm810,0,getStringValue(),beginApplExitDsnDlm810,APPL_EXIT_DSN_DLM_810_LEN);
       localApplExitDsnDlm810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplExitDsnDlm810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshApplExitDsnDlm810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplExitDsnDlm810() {	 
   		return (substring(getStringValue(),beginApplExitDsnDlm810,beginApplExitDsnDlm810 + APPL_EXIT_DSN_DLM_810_LEN));
   	}
     int localApplExitMbrDlm810Counter = -1;
     public boolean isApplExitMbrDlm810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplExitMbrDlm810Counter != sharedCounter;
         localApplExitMbrDlm810Counter = sharedCounter; return hasModified;
     }
	protected static final int APPL_EXIT_MBR_DLM_810_LEN = 1;
	/**
	 * 	serialize this ApplExitMbrDlm810
	 */
   protected void serializeApplExitMbrDlm810(char[] applExitMbrDlm810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applExitMbrDlm810,0,getStringValue(),beginApplExitMbrDlm810,APPL_EXIT_MBR_DLM_810_LEN);
       localApplExitMbrDlm810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplExitMbrDlm810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshApplExitMbrDlm810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplExitMbrDlm810() {	 
   		return (substring(getStringValue(),beginApplExitMbrDlm810,beginApplExitMbrDlm810 + APPL_EXIT_MBR_DLM_810_LEN));
   	}
     int localApplExitDsn810Counter = -1;
     public boolean isApplExitDsn810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplExitDsn810Counter != sharedCounter;
         localApplExitDsn810Counter = sharedCounter; return hasModified;
     }
	protected static final int APPL_EXIT_DSN_810_LEN = 44;
	/**
	 * 	serialize this ApplExitDsn810
	 */
   protected void serializeApplExitDsn810(char[] applExitDsn810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applExitDsn810,0,getStringValue(),beginApplExitDsn810,APPL_EXIT_DSN_810_LEN);
       localApplExitDsn810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplExitDsn810Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshApplExitDsn810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplExitDsn810() {	 
   		return (substring(getStringValue(),beginApplExitDsn810,beginApplExitDsn810 + APPL_EXIT_DSN_810_LEN));
   	}
     int localApplExitMbr810Counter = -1;
     public boolean isApplExitMbr810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplExitMbr810Counter != sharedCounter;
         localApplExitMbr810Counter = sharedCounter; return hasModified;
     }
	protected static final int APPL_EXIT_MBR_810_LEN = 8;
	/**
	 * 	serialize this ApplExitMbr810
	 */
   protected void serializeApplExitMbr810(char[] applExitMbr810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applExitMbr810,0,getStringValue(),beginApplExitMbr810,APPL_EXIT_MBR_810_LEN);
       localApplExitMbr810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplExitMbr810Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshApplExitMbr810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplExitMbr810() {	 
   		return (substring(getStringValue(),beginApplExitMbr810,beginApplExitMbr810 + APPL_EXIT_MBR_810_LEN));
   	}
     int localApplExitWrk810Counter = -1;
     public boolean isApplExitWrk810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplExitWrk810Counter != sharedCounter;
         localApplExitWrk810Counter = sharedCounter; return hasModified;
     }
	protected static final int APPL_EXIT_WRK_810_LEN = 44;
	/**
	 * 	serialize this ApplExitWrk810
	 */
   protected void serializeApplExitWrk810(char[] applExitWrk810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applExitWrk810,0,getStringValue(),beginApplExitWrk810,APPL_EXIT_WRK_810_LEN);
       localApplExitWrk810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplExitWrk810Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshApplExitWrk810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplExitWrk810() {	 
   		return (substring(getStringValue(),beginApplExitWrk810,beginApplExitWrk810 + APPL_EXIT_WRK_810_LEN));
   	}




}
  
