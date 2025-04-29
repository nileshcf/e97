package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MciseqioParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciseqioParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciseqioParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCISEQIO_PARMS_LENGTH = 84;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciseqioDdname;
            protected  int beginMciseqioRequest;
            protected  int beginMciseqioSysid;
            protected  int beginMciseqioApplid;
            protected  int beginMciseqioDsn;
            protected  int beginMciseqioTapser;
            protected  int beginMciseqioVolser;
            protected  int beginMciseqioLabel;
            protected  int beginMciseqioRecfm;
            protected  int beginMciseqioLrecl;
            protected  int beginMciseqioBlksize;
	
	/**
	* Constructor for MciseqioParmsSerialized
	**/
    public MciseqioParmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciseqioParmsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioParmsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciseqioParmsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,41); // serialize this field at offset 41 by default 
    }
    
	/**
	* sets parent for this MciseqioParmsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 41 by default
    }    
	/**
	* initializes the field in MciseqioParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCISEQIO_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciseqioDdname = getStartOffset() + 0;	// set offset for serialization
  
             beginMciseqioRequest = getStartOffset() + 8;	// set offset for serialization
  
             beginMciseqioSysid = getStartOffset() + 10;	// set offset for serialization
  
             beginMciseqioApplid = getStartOffset() + 12;	// set offset for serialization
  
             beginMciseqioDsn = getStartOffset() + 20;	// set offset for serialization
  
             beginMciseqioTapser = getStartOffset() + 64;	// set offset for serialization
  
             beginMciseqioVolser = getStartOffset() + 70;	// set offset for serialization
  
             beginMciseqioLabel = getStartOffset() + 76;	// set offset for serialization
  
             beginMciseqioRecfm = getStartOffset() + 78;	// set offset for serialization
  
             beginMciseqioLrecl = getStartOffset() + 80;	// set offset for serialization
  
             beginMciseqioBlksize = getStartOffset() + 82;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMciseqioDdnameCounter = -1;
     public boolean isMciseqioDdnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioDdnameCounter != sharedCounter;
         localMciseqioDdnameCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_DDNAME_LEN = 8;
	/**
	 * 	serialize this MciseqioDdname
	 */
   protected void serializeMciseqioDdname(char[] mciseqioDdname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioDdname,0,getStringValue(),beginMciseqioDdname,MCISEQIO_DDNAME_LEN);
       localMciseqioDdnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioDdnameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMciseqioDdname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioDdname() {	 
   		return (substring(getStringValue(),beginMciseqioDdname,beginMciseqioDdname + MCISEQIO_DDNAME_LEN));
   	}
         int localMciseqioRequestCounter = -1;
         public boolean isMciseqioRequestModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioRequestCounter != sharedCounter;
            localMciseqioRequestCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_REQUEST_LEN = 2;
  	/**
	 * serializeMciseqioRequest
	 */
	protected void serializeMciseqioRequest(short mciseqioRequest) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioRequest,MCISEQIO_REQUEST_LEN)
                  ,beginMciseqioRequest
                  ,MCISEQIO_REQUEST_LEN
                 );
            localMciseqioRequestCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioRequestMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioRequest is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioRequest() {	 
			return (getShort(beginMciseqioRequest));
   	}
     int localMciseqioSysidCounter = -1;
     public boolean isMciseqioSysidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioSysidCounter != sharedCounter;
         localMciseqioSysidCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_SYSID_LEN = 2;
	/**
	 * 	serialize this MciseqioSysid
	 */
   protected void serializeMciseqioSysid(char[] mciseqioSysid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioSysid,0,getStringValue(),beginMciseqioSysid,MCISEQIO_SYSID_LEN);
       localMciseqioSysidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioSysidConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioSysid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioSysid() {	 
   		return (substring(getStringValue(),beginMciseqioSysid,beginMciseqioSysid + MCISEQIO_SYSID_LEN));
   	}
     int localMciseqioApplidCounter = -1;
     public boolean isMciseqioApplidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioApplidCounter != sharedCounter;
         localMciseqioApplidCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_APPLID_LEN = 8;
	/**
	 * 	serialize this MciseqioApplid
	 */
   protected void serializeMciseqioApplid(char[] mciseqioApplid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioApplid,0,getStringValue(),beginMciseqioApplid,MCISEQIO_APPLID_LEN);
       localMciseqioApplidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioApplidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMciseqioApplid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioApplid() {	 
   		return (substring(getStringValue(),beginMciseqioApplid,beginMciseqioApplid + MCISEQIO_APPLID_LEN));
   	}
     int localMciseqioDsnCounter = -1;
     public boolean isMciseqioDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioDsnCounter != sharedCounter;
         localMciseqioDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_DSN_LEN = 44;
	/**
	 * 	serialize this MciseqioDsn
	 */
   protected void serializeMciseqioDsn(char[] mciseqioDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioDsn,0,getStringValue(),beginMciseqioDsn,MCISEQIO_DSN_LEN);
       localMciseqioDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshMciseqioDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioDsn() {	 
   		return (substring(getStringValue(),beginMciseqioDsn,beginMciseqioDsn + MCISEQIO_DSN_LEN));
   	}
     int localMciseqioTapserCounter = -1;
     public boolean isMciseqioTapserModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioTapserCounter != sharedCounter;
         localMciseqioTapserCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_TAPSER_LEN = 6;
	/**
	 * 	serialize this MciseqioTapser
	 */
   protected void serializeMciseqioTapser(char[] mciseqioTapser) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioTapser,0,getStringValue(),beginMciseqioTapser,MCISEQIO_TAPSER_LEN);
       localMciseqioTapserCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioTapserConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMciseqioTapser is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioTapser() {	 
   		return (substring(getStringValue(),beginMciseqioTapser,beginMciseqioTapser + MCISEQIO_TAPSER_LEN));
   	}
     int localMciseqioVolserCounter = -1;
     public boolean isMciseqioVolserModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioVolserCounter != sharedCounter;
         localMciseqioVolserCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_VOLSER_LEN = 6;
	/**
	 * 	serialize this MciseqioVolser
	 */
   protected void serializeMciseqioVolser(char[] mciseqioVolser) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioVolser,0,getStringValue(),beginMciseqioVolser,MCISEQIO_VOLSER_LEN);
       localMciseqioVolserCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioVolserConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMciseqioVolser is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioVolser() {	 
   		return (substring(getStringValue(),beginMciseqioVolser,beginMciseqioVolser + MCISEQIO_VOLSER_LEN));
   	}
     int localMciseqioLabelCounter = -1;
     public boolean isMciseqioLabelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioLabelCounter != sharedCounter;
         localMciseqioLabelCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_LABEL_LEN = 2;
	/**
	 * 	serialize this MciseqioLabel
	 */
   protected void serializeMciseqioLabel(char[] mciseqioLabel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioLabel,0,getStringValue(),beginMciseqioLabel,MCISEQIO_LABEL_LEN);
       localMciseqioLabelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioLabelConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioLabel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioLabel() {	 
   		return (substring(getStringValue(),beginMciseqioLabel,beginMciseqioLabel + MCISEQIO_LABEL_LEN));
   	}
     int localMciseqioRecfmCounter = -1;
     public boolean isMciseqioRecfmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciseqioRecfmCounter != sharedCounter;
         localMciseqioRecfmCounter = sharedCounter; return hasModified;
     }
	protected static final int MCISEQIO_RECFM_LEN = 2;
	/**
	 * 	serialize this MciseqioRecfm
	 */
   protected void serializeMciseqioRecfm(char[] mciseqioRecfm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciseqioRecfm,0,getStringValue(),beginMciseqioRecfm,MCISEQIO_RECFM_LEN);
       localMciseqioRecfmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciseqioRecfmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMciseqioRecfm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciseqioRecfm() {	 
   		return (substring(getStringValue(),beginMciseqioRecfm,beginMciseqioRecfm + MCISEQIO_RECFM_LEN));
   	}
         int localMciseqioLreclCounter = -1;
         public boolean isMciseqioLreclModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioLreclCounter != sharedCounter;
            localMciseqioLreclCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_LRECL_LEN = 2;
  	/**
	 * serializeMciseqioLrecl
	 */
	protected void serializeMciseqioLrecl(short mciseqioLrecl) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioLrecl,MCISEQIO_LRECL_LEN)
                  ,beginMciseqioLrecl
                  ,MCISEQIO_LRECL_LEN
                 );
            localMciseqioLreclCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioLreclMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioLrecl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioLrecl() {	 
			return (getShort(beginMciseqioLrecl));
   	}
         int localMciseqioBlksizeCounter = -1;
         public boolean isMciseqioBlksizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioBlksizeCounter != sharedCounter;
            localMciseqioBlksizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_BLKSIZE_LEN = 2;
  	/**
	 * serializeMciseqioBlksize
	 */
	protected void serializeMciseqioBlksize(short mciseqioBlksize) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioBlksize,MCISEQIO_BLKSIZE_LEN)
                  ,beginMciseqioBlksize
                  ,MCISEQIO_BLKSIZE_LEN
                 );
            localMciseqioBlksizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioBlksizeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioBlksize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioBlksize() {	 
			return (getShort(beginMciseqioBlksize));
   	}




}
  
