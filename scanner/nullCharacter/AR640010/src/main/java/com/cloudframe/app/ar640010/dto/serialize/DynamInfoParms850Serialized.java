package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamInfoParms850Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DynamInfoParms850Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamInfoParms850Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_INFO_PARMS_850_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamInfoDd850;
            protected  int beginDynamInfoDsn850;
            protected  int beginDynamInfoMember850;
            protected  int beginDynamInfoStatus850;
            protected  int beginDynamInfoDisp850;
            protected  int beginDynamInfoCond850;
            protected  int beginDynamInfoDsorg850;
            protected  int beginDynamInfoLimit850;
            protected  int beginDynamInfoAttr850;
            protected  int beginDynamInfoEntry850;
            protected  int beginDynamInfoType850;
	
	/**
	* Constructor for DynamInfoParms850Serialized
	**/
    public DynamInfoParms850Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DynamInfoParms850Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamInfoParms850Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DynamInfoParms850Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,248); // serialize this field at offset 248 by default 
    }
    
	/**
	* sets parent for this DynamInfoParms850Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 248 by default
    }    
	/**
	* initializes the field in DynamInfoParms850Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_INFO_PARMS_850_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDynamInfoDd850 = getStartOffset() + 0;	// set offset for serialization
  
             beginDynamInfoDsn850 = getStartOffset() + 8;	// set offset for serialization
  
             beginDynamInfoMember850 = getStartOffset() + 52;	// set offset for serialization
  
             beginDynamInfoStatus850 = getStartOffset() + 60;	// set offset for serialization
  
             beginDynamInfoDisp850 = getStartOffset() + 61;	// set offset for serialization
  
             beginDynamInfoCond850 = getStartOffset() + 62;	// set offset for serialization
  
             beginDynamInfoDsorg850 = getStartOffset() + 63;	// set offset for serialization
  
             beginDynamInfoLimit850 = getStartOffset() + 65;	// set offset for serialization
  
             beginDynamInfoAttr850 = getStartOffset() + 67;	// set offset for serialization
  
             beginDynamInfoEntry850 = getStartOffset() + 68;	// set offset for serialization
  
             beginDynamInfoType850 = getStartOffset() + 69;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDynamInfoDd850Counter = -1;
     public boolean isDynamInfoDd850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoDd850Counter != sharedCounter;
         localDynamInfoDd850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_DD_850_LEN = 8;
	/**
	 * 	serialize this DynamInfoDd850
	 */
   protected void serializeDynamInfoDd850(char[] dynamInfoDd850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoDd850,0,getStringValue(),beginDynamInfoDd850,DYNAM_INFO_DD_850_LEN);
       localDynamInfoDd850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoDd850Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDynamInfoDd850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoDd850() {	 
   		return (substring(getStringValue(),beginDynamInfoDd850,beginDynamInfoDd850 + DYNAM_INFO_DD_850_LEN));
   	}
     int localDynamInfoDsn850Counter = -1;
     public boolean isDynamInfoDsn850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoDsn850Counter != sharedCounter;
         localDynamInfoDsn850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_DSN_850_LEN = 44;
	/**
	 * 	serialize this DynamInfoDsn850
	 */
   protected void serializeDynamInfoDsn850(char[] dynamInfoDsn850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoDsn850,0,getStringValue(),beginDynamInfoDsn850,DYNAM_INFO_DSN_850_LEN);
       localDynamInfoDsn850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoDsn850Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshDynamInfoDsn850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoDsn850() {	 
   		return (substring(getStringValue(),beginDynamInfoDsn850,beginDynamInfoDsn850 + DYNAM_INFO_DSN_850_LEN));
   	}
     int localDynamInfoMember850Counter = -1;
     public boolean isDynamInfoMember850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoMember850Counter != sharedCounter;
         localDynamInfoMember850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_MEMBER_850_LEN = 8;
	/**
	 * 	serialize this DynamInfoMember850
	 */
   protected void serializeDynamInfoMember850(char[] dynamInfoMember850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoMember850,0,getStringValue(),beginDynamInfoMember850,DYNAM_INFO_MEMBER_850_LEN);
       localDynamInfoMember850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoMember850Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDynamInfoMember850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoMember850() {	 
   		return (substring(getStringValue(),beginDynamInfoMember850,beginDynamInfoMember850 + DYNAM_INFO_MEMBER_850_LEN));
   	}
     int localDynamInfoStatus850Counter = -1;
     public boolean isDynamInfoStatus850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoStatus850Counter != sharedCounter;
         localDynamInfoStatus850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_STATUS_850_LEN = 1;
	/**
	 * 	serialize this DynamInfoStatus850
	 */
   protected void serializeDynamInfoStatus850(char[] dynamInfoStatus850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoStatus850,0,getStringValue(),beginDynamInfoStatus850,DYNAM_INFO_STATUS_850_LEN);
       localDynamInfoStatus850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoStatus850Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDynamInfoStatus850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoStatus850() {	 
   		return (substring(getStringValue(),beginDynamInfoStatus850,beginDynamInfoStatus850 + DYNAM_INFO_STATUS_850_LEN));
   	}
     int localDynamInfoDisp850Counter = -1;
     public boolean isDynamInfoDisp850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoDisp850Counter != sharedCounter;
         localDynamInfoDisp850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_DISP_850_LEN = 1;
	/**
	 * 	serialize this DynamInfoDisp850
	 */
   protected void serializeDynamInfoDisp850(char[] dynamInfoDisp850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoDisp850,0,getStringValue(),beginDynamInfoDisp850,DYNAM_INFO_DISP_850_LEN);
       localDynamInfoDisp850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoDisp850Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDynamInfoDisp850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoDisp850() {	 
   		return (substring(getStringValue(),beginDynamInfoDisp850,beginDynamInfoDisp850 + DYNAM_INFO_DISP_850_LEN));
   	}
     int localDynamInfoCond850Counter = -1;
     public boolean isDynamInfoCond850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoCond850Counter != sharedCounter;
         localDynamInfoCond850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_COND_850_LEN = 1;
	/**
	 * 	serialize this DynamInfoCond850
	 */
   protected void serializeDynamInfoCond850(char[] dynamInfoCond850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoCond850,0,getStringValue(),beginDynamInfoCond850,DYNAM_INFO_COND_850_LEN);
       localDynamInfoCond850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoCond850Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDynamInfoCond850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoCond850() {	 
   		return (substring(getStringValue(),beginDynamInfoCond850,beginDynamInfoCond850 + DYNAM_INFO_COND_850_LEN));
   	}
     int localDynamInfoDsorg850Counter = -1;
     public boolean isDynamInfoDsorg850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoDsorg850Counter != sharedCounter;
         localDynamInfoDsorg850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_DSORG_850_LEN = 2;
	/**
	 * 	serialize this DynamInfoDsorg850
	 */
   protected void serializeDynamInfoDsorg850(char[] dynamInfoDsorg850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoDsorg850,0,getStringValue(),beginDynamInfoDsorg850,DYNAM_INFO_DSORG_850_LEN);
       localDynamInfoDsorg850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoDsorg850Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDynamInfoDsorg850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoDsorg850() {	 
   		return (substring(getStringValue(),beginDynamInfoDsorg850,beginDynamInfoDsorg850 + DYNAM_INFO_DSORG_850_LEN));
   	}
         int localDynamInfoLimit850Counter = -1;
         public boolean isDynamInfoLimit850Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDynamInfoLimit850Counter != sharedCounter;
            localDynamInfoLimit850Counter = sharedCounter; return hasModified; 
         }
   protected static final int DYNAM_INFO_LIMIT_850_LEN = 2;
  	/**
	 * serializeDynamInfoLimit850
	 */
	protected void serializeDynamInfoLimit850(short dynamInfoLimit850) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamInfoLimit850,DYNAM_INFO_LIMIT_850_LEN)
                  ,beginDynamInfoLimit850
                  ,DYNAM_INFO_LIMIT_850_LEN
                 );
            localDynamInfoLimit850Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDynamInfoLimit850MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDynamInfoLimit850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDynamInfoLimit850() {	 
			return (getShort(beginDynamInfoLimit850));
   	}
     int localDynamInfoAttr850Counter = -1;
     public boolean isDynamInfoAttr850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoAttr850Counter != sharedCounter;
         localDynamInfoAttr850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_ATTR_850_LEN = 1;
	/**
	 * 	serialize this DynamInfoAttr850
	 */
   protected void serializeDynamInfoAttr850(char[] dynamInfoAttr850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoAttr850,0,getStringValue(),beginDynamInfoAttr850,DYNAM_INFO_ATTR_850_LEN);
       localDynamInfoAttr850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoAttr850Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDynamInfoAttr850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoAttr850() {	 
   		return (substring(getStringValue(),beginDynamInfoAttr850,beginDynamInfoAttr850 + DYNAM_INFO_ATTR_850_LEN));
   	}
     int localDynamInfoEntry850Counter = -1;
     public boolean isDynamInfoEntry850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoEntry850Counter != sharedCounter;
         localDynamInfoEntry850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_ENTRY_850_LEN = 1;
	/**
	 * 	serialize this DynamInfoEntry850
	 */
   protected void serializeDynamInfoEntry850(char[] dynamInfoEntry850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoEntry850,0,getStringValue(),beginDynamInfoEntry850,DYNAM_INFO_ENTRY_850_LEN);
       localDynamInfoEntry850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoEntry850Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDynamInfoEntry850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoEntry850() {	 
   		return (substring(getStringValue(),beginDynamInfoEntry850,beginDynamInfoEntry850 + DYNAM_INFO_ENTRY_850_LEN));
   	}
     int localDynamInfoType850Counter = -1;
     public boolean isDynamInfoType850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamInfoType850Counter != sharedCounter;
         localDynamInfoType850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_INFO_TYPE_850_LEN = 1;
	/**
	 * 	serialize this DynamInfoType850
	 */
   protected void serializeDynamInfoType850(char[] dynamInfoType850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamInfoType850,0,getStringValue(),beginDynamInfoType850,DYNAM_INFO_TYPE_850_LEN);
       localDynamInfoType850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamInfoType850Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDynamInfoType850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamInfoType850() {	 
   		return (substring(getStringValue(),beginDynamInfoType850,beginDynamInfoType850 + DYNAM_INFO_TYPE_850_LEN));
   	}




}
  
